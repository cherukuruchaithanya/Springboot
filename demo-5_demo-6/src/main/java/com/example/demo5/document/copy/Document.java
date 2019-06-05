//package com.example.demo5.document.copy;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name="demoDocument")
//public class Document {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="ID")
//private int id;
//	@Column(name="firstname")
//	private String firstname;
//	@Column(name="lastname")
//	private String lastnmae;
//	@Column(name="emailid")
//	private String emailid;
//	@Column(name="addressid")
//	private String addressid;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getFirstname() {
//		return firstname;
//	}
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//	public String getLastnmae() {
//		return lastnmae;
//	}
//	public void setLastnmae(String lastnmae) {
//		this.lastnmae = lastnmae;
//	}
//	public String getEmailid() {
//		return emailid;
//	}
//	public void setEmailid(String emailid) {
//		this.emailid = emailid;
//	}
//	public String getAddressid() {
//		return addressid;
//	}
//	public void setAddressid(String addressid) {
//		this.addressid = addressid;
//	}
//	public Document(int id, String firstname, String lastnmae, String emailid, String addressid) {
//		super();
//		this.id = id;
//		this.firstname = firstname;
//		this.lastnmae = lastnmae;
//		this.emailid = emailid;
//		this.addressid = addressid;
//	}
//	
//	public Document() {
//		
//	}
//	
//}
