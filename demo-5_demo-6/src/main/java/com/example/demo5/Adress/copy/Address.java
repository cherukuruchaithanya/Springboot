//package com.example.demo5.Adress.copy;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="demoaddress")
//public class Address {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="addressid")
//	private int addressid;
//
//	@Column(name="street")
//		private String street;
//		@Column(name="state")
//		private String state;
//		@Column(name="country")
//		private String country;
//		@Column(name="zipcode")
//		private String zipcode;
//		public int getAddressid() {
//			return addressid;
//		}
//		public void setAddressid(int addressid) {
//			this.addressid = addressid;
//		}
//		public String getStreet() {
//			return street;
//		}
//		public void setStreet(String street) {
//			this.street = street;
//		}
//		public String getState() {
//			return state;
//		}
//		public void setState(String state) {
//			this.state = state;
//		}
//		public String getCountry() {
//			return country;
//		}
//		public void setCountry(String country) {
//			this.country = country;
//		}
//		public String getZipcode() {
//			return zipcode;
//		}
//		public void setZipcode(String zipcode) {
//			this.zipcode = zipcode;
//		}
//		public Address(int addressid, String street, String state, String country, String zipcode) {
//			super();
//			this.addressid = addressid;
//			this.street = street;
//			this.state = state;
//			this.country = country;
//			this.zipcode = zipcode;
//		}
//		
//		public Address() {
//			
//		}
//}
