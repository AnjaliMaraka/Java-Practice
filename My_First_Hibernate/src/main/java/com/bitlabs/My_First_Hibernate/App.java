package com.bitlabs.My_First_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        cfg.configure("com/bitlabs/My_First_Hibernate/hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        
       
        Session s=sf.openSession();
        Employee emp=new Employee();
        emp.setId(101);
        emp.setName("Anjali");
        
        Transaction tx=s.beginTransaction();
        
        s.save(emp);
        
        tx.commit();
        s.close();
        
        
        
    }
}
