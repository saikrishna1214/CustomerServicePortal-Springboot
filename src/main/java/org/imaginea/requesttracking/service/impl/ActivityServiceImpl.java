package org.imaginea.requesttracking.service.impl;

import java.util.Date;
import java.util.List;

import org.imaginea.requesttracking.dao.ActivityDAO;
import org.imaginea.requesttracking.entity.Activities;
import org.imaginea.requesttracking.entity.ServiceRequest;
import org.imaginea.requesttracking.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityDAO activityDAO;
	
	@Override
	public List<Activities> getActivities(int srNumber) {
		
		return activityDAO.getActivitiesBysrNumber(srNumber);
	}

	@Override
	public void createActivity(ServiceRequest serviceRequest) {
		
		Activities activity  = new Activities();
		activity.setSrNumber(serviceRequest.getSrnumber());
		activity.setUpdateddate(new Date());
		activity.setStatusUpdate(serviceRequest.getStatus());
		activity.setUpdatedDescription(serviceRequest.getDescription());
		activityDAO.save(activity);
		
	}

	@Override
	public Activities getActivity(int activityId) {
		
		return activityDAO.findById(activityId).get();
	}

	@Override
	public void deleteActivity(int activityId) {
		
		activityDAO.deleteById(activityId);
	}

}
