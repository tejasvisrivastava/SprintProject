package com.capg.dao;
import java.util.*;
import com.capg.interfaces.DistributorDetailsInterface;
import com.capg.dto.DistributorDetailsCons;
import com.capg.repository.DistributorRepository;
public class DistributorDetails implements DistributorDetailsInterface {
	Map<Integer,DistributorDetailsCons> repositoryMap;
	//constructor
	public DistributorDetails()
	{
		repositoryMap=DistributorRepository.get();
		
	}
// this function get the order ids and return list
	public List<Integer> getId()
	{
		List<Integer> orderIdList = new ArrayList<Integer>();
		for(Map.Entry<Integer, DistributorDetailsCons> obj:repositoryMap.entrySet())
		{
			orderIdList.add(obj.getKey());
		}
		return orderIdList;
	}
	//this function give the result by validating the id
	public String getDistributorDetails(Integer id)
	{
		String result = "No Data Found";
		for(Map.Entry<Integer, DistributorDetailsCons> obj:repositoryMap.entrySet())
		{
			if(obj.getKey().equals(id))
			{
				result="Distributor Id is->"+ obj.getValue().getDistributorId()+" Distributor Name is->"+obj.getValue().getDistributorName()+" Address ->"+obj.getValue().getAddress()+" Phone Number->"+obj.getValue().getPhoneNumber();
				
			}
		}
		return result;
	}
}
