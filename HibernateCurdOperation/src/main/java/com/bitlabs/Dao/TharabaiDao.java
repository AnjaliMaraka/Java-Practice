package com.bitlabs.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.TharabaiBatch;
import java.util.Scanner;

public class TharabaiDao implements TharabaiDaoInterface{

	//insert the data (create operation)
	//get all studentds (read operation)
	//update studet by id (update operation)
	//delete student by id (delete operation)
	Scanner sc=new Scanner(System.in);
	
	public void insert() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	System.out.println("Enter Student name");
    	String name=sc.next();
    	System.out.println("Enter Student emil");
    	String email=sc.next();
    	System.out.println("Enter Student marks");
    	int marks=sc.nextInt();
    	System.out.println("Enter Student grade");
    	String grade=sc.next();
    	System.out.println("Enter Student location");
    	String location=sc.next();
    	
    	
    	TharabaiBatch obj=new TharabaiBatch();
    	obj.setName(name);
    	obj.setEmail(email);
    	obj.setMarks(marks);
    	obj.setGrade(grade);
    	obj.setLocation(location);
    	
    	s.save(obj);
    	System.out.println("Inserted data successfully");
    	tx.commit();
    	s.close();
	}
	public void getAllStudent() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	
    	Query query=s.createQuery("from TharabaiBatch");
    	List<TharabaiBatch> list=new ArrayList();
    	 list=query.list();
    	
    	for(TharabaiBatch x: list) {
    		System.out.println(x.getId()+"    "+x.getName()+"   "+x.getEmail()+"   "+x.getMarks());
    		
    	}
    	
    	s.close();
	}
	public void updateById(int id) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
    	TharabaiBatch obj=s.get(TharabaiBatch.class, id);
    	
    	obj.setName("Balanjali");
    	
    	
    	s.save(obj);
    	System.out.println("updated data successfully");
    	tx.commit();
    	s.close();
		
	}
	
	public void getStudentById(int id) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
    	TharabaiBatch obj=s.get(TharabaiBatch.class, id);
    	
    	System.out.println(obj);
    	
    	
    	s.save(obj);
    	
    	tx.commit();
    	s.close();
	}
	public void deleteStudentById(int id) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
    	TharabaiBatch obj=s.get(TharabaiBatch.class, id);
    	
    	System.out.println(obj);
    	
    	
    	s.delete(obj);
    	System.out.println("Deletd data successfully");
    	tx.commit();
    	s.close();
	}
	public void descStudentByMarks() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
		Query query = s.createQuery("FROM TharabaiBatch t ORDER BY t.marks DESC");
		List<TharabaiBatch> list = query.list();
		for(TharabaiBatch x: list) {
    		System.out.println(x.getId()+"    "+x.getName()+"   "+x.getEmail()+"   "+x.getMarks());
    		
    	}
    	
    	s.close();
	}
	public void ascStudentByMarks() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
		Query query = s.createQuery("FROM TharabaiBatch t ORDER BY t.marks");
		List<TharabaiBatch> list = query.list();
		for(TharabaiBatch x: list) {
    		System.out.println(x.getId()+"    "+x.getName()+"   "+x.getEmail()+"   "+x.getMarks());
    		
    	}
    	
    	s.close();
	}
	public void getStudentByMarks() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
		Query query = s.createQuery("FROM TharabaiBatch t WHERE t.marks BETWEEN 90 AND 95");
		List<TharabaiBatch> list = query.list();
		
		for(TharabaiBatch x: list) {
    		System.out.println(x.getId()+"    "+x.getName()+"   "+x.getEmail()+"   "+x.getMarks());
    		
    	}
	}
	public void groupByStudentGrde() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
    	Query query = s.createQuery("FROM TharabaiBatch t ORDER BY t.grade");
    	List<TharabaiBatch> list = query.list();
    	for(TharabaiBatch x: list) {
    		System.out.println(x.getId()+"    "+x.getName()+"   "+x.getEmail()+"   "+x.getMarks()+"   "+x.getGrade()+"   "+x.getLocation());
    		
    	}
	}
	public void groupByStudentLocation() {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Query qe = ss.createQuery("select count(name),location from TharabaiBatch group by location");
		List <Object[]> ls = new ArrayList();
		ls=qe.list();
		System.out.println("count"+" "+"location");
		for(Object[] result : ls) {
			//Integer count = (Integer) result[0];
		    //String city = (String) result[1];
			
		    System.out.println( result[0] + ": " + result[1]);
		}
	}
	
	
	
	
	
	
	
	
}
