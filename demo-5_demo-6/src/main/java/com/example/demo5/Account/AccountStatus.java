package com.example.demo5.Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usersecuredinfo")
public class AccountStatus {
	@Id
	@Column(name="Emailid")
	private String Emailid;
	@Column(name="Status")
	private String status;
	@Column(name="validationnumber")
	private int Validationnumber;
	@Column(name="Password")
	private String password;
	
	public String getEmaildid() {
		return Emailid;
	}
	public void setEmaildid(String emaildid) {
		this.Emailid = emaildid;
	}
	public int getValidationnumber() {
		return Validationnumber;
	}
	public void setValidationnumber(int validationnumber) {
		Validationnumber = validationnumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		this.Emailid = emailid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getValidationNumber() {
		return Validationnumber;
	}
	public void setValidationNumber(int validationNumber) {
		Validationnumber = validationNumber;
	}
	public AccountStatus(String emailid, String status, int validationNumber,String password) {
		super();
		this.Emailid = emailid;
		this.status = status;
		Validationnumber = validationNumber;
		this.password=password;
	}
	
	public AccountStatus() {
		
	}
	

}
