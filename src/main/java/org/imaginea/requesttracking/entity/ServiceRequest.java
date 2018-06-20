
package org.imaginea.requesttracking.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 * contains details of a service request it maps with a row in service request
 * table in database
 * 
 * @author saikrishnak
 *
 */

@Entity
public class ServiceRequest {
	@Id
	@Column(name = "SRNUMBER")
	@GeneratedValue
	private int srnumber;

	@Column(name = "TITLE")
	private String title;

	/*
	 * @Column(name = "ACCOUNT_ID") private int accountid;
	 */

	@Column(name = "CONTATCT_ID")
	private int contactid;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "OPENDATE")
	private Date opendate;

	@Lob
	@Column(name = "DESCRIPTION")
	private String description;

	@ManyToOne
	private Account account;
	
	private Contact contact;

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@ManyToOne
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * gives service number of present service request
	 * 
	 * @return srnumber of String type.
	 */
	public int getSrnumber() {
		return srnumber;
	}

	/**
	 * sets service number for present Service Request object
	 * 
	 * @param srnumber
	 *            contains Service number of String type.
	 */
	public void setSrnumber(int srnumber) {
		this.srnumber = srnumber;
	}

	/**
	 * gives title of present service request
	 * 
	 * @return title of String type.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * sets title for present Service Request object
	 * 
	 * @param title
	 *            contains Service number of String type.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * gives contact id of present service request
	 * 
	 * @return contactid of Integer type.
	 */
	public int getContactid() {
		return contactid;
	}

	/**
	 * sets contact id for present Service Request object
	 * 
	 * @param contact
	 *            id contains Service number of Integer type.
	 */
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	/**
	 * gives Status of present service request
	 * 
	 * @return status of String type.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * sets status for present Service Request object
	 * 
	 * @param status
	 *            contains Service number of String type.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * gives open date of present service request
	 * 
	 * @return opendate of Date type.
	 */

	/**
	 * gives close date of present service request
	 * 
	 * @return close date of Date type.
	 */

	public Date getOpendate() {
		return opendate;
	}

	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}

	/**
	 * gives description of present service request
	 * 
	 * @return description of String type.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * sets description for present Service Request object
	 * 
	 * @param description
	 *            contains Service number of String type.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}