package org.imaginea.requesttracking.controller;

import java.util.List;

import org.imaginea.requesttracking.dto.AccountDto;
import org.imaginea.requesttracking.dto.Result;
import org.imaginea.requesttracking.entity.Account;
import org.imaginea.requesttracking.service.AccountService;
import org.imaginea.requesttracking.util.BuildResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountservice;
	
	@RequestMapping(value="/accounts", method = RequestMethod.GET)
	public Result getAllAccounts() {
		
		return BuildResponse.buildSuccessMessage(accountservice.getAllAccounts());
	}
	
	@CrossOrigin
	@RequestMapping(value="/accounts/{emailid}", method = RequestMethod.GET)
	public Result getAccount(@PathVariable("emailid") String emailid) {
		
		return BuildResponse.buildSuccessMessage(accountservice.getAccount(emailid));
	}
	
	@RequestMapping(value="/accounts", method = RequestMethod.POST)
	public Result creatAccount(@RequestBody Account account) {
		return BuildResponse.buildSuccessMessage(accountservice.createAccount(account));
	}
	
	@RequestMapping(value="/accounts/{accountid}", method = RequestMethod.PUT)
	public Result updateAccount(@RequestBody Account account, @PathVariable("accountid") int id) {
		return BuildResponse.buildSuccessMessage(accountservice.updateAccount(account,id));
	}

	@RequestMapping(value="/accounts/{accountid}", method = RequestMethod.DELETE)
	public void deleteAccount(@PathVariable("accountid") int id) {
		accountservice.deleteAccount(id);
	}
}
