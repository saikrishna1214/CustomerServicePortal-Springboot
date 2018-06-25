package org.imaginea.requesttracking;

import org.imaginea.requesttracking.service.impl.ContactServiceimpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestContacts extends CustomerServicePortalTests{

	@Autowired
	private ContactServiceimpl contactService;
	
	@Test
	public void testContacts() {
		
		Assert.assertNull(contactService.getContact(1234));
	}
}
