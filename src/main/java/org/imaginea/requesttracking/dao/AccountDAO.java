package org.imaginea.requesttracking.dao;

import org.imaginea.requesttracking.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends CrudRepository<Account, Integer>{
	
		public Account getAccountByemailid(String emailid);	
}
