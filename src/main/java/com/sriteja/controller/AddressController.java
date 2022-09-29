package com.sriteja.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sriteja.model.AddressDetails;
import com.sriteja.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressController {
	//log4j to print the logs in the console
	private static final Logger Logger = LoggerFactory.getLogger(AddressController.class);
	
	@Autowired
	private AddressService addressService;
	
	
	/***
	 * insert the address details
	 * @param address
	 * @return
	 */
	
	@PostMapping("/address-details")
	public String addAddressDetails(@RequestBody AddressDetails address) {
		Logger.info("address Details"+address);
		
		String response = "data will be inserted";
		return response;
	}
	/**
	 * get the Address details based on address village
	 * @param address village 
	 * @return String 
	 */
	@GetMapping("/get-address-details/{post}")
	public String getaddressDetails(@PathVariable String post) {
		
		Logger.info("post name::"+post);
		
		String response = "my post name::"+post;
		return response;
	}
	@GetMapping("/address-details")
	public String getAddressDataByAddressPincode(@RequestParam int pincode) {
		
		Logger.info("pincode :: "+pincode);
		String response = "address pincode::"+pincode;
		
		return response;
	}
	
	/*Put method is used to Update the value
	 * @Param post
	 * @param addressDetails
	 * @return response message
	 **/
	@PutMapping("/update-address-details/{state}")
	public String updateAddressDetails(@RequestBody AddressDetails address, @PathVariable String state) {
		Logger.info("AddressDetails"+address);
		
		String response = " address details updated done::"+state;
		return response;
		
	}
	/**
	 * this method is using to delete the address data by pincode number
	 * @param pincode
	 * @return response
	 */
	
	@DeleteMapping ("/delete-address-details")
	public String deleteAddressDetailsByAddressPincode(@RequestParam int pincode) {
		Logger.info("pincode address" +pincode);
		
		String response =" Data Deleted by pincode" +pincode;
		return response;
	}
	/**
	 * this method patch method by using to update partial data
	 * @param mandal
	 * @return
	 */
	
	@PatchMapping("/partial-address-details/{mandal}")
	public String partialUpdateAddressDetails(@PathVariable String mandal) {
		Logger.info(mandal);
		String response = "Partial Updated Data" +mandal;
		return response;
	}
	/**
	 * add the address details using post method
	 * @param addressDetails
	 * @return response
	 */
	@PostMapping("/add-address-details")
	public String insertAddressDetails(@RequestBody AddressDetails addressDetails) {
		Logger.info("Address Details in Controller Layer::"+addressDetails);
		
		String response = addressService.insertAddressDetails(addressDetails);
		return response;
		
	}
	
	/**
	 * get the address details based on village name
	 * @param village
	 * @return Address Details
	 */
	@GetMapping("/company-details/{village}")
	public AddressDetails getAddressDetailsByVillage(@PathVariable()String village) {
		Logger.info("Address village is controller layer::"+village);
		AddressDetails response = addressService.getAddressDetailsByVillage(village);
		return response;
		
	}
	
}
	
		
		

