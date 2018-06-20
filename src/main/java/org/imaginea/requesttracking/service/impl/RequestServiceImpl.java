package org.imaginea.requesttracking.service.impl;

import java.util.Date;
import java.util.List;
import org.imaginea.requesttracking.dao.AccountDAO;
import org.imaginea.requesttracking.dao.ContactDAO;
import org.imaginea.requesttracking.dao.ServiceRequestDAO;
import org.imaginea.requesttracking.entity.ServiceRequest;
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
	
	@Override
	public List<ServiceRequest> getAllServiceRequests() {
		
		return serviceRequestDAO.findAll();
	}

	@Override
	public ServiceRequest createServiceRequest(ServiceRequest serviceRequest, int accountId, int contactId) {
		
		serviceRequest.setAccount(accountDAO.findById(accountId).get());
		serviceRequest.setContact(contactDAO.findById(accountId).get());
		serviceRequest.setOpendate(new Date());
		serviceRequest.setStatus("Active");
		return serviceRequestDAO.save(serviceRequest);
	}

	@Override
	public ServiceRequest getServiceRequest(int serviceId) {
		
		return serviceRequestDAO.findById(serviceId).get();
	}

	@Override
	public ServiceRequest updateServiceRequest(ServiceRequest serviceRequest, int serviceId) {
		
		serviceRequest.setSrnumber(serviceId);
		return serviceRequestDAO.save(serviceRequest);
	}

	@Override
	public void deleteServiceRequest(int serviceId) {
		
		serviceRequestDAO.deleteById(serviceId);
	}

}
