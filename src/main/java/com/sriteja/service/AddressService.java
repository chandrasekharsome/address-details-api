package com.sriteja.service;

import com.sriteja.model.AddressDetails;

public interface AddressService {
	
	public String insertAddressDetails(AddressDetails addressDetails );

	public AddressDetails getAddressDetailsByVillage(String village);


		
	}

