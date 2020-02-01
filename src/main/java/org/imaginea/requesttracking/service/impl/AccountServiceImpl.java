package org.imaginea.requesttracking.service.impl;

import java.util.List;
import java.util.Optional;

import org.imaginea.requesttracking.dao.AccountDAO;
import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.exception.CustomerServicePortalException;
import org.imaginea.requesttracking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDAO accountDAO;

	@Override
	public List<Account> getAllAccounts() {
		
		return (List<Account>) accountDAO.findAll();
	}

	@Override
	public Account createAccount(Account account) {
		/* creating a new account */
		return accountDAO.save(account);
	}

	@Override
	public Account getAccount(String emailid) {
		
		return accountDAO.getAccountByemailid(emailid);
	}

	@Override
	public Account updateAccount(Account account, int id) {
		
		accountDAO.findById(id).orElseThrow(() -> new CustomerServicePortalException("Customer Not Found"));
		account.setAccountid(id);
		return accountDAO.save(account);
	}

	public void deleteAccount(int id) {
		
		accountDAO.findById(id).orElseThrow(() -> new CustomerServicePortalException("Customer Not Found"));
		accountDAO.deleteById(id);
	}

}
