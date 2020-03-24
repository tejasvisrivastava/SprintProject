package com.capg.controller;
import java.util.*;
import com.capg.exception.NoDataFoundException;
import com.capg.exception.NoNegativeId;
import com.capg.service.DistributorDetailsService;
public class MainController {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		control: while(true)
		{
			System.out.println("Enter \n 1:Display Distributor Details     \n 2:Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				DistributorDetailsService obj = new DistributorDetailsService();
			    System.out.println("Display Distributor Details");
			    System.out.println("---------------------------");
			    System.out.println("Available Distributor ID'S are- \n"+obj.getId());
			    System.out.println("Enter the ID from the given list...");
			   
				try {
					while(!sc.hasNextInt())
					{
						System.out.println("Please give Integer type ID");
		        		 sc.next();
		        		 
		        	 }
		        	 int id=sc.nextInt();
		        	  if(id<0)
		        	  {
		        		  throw new NoNegativeId("Id Should be positive");
					}
					System.out.println(obj.getDistributorDetailsService(id));
				} catch (NoDataFoundException | NoNegativeId e ) {
					System.out.println(e);
				}
			   break;
			case 2: break control;
				default:System.out.println("Wrong Choice");
			}
		}
		sc.close();
	}

}