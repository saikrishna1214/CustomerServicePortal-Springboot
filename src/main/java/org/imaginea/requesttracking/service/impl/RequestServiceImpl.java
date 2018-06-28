package org.imaginea.requesttracking.service.impl;

import java.util.Date;
import java.util.List;
import org.imaginea.requesttracking.dao.AccountDAO;
import org.imaginea.requesttracking.dao.ContactDAO;
import org.imaginea.requesttracking.dao.ServiceRequestDAO;
import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.entity.ServiceRequest;
import org.imaginea.requesttracking.exception.CustomerServicePortalException;
import org.imaginea.requesttracking.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService {

	@Autowired
	private ServiceRequestDAO serviceRequestDAO;
	
	@Autowired
	private AccountDAO accountDAO;
	
	@Autowired
	private ContactDAO contactDAO;
	
	@Autowired
	private ActivityServiceImpl activityservice;
	
	@Override
	public List<ServiceRequest> getAllServiceRequests() {
		
		return serviceRequestDAO.findAll();
	}

	@Override
	public ServiceRequest createServiceRequest(ServiceRequest serviceRequest, int accountId, int contactId) {
		
		Account account  = accountDAO.findById(accountId).orElseThrow(() -> new CustomerServicePortalException("No such Customer"));
		serviceRequest.setAccount(account);
		serviceRequest.setContact(contactDAO.findById(contactId).orElseThrow(() -> new CustomerServicePortalException("No such Customer")));
		serviceRequest.setContactid(contactId);
		serviceRequest.setOpendate(new Date());
		serviceRequest.setStatus("Active");
		ServiceRequest serviceRequest2 =  serviceRequestDAO.save(serviceRequest);
		activityservice.createActivity(serviceRequest2);
		return serviceRequest2;
	}

	@Override
	public ServiceRequest getServiceRequest(int serviceId) {
		
		return serviceRequestDAO.findById(serviceId).get();
	}

	@Override
	public ServiceRequest updateServiceRequest(ServiceRequest serviceRequest, int serviceId) {
		
		ServiceRequest serviceRequest2 = serviceRequestDAO.findById(serviceId).get();
		serviceRequest2.setDescription(serviceRequest.getDescription());
		serviceRequest2.setStatus(serviceRequest.getStatus());
		ServiceRequest serviceRequest3 =  serviceRequestDAO.save(serviceRequest2);
		activityservice.createActivity(serviceRequest3);
		return serviceRequest3;
	}

	@Override
	public void deleteServiceRequest(int serviceId) {
		
		serviceRequestDAO.deleteById(serviceId);
	}

}
