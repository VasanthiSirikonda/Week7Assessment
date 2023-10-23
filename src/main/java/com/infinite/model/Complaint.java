package com.infinite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vasanthis //pojo class
 *
 */
@Entity
@Table(name = "complaint")
public class Complaint {
	@Id
	@Column(name = "id")
	private int issue_no;
	
	@Column(name = "person_name")
	private String person_name;
	
	@Column(name = "mobile_no")
	private String mobile_no;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "street_no")
	private String street_no;
	
	@Column(name = "issue_name")
	private String issue_name;
	public Complaint(Complaint c)
	{
		
	}
	
	public Complaint(String person_name, String mobile_no, String address, String street_no, String issue_name,Complaint c) {
		super();
		this.person_name = person_name;
		this.mobile_no = mobile_no;
		this.address = address;
		this.street_no = street_no;
		this.issue_name = issue_name;
	}

	public int getIssue_no() {
		return issue_no;
	}

	public void setIssue_no(int issue_no) {
		this.issue_no = issue_no;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStreet_no() {
		return street_no;
	}

	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}

	public String getIssue_name() {
		return issue_name;
	}

	public void setIssue_name(String issue_name) {
		this.issue_name = issue_name;
	}
}
