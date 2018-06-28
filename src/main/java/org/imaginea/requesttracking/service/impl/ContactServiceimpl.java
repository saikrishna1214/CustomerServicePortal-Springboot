package org.imaginea.requesttracking.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.imaginea.requesttracking.dao.AccountDAO;
import org.imaginea.requesttracking.dao.ContactDAO;
import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.entity.Contact;
import org.imaginea.requesttracking.exception.CustomerServicePortalException;
import org.imaginea.requesttracking.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceimpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Autowired
	private AccountDAO accountDAO;
	
	@Override
	public List<Contact> getAllContacts(int accountid) {
		
		accountDAO.findById(accountid).orElseThrow(() -> new CustomerServicePortalException("Customer Not Found"));
		return contactDAO.getAllContactsByaccount(accountDAO.findById(accountid).get());
	}

	@Override
	public Contact getContact(int phone) {
		
		try {
		return contactDAO.findById(phone).get();
		}
		catch(NoSuchElementException e) {
			return null;
		}
	}

	@Override
	public void deleteContact(int id) {
		
		contactDAO.deleteById(id);
	}

	@Override
	public Contact createContact(Contact contact,int accountid) {
		
		accountDAO.findById(accountid).orElseThrow(() -> new CustomerServicePortalException("Customer Not Found"));
		contact.setAccount(accountDAO.findById(accountid).get());
		return contactDAO.save(contact);
	}

	@Override
	public Contact updateContact(Contact contact, int id) {
		
		contact.setContactid(id);
		return contactDAO.save(contact);
	}

}
