package org.imaginea.requesttracking.controller;

import org.imaginea.requesttracking.dto.Result;
import org.imaginea.requesttracking.entity.ServiceRequest;
import org.imaginea.requesttracking.service.RequestService;
import org.imaginea.requesttracking.util.BuildResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	
	@Autowired
	private RequestService requestService;
	
	@RequestMapping(value="/servicerequests", method = RequestMethod.GET)
	public Result getAllServicerRequests() {
		
		return BuildResponse.buildSuccessMessage(requestService.getAllServiceRequests());
	}
	
	@RequestMapping(value="/servicerequests/{serviceId}", method = RequestMethod.GET)
	public Result getAccount(@PathVariable("serviceId") int serviceId) {
		
		return BuildResponse.buildSuccessMessage(requestService.getServiceRequest(serviceId));
	}
	
	@RequestMapping(value="/accounts/{accountId}/contacts/{contactId}/servicerequests", method = RequestMethod.POST)
	public Result creatServiceRequest(@RequestBody ServiceRequest serviceRequest, @PathVariable("accountId") int accountId, @PathVariable("contactId") int contactId) {
		return BuildResponse.buildSuccessMessage(requestService.createServiceRequest(serviceRequest,accountId,contactId));
	}
	
	@RequestMapping(value="/servicerequests/{serviceId}", method = RequestMethod.PUT)
	public Result updateServcieRequest(@RequestBody ServiceRequest serviceRequest, @PathVariable("serviceId") int id) {
		return BuildResponse.buildSuccessMessage(requestService.updateServiceRequest(serviceRequest,id));
	}

	@RequestMapping(value="/servicerequests/{serviceId}", method = RequestMethod.DELETE)
	public void deleteServiceRequest(@PathVariable("serviceId") int id) {
		requestService.deleteServiceRequest(id);
	}

}
