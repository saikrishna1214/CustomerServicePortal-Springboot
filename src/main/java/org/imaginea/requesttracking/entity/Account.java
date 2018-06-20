package org.imaginea.requesttracking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Contains details of account table setter and getter methods will set and
 * return data respectively.
 * 
 * @author saikrishnak
 *
 */

@Entity
public class Account {

	/* @Id Represents that it is a primary key. */
	@Id
	@Column(name = "ACCOUNTID")
	@GeneratedValue
	private int accountid;

	@Column(name = "EMAILID", unique=true)
	private String emailid;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "FIRSTNAME")
	private String firstname;

	@Column(name = "LASTNAME")
	private String lastname;
	

	/**
	 * returns account id.
	 * 
	 * @return account id
	 */
	public int getAccountid() {
		return accountid;
	}

	/**
	 * sets account id for an object
	 * 
	 * @param accountid
	 *            will have an integer value represents account id.
	 */
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
