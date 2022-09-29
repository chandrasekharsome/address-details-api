package com.sriteja.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriteja.model.AddressDetails;
import com.sriteja.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	
	
	private static final Logger Logger = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public String insertAddressDetails(AddressDetails addressDetails ) {
		Logger.info("Address Details in Service Layer::"+addressDetails);
		addressRepository.save(addressDetails);
		
		return "Address Details Successfully inserted";
	
	}
	public AddressDetails getAddressDetailsByVillage(String village) {
		Logger.info("Adress Village in Service Layer::"+village);
		
		AddressDetails response = addressRepository.FindByVillage(village);
		return response;
	}
	 
	}	 							
  