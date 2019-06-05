//	package com.example.demo5.photo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//import org.springframework.web.multipart.MultipartFile;
//
//@Entity
//	@Table(name="photo")
//public class photo {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="photoid")
//	private int photoid;
//	
//	@Transient
//	private List<MultipartFile> files=new ArrayList<MultipartFile>();
//	@Transient
//	private List<String> removeimages=new ArrayList<String>();
//	public photo() {
//		
//	}
//	public photo(int photoid, List<MultipartFile> files, List<String> removeimages) {
//		super();
//		this.photoid = photoid;
//		this.files = files;
//		this.removeimages = removeimages;
//	}
//	public int getPhotoid() {
//		return photoid;
//	}
//	public void setPhotoid(int photoid) {
//		this.photoid = photoid;
//	}
//	public List<MultipartFile> getFiles() {
//		return files;
//	}
//	public void setFiles(List<MultipartFile> files) {
//		this.files = files;
//	}
//	public List<String> getRemoveimages() {
//		return removeimages;
//	}
//	public void setRemoveimages(List<String> removeimages) {
//		this.removeimages = removeimages;
//	}
//}
