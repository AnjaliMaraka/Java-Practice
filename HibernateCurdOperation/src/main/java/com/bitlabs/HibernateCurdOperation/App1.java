package com.bitlabs.HibernateCurdOperation;

import java.util.Scanner;

import com.bitlabs.Dao.AdminDao;

public class App1 {
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        Scanner sc=new Scanner(System.in);
	        AdminDao admin=new AdminDao();
	        int option=0;
	        do {
	        	System.out.println("Enter 1.create");
	        	System.out.println("Enter 2.Delete");
	        	System.out.println("enter 3");
	        	option=sc.nextInt();
	        	switch(option) {
	        	case 1:
	        		admin.create();
	        		break;
	        	case 2:
	        		admin.delete();
	        		break;
	        	case 3:
	        		admin.admin();
	        		break;
	        	}
	        	
	        }while(option!=0);
	       
	    }

}
