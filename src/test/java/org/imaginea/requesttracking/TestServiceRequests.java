package org.imaginea.requesttracking;

import org.imaginea.requesttracking.entity.ServiceRequest;
import org.imaginea.requesttracking.service.impl.RequestServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestServiceRequests extends CustomerServicePortalTests {

	@Autowired
	private RequestServiceImpl requestService;
	
	@Test
	public void testServiceRequest() {
		
		Assert.assertNotNull(requestService.getAllServiceRequests());
	}
	
	@Test
	public void testAddServiceRequest() {
		
		
	}
}
