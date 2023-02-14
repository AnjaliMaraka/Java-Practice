package com.bitlabs.Dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Admin;
import com.bitlabs.Entity.TharabaiBatch;

public class AdminDao {
	Scanner sc=new Scanner(System.in);
	public void create() {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx=s.beginTransaction();
    	System.out.println("Enter username");
    	String username=sc.next();
    	System.out.println("Enter password");
    	String password=sc.next();
		Admin admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		s.save(admin);
		tx.commit();
		s.close();
	}
	public void delete() {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		Admin admin = (Admin) s.get(Admin.class,1);

	}
	public void admin() { 
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session s = sf.openSession();
	Query query = s.createQuery("GRANT delete ON TharabaiBatch TO Admin");
	List<TharabaiBatch> list = query.list();
	for(TharabaiBatch x: list) {
		System.out.println(x.getId()+"    "+x.getName()+"   "+x.getEmail()+"   "+x.getMarks());
		
	}
	}
	
}
