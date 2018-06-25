package org.imaginea.requesttracking.controller;

import org.imaginea.requesttracking.dto.Result;
import org.imaginea.requesttracking.service.impl.ActivityServiceImpl;
import org.imaginea.requesttracking.util.BuildResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
	
	@Autowired
	private ActivityServiceImpl activityService;

	@RequestMapping(value = "servicerequests/{srNumber}/activities", method = RequestMethod.GET)
	public Result getActivities(@PathVariable("srNumber") int number) {
		
		return BuildResponse.buildSuccessMessage(activityService.getActivities(number));
	}
	
	@RequestMapping(value = "servicerequests/{srNumber}/activities/{activityId}" , method = RequestMethod.GET)
	public Result getActivity(@PathVariable("activityId") int id) {
		
		return BuildResponse.buildSuccessMessage(activityService.getActivity(id));
	}
	
	@RequestMapping(value = "servicerequests/{srNumber}/activities/{activityId}" , method = RequestMethod.DELETE)
	public void deleteActivity(@PathVariable("activityId") int activityId) {
		
		activityService.deleteActivity(activityId);
	}
}
