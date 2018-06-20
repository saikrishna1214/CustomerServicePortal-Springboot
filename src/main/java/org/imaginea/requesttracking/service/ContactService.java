package org.imaginea.requesttracking.service;

import java.util.List;

import org.imaginea.requesttracking.entity.Contact;

public interface ContactService {
	
	public List<Contact> getAllContacts(int accountid);
	
	public Contact createContact(Contact contact, int accountid);
	
	public Contact getContact(int phone);
	
	public Contact updateContact(Contact contact, int id);
	
	public void deleteContact(int id);

}
