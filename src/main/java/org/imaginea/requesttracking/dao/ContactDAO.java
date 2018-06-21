package org.imaginea.requesttracking.dao;

import java.util.List;

import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDAO extends CrudRepository<Contact, Integer>{

	public List<Contact> getAllContactsByaccountId(int accountId);
}
