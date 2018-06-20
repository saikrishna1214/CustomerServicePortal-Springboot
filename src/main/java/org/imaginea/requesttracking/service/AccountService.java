package org.imaginea.requesttracking.service;

import java.util.List;

import org.imaginea.requesttracking.entity.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
	
	public List<Account> getAllAccounts();
	
	public Account createAccount(Account account);
	
	public Account getAccount(String emialid);
	
	public Account updateAccount(Account account, int id);
	
	public void deleteAccount(int id);
}
