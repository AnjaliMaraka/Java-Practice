package com.bitlabs.HibernateCurdOperation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.bitlabs.Dao.TharabaiDao;
import com.bitlabs.Dao.TharabaiDaoInterface;
import com.bitlabs.Entity.TharabaiBatch;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        TharabaiDaoInterface dao=new TharabaiDao();
        int option=0;
        
        do {
        	System.out.println("Enter 1 to insert student data ");
        	System.out.println("Enter 2 to get all student data ");
        	System.out.println("Enter 3 to update student data ");
        	System.out.println("Enter 4 to get  student by id  ");
        	System.out.println("Enter 5 to delete student by id ");
        	System.out.println("Enter 6 to get decending order by using marks ");
        	System.out.println("Enter 7 to get ascending order by using marks ");
        	System.out.println("Enter 8 to get marks between 90 and 95");
        	System.out.println("Enter 9 to get group by grades");
        	System.out.println("Enter 10 to get group by Location");
        	System.out.println("Enter 0 to exit ");
        	option=sc.nextInt();
        	
        	switch(option) {
        	case 1:
        		dao.insert();
        		break;
        	case 2:
        		dao.getAllStudent();
        		break;
        	case 3:
        		dao.updateById(1);
        		break;
        	case 4:
        		dao.getStudentById(1);
        		break;
        	case 5:
        		dao.deleteStudentById(1);
        		break;
        	case 6:
        		dao.descStudentByMarks();
        		break;
        	case 7:
        		dao.ascStudentByMarks();
        		break;
        	case 8:
        		dao.getStudentByMarks();
        		break;
        		
        	case 9:
        		dao.groupByStudentGrde();
        		break;
        	case 10:
        		dao.groupByStudentLocation();
        		break;
        		
        		}
        	
        }while(option!=0);
         // dao.insert();
        //dao.getAllStudent();
        //dao.updateById(11);
        //dao.getStudentById(11);
        //dao.deleteStudentById(11);
    }
}