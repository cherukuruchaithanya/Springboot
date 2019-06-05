//package com.example.demo5.document.copy;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class DocumentServices {
//	
//@Autowired
//private DocumentRepository repo;
//	
//	
//	public List<Document> FindallDocument(){
//		List<Document> si= new ArrayList<>();
//		 repo.findAll().forEach(si::add);
//		 return si;
//	}
//	
//	public Object AddDocument(Document a){
//		return repo.save(a);
//	}
//
//}
