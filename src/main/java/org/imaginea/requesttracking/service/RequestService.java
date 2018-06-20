package org.imaginea.requesttracking.service;

import java.util.List;

import org.imaginea.requesttracking.entity.ServiceRequest;

public interface RequestService {

public List<ServiceRequest> getAllServiceRequests();
	
	public ServiceRequest createServiceRequest(ServiceRequest serviceRequest, int accountId , int contactId);
	
	public ServiceRequest getServiceRequest(int serviceId);
	
	public ServiceRequest updateServiceRequest(ServiceRequest serviceRequest, int serviceId);
	
	public void deleteServiceRequest(int serviceId);
}
