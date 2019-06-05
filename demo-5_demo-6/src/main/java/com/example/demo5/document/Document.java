	package com.example.demo5.document;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo5.Adress.Address;


@Entity
@Table(name="userinformation")
public class Document {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastnmae;
	@Column(name="emailid")
	private String emailid;
	@Column(name="address_id",insertable = false, updatable = false)
	private int addressid;
	@Column(name="password")
	private String password;
	
	
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "address_id", referencedColumnName = "addressid")
	private Address Add;
	public Address getAdd() {
		return Add;
	}
	public void setAdd(Address add) {
		Add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastnmae() {
		return lastnmae;
	}
	public void setLastnmae(String lastnmae) {
		this.lastnmae = lastnmae;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public Document(int id, String firstname, String lastnmae, String emailid, int addressid,String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastnmae = lastnmae;
		this.emailid = emailid;
		this.addressid = addressid;
		this.password=password;
	}
	
	
	
	public Document() {
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
