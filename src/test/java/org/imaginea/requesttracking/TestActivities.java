package org.imaginea.requesttracking;

import org.imaginea.requesttracking.service.impl.ActivityServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestActivities extends CustomerServicePortalTests {

	@Autowired
	private ActivityServiceImpl activityService;
	
	@Test
	public void testActivity() {
		
		Assert.assertEquals(activityService.getActivities(5).size(), 0);
		Assert.asserEquals(1,1);
		
	}

}
