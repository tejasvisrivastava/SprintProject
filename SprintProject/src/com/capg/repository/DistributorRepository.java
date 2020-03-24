
	package com.capg.repository;
	import java.util.*;

    import com.capg.dto.DistributorDetailsCons;
	public class DistributorRepository {
		
		static Map<Integer,DistributorDetailsCons> distributorMap=new HashMap<Integer,DistributorDetailsCons>();
		//All the data stored in HashMap
		static
		{
			distributorMap.put(1, new DistributorDetailsCons(1,"John","Kanpur","096412789"));
			distributorMap.put(2, new DistributorDetailsCons(2,"Tom","Kanpur","5282938738"));
			distributorMap.put(3, new DistributorDetailsCons(3,"Michael","Kanpur","3467856983"));
			distributorMap.put(4, new DistributorDetailsCons(4,"John","Kanpur","096412789"));
		}
		//Get Method to return the object of HashMap
	   public static Map<Integer,DistributorDetailsCons> get()
	   {
		return distributorMap;
	   }
	}

