//package com.example.demo5.Adress.copy;
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
//public class AddressControllers {
//
//	@Autowired
//	private AddressServices as;
//	@RequestMapping("/AllAddress")
//	public List<Address> FindAllAddress(){
//		return as.FindallAdress();
//	}
//	
//	@RequestMapping(method=RequestMethod.POST,value="/AllAddress")
//	public void AddAddress(@RequestBody Address ad) {
//		as.AddAdsress(ad);
//	}
//	
//	
//	
//}
