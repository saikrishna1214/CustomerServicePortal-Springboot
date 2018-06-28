package org.imaginea.requesttracking.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * contains details od an Activity each serviceRequest will contain a record in
 * activity table.
 * 
 * @author saikrishnak
 *
 */

@Entity
public class Activities {

	@Id
	@GeneratedValue
	private int activityid;

	@Column(name = "UPDATEDDATE")
	private Date updateddate;

	@Column(name = "STATUSUPDATE")
	private String statusUpdate;

	@Column(name = "UPDATEDBY")
	private String updatedemployee;

	@Column(name = "UPDATEDDESCRIPTION")
	private String updatedDescription;

	public String getUpdatedemployee() {
		return updatedemployee;
	}

	public void setUpdatedemployee(String updatedemployee) {
		this.updatedemployee = updatedemployee;
	}

	public int getActivityid() {
		return activityid;
	}

	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date date) {
		this.updateddate = date;
	}

	private int srNumber;

	public int getSrNumber() {
		return srNumber;
	}

	public void setSrNumber(int srNumber) {
		this.srNumber = srNumber;
	}


	/**
	 * gives status update
	 * 
	 * @return String contains status update details.
	 */
	public String getStatusUpdate() {
		return statusUpdate;
	}

	/**
	 * sets the status update for present activity
	 * 
	 * @param statusUpdate
	 *            contains status update details of String type.
	 */
	public void setStatusUpdate(String statusUpdate) {
		this.statusUpdate = statusUpdate;
	}

	public String getUpdatedDescription() {
		return updatedDescription;
	}

	public void setUpdatedDescription(String updatedDescription) {
		this.updatedDescription = updatedDescription;
	}
}
