//package com.example.demo5.document.copy;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class DocumentControllers {
//
//	@Autowired
//	private DocumentServices as;
//	@RequestMapping("/AllDocument")
//	public List<Document> FindAllAddress(){
//		return as.FindallDocument();
//	}
//	
//	@RequestMapping(method=RequestMethod.POST,value="/AllDocument")
//	public void AddAddress(@RequestBody Document ad) {
//		as.AddDocument(ad);
//	}
//	
//	
//	
//}
