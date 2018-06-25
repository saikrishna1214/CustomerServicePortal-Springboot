package org.imaginea.requesttracking;


import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.service.impl.AccountServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class TestAccounts extends CustomerServicePortalTests{
	

	@Autowired
	private AccountServiceImpl accountService;
	
	@Test
	public void testAccounts() throws Exception {
		
		Account account = new Account();
		account.setEmailid("sample@gmail.com");
		account.setFirstname("sai");
		accountService.createAccount(account);
		Assert.assertNotNull(accountService.getAllAccounts());
		
	}
	
	
	

}
