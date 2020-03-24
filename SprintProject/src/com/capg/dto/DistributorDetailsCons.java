package com.capg.dto;

public class DistributorDetailsCons {
	
	   private int distributorId;
	   private String distributorName;
	   private String address;
	   private String phoneNumber;
	   
       
	   public DistributorDetailsCons(int DistributorId, String DistributorName, String PhoneNumber, String Address){
	      super();
		  this.distributorId = DistributorId;
	      this.distributorName = DistributorName;
	      this.address = Address;
	      this.phoneNumber = PhoneNumber;
	   }
	   public int getDistributorId() {
		      return distributorId  ;
	   }

	   public void setDistributorId(int getdistributorId) {
		      this.distributorId = getdistributorId;
	   }

	   public String getDistributorName() {
	      return distributorName;
	   }

	   public void setDistributorName(String getdistributorName) {
	      this.distributorName = getdistributorName;
	   }

	 
	   
	   public String getAddress() {
		return address;
	   }
	   public void setAddress(String address) {
		this.address = address;
	   }
	   public String getPhoneNumber() {
		return phoneNumber;
	   }
	   public void setPhoneNumber(String phoneNumber)	{
		this.phoneNumber = phoneNumber;
	}
	
}
