package com.capg.testing;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capg.dao.DistributorDetails;
import com.capg.service.DistributorDetailsService;

import java.util.List;
public class DistributorDetailsTesting {
	    DistributorDetails obj;
	    Integer List[]= {1,2,3,4};
	    
	    @Before
		public void setUp()
		{
			obj=new DistributorDetails();
		}
		@Test
		public void testgetId()
		{
			List<Integer> list=obj.getId();
			assertArrayEquals(List,list.toArray());
		}
		@Test
		public void testGetDistributorDetailsDao()
		{
			assertEquals("Distributor Id is->2 Distributor Name is->Tom Location ->Kanpur Phone Number->5282938738",obj.getDistributorDetails(2));
		}
		
		@Test
		public void testGetDistributorDetailsDao1()
		{
			assertEquals("No Data Found",obj.getDistributorDetails(10));		
		}
	
		 @After
		    public void cleaUp()
		    {
		    	obj=null;
		    }
	}



