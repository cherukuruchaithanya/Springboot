package com.example.demo5.document;

import java.util.Base64;
import java.util.List;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.Account.AccountStatus;
import com.example.demo5.Account.statusservices;
import com.example.demo5.Adress.Address;
import com.example.demo5.Adress.AddressServices;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DocumentControllers {

	@Autowired
	private DocumentServices as;
	private AddressServices da;
	@Autowired
	private statusservices sgng;
	@RequestMapping("/AllDocument")
	public List<Document> FindAllAddress(){
		return as.FindallDocument();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/AllDocument")
	public void AddAddress(@RequestBody Document ad,Address s) {
		//Document sd=new Document();
//		sd.getAdd();
//		Address a=sd.getAdd();
		Address a= new Address();
//		a.setAddressid(ad.getAddressid());
	//	sd.setAdd(s);
		
		String password=ad.getPassword();
		String encodedString = Base64.getEncoder().encodeToString(password.getBytes());
		ad.setPassword(encodedString);
	as.sendmail(ad);
//		Time.sleep(15);
		as.AddDocument(ad);
	} 
	
	
	@RequestMapping(method=RequestMethod.POST,value="/new/{mail}/{num}")
	public AccountStatus getbyid(@PathVariable String mail,@PathVariable Integer num) {
		
		AccountStatus as= sgng.findbu(mail);
		if(as.equals(null)) {
			System.out.println("Email or Verification number is wrong");
		}
		else	{
	if(as.getValidationNumber()==num) {
		as.setStatus("Verified");
		sgng.addStatus(as);
	}
	else
		as.setStatus("pending");
	
	
		
		}
		
		return as;
	}
	@RequestMapping(method=RequestMethod.POST,value="/{mail}/{password}")
	public AccountStatus getbyid(@PathVariable String mail,@PathVariable String password) {
		AccountStatus as= sgng.findbu(mail);
		if(as.equals(null)) {
			System.out.println("Email or password is wrong");
		}
		else	{
			System.out.println(as.getStatus());
			if(as.getStatus().equals("Verified")) {
			byte[] decodedBytes = Base64.getDecoder().decode(as.getPassword());
			String decodedString = new String(decodedBytes);
			System.out.println(decodedString);
	if(decodedString.equals(password)) {
		as.setStatus("Active");
		sgng.addStatus(as);
	}
	
	
	else
		as.setStatus(as.getStatus());
	
			}
			else {
				System.out.println("verify the Account");
			}
		
		}
		return as;
	
	}
	
	
}
