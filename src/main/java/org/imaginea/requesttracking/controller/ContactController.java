package org.imaginea.requesttracking.controller;

import java.util.List;

import org.imaginea.requesttracking.dto.Result;
import org.imaginea.requesttracking.entity.Contact;
import org.imaginea.requesttracking.service.ContactService;
import org.imaginea.requesttracking.util.BuildResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping(value="/accounts/{accountid}/contacts", method = RequestMethod.GET)
	public Result getAllContacts(@PathVariable("accountid") int id) {
		
		return BuildResponse.buildSuccessMessage(contactservice.getAllContacts(id));
	}
	
	@RequestMapping(value="/accounts/{accountid}/contacts/{phone}", method = RequestMethod.GET)
	public Result getContact(@PathVariable("contactid") int phone) {
		
		return BuildResponse.buildSuccessMessage(contactservice.getContact(phone));
	}
	
	@RequestMapping(value="/accounts/{accountid}/contacts", method = RequestMethod.POST)
	public Result createContact(@RequestBody Contact contact, @PathVariable("accountid") int accountId) {
		return BuildResponse.buildSuccessMessage(contactservice.createContact(contact, accountId));
	}
	
	@RequestMapping(value="/accounts/{accountid}/contacts/{contactid}", method = RequestMethod.PUT)
	public Result updateContact(@RequestBody Contact contact, @PathVariable("contactid") int id) {
		return BuildResponse.buildSuccessMessage(contactservice.updateContact(contact,id));
	}

	@RequestMapping(value="/accounts/{accountid}/contacts/{contactid}", method = RequestMethod.DELETE)
	public void deleteContact(@PathVariable("contactid") int id) {
		contactservice.deleteContact(id);
	}

}
