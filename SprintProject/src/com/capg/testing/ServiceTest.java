package com.capg.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capg.exception.NoDataFoundException;
import com.capg.exception.NoNegativeId;
import com.capg.service.DistributorDetailsService;

import java.util.*;
public class ServiceTest {
	DistributorDetailsService obj;
	Integer List[ ]= {1,2,3,4};
	
	@Before
	public void setUp()
	{
		obj=new DistributorDetailsService();
	}
	
	@Test
	public void testGetId()
	{
		List<Integer>list=obj.getId();
		assertArrayEquals(List,list.toArray());
	
	}
	
	@Test
	public void testGetDistributorDetailsService() throws NoDataFoundException, NoNegativeId
	{
		assertEquals("Distributor Id is->2 Distributor Name is-> Tom Address -> Kanpur Phone Number-> 5282938738",obj.getDistributorDetailsService(2));	
	}
	
    @Test(expected = NoDataFoundException.class)
    public void  forValidId() throws NoDataFoundException, NoNegativeId
    {	
    assertEquals("Not a valid ", obj.getDistributorDetailsService(10));
    }
    
    @Test(expected=NoNegativeId.class)
    public void noNegativeId() throws NoNegativeId, NoDataFoundException
    {
    	assertEquals("Id should be positive",obj.getDistributorDetailsService(-15));
    }
    
    @Test
    public void zeroId() throws NoDataFoundException, NoNegativeId 
    {
    	assertEquals("Id can not be 0",obj.getDistributorDetailsService(0));
    }
    @After
    public void cleaUp()
    {
    	obj=null;
    }
}

