package com.capg.service;
import java.util.*;

import com.capg.dao.DistributorDetails;
import com.capg.exception.NoDataFoundException;
import com.capg.exception.NoNegativeId;
import com.capg.interfaces.DistributorDetailsServiceInterface;
public class DistributorDetailsService implements DistributorDetailsServiceInterface
{
	DistributorDetails obj=new DistributorDetails();
	
	public List<Integer> getId()
	{
		
		return obj.getId();
	}
	//To get the details of particular Id
	public String getDistributorDetailsService(Integer id) throws NoDataFoundException,NoNegativeId
	{
		String result = null;
		
		if(id<0)
		 {
			 throw new NoNegativeId("Not a negative number");
		 }
		 else if(id==0)
		 {
			 result="Id can not be 0";
			 return result;
		 }
		 for(Integer i:obj.getId())
		 {
			 if(i.equals(id))
			 {
				result= obj.getDistributorDetails(id); 	 
			 }
		 }
		
		if(result==null)
		{
			throw new NoDataFoundException("not valid id");
		}
		else
		{
			return result;
		}
	}
}