package com.sriteja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This is Entity Class
 *
 */
@Entity
@Table(name = "Address")
public class AddressDetails {
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  String doorNum;
	private String steet;
	private  String village;
	private  String mandal;
	private  String state;
	private  int pincode;
	private  String post;
	 
	public AddressDetails() {
		
	}

	public AddressDetails(String doorNum, String steet, String village, String mandal, String state, int pincode,
			String post) {
		super();
		this.doorNum = doorNum;
		this.steet = steet;
		this.village = village;
		this.mandal = mandal;
		this.state = state;
		this.pincode = pincode;
		this.post = post;
	}

	public String getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(String doorNum) {
		this.doorNum = doorNum;
	}

	public String getSteet() {
		return steet;
	}

	public void setSteet(String steet) {
		this.steet = steet;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	//toString method
	@Override
	public String toString() {
		return "AddressDetails [doorNum=" + doorNum + ", steet=" + steet + ", village=" + village + ", mandal=" + mandal
				+ ", state=" + state + ", pincode=" + pincode + ", post=" + post + "]";
	}
	
	
}

