package com.bitlabs.Mapping.ManyToMany;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Employee;
import com.bitlabs.Entity.Project;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setEid(101);
        e1.seteName("Anjali");
        
        e2.setEid(102);
        e2.seteName("Bala");
        
        Project p1=new Project();
        Project p2=new Project();
        p1.setId(201);
        p1.setpName("java project");
        
        p2.setId(202);
        p2.setpName("Python Project");
        
        List <Employee> list1=new ArrayList();
        list1.add(e1);
        list1.add(e2);
        
        List <Project> list=new ArrayList();
        
        list.add(p1);
        list.add(p2);
        e1.setP(list);
        e2.setP(list);
        
        
        p1.setEmp(list1);
        p2.setEmp(list1);
        s.save(p1);
        s.save(p2);
        s.save(e1);
        s.save(e2);
        tx.commit();
        s.close();
        
        
    }
}
