package com.example.demo5.Adress;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServices {

	
	@Autowired
	private AddresRepository repo;
	
	
	public List<Address> FindallAdress(){
		List<Address> si= new ArrayList<>();
		 repo.findAll().forEach(si::add);
		 return si;
	}
	
	public Object AddAdsress(Address a){
		return repo.save(a);
	}
}
