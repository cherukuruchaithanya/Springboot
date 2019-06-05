package com.example.demo5.Account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class statusservices {
	
	@Autowired
	public AccountRepository ss;
	public Object addStatus(AccountStatus as){
		return ss.save(as);
	}

	
	public AccountStatus findbu(String email) {
		
		return ss.findById(email).orElse(null);
	}
	
	
	public AccountStatus update(String mail) {
//		List<AccountStatus> dd=	new ArrayList<>();
//		if(ss.existsById(mail)==true) {
//			ss.
//		}
		
		AccountStatus dd= ss.findById(mail).orElse(null);
		dd.setStatus("Verified");
		//addStatus(dd);
		
		return dd;
			
	}
	
	
	
}
