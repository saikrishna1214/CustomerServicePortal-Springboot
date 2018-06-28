package org.imaginea.requesttracking.service;

import java.util.List;

import org.imaginea.requesttracking.entity.Activities;
import org.imaginea.requesttracking.entity.ServiceRequest;

public interface ActivityService {
	
	public List<Activities> getActivities(int srNumber);
	
	public void createActivity(ServiceRequest serviceRequest);
	
	public Activities getActivity(int activityId);
	
	public void deleteActivity(int activityId);

}
