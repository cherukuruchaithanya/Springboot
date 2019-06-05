package com.example.demo5.document;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo5.Account.AccountStatus;
import com.example.demo5.Account.statusservices;
import com.example.demo5.Account.statusservices;


@Service
public class DocumentServices {
	private JavaMailSender javasender;
@Autowired
private DocumentRepository repo;
@Autowired
private statusservices sdfr;

public DocumentServices(JavaMailSender javasender) {
	this.javasender=javasender;
}

	
	public List<Document> FindallDocument(){
		List<Document> si= new ArrayList<>();
		 repo.findAll().forEach(si::add);
		 return si;
	}
	
	public Object AddDocument(Document a){
		return repo.save(a);
	}
	
	
	public  void sendmail (Document d) throws  MailException{
		SimpleMailMessage mail =new SimpleMailMessage();
		mail.setTo(d.getEmailid());
		mail.setFrom("cherukuruchaithanya4446@gmail.com");
		mail.setSubject("password");
		
		
		 Random rand = new Random(); 
		  
	        
	        int rand_int1 = rand.nextInt(1000); 
	        String psd=rand_int1+"";
	        mail.setText(psd);
		AccountStatus asss=new AccountStatus(d.getEmailid(),"pending",rand_int1,d.getPassword());
//		asss.setEmailid(d.getEmailid());
//		
//		asss.setStatus("pending");
//		asss.setValidationNumber(rand_int1);
		
		
		sdfr.addStatus(asss);
		
		javasender.send(mail);
	}

}
