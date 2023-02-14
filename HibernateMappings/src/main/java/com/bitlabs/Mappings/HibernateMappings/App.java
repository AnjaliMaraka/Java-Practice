package com.bitlabs.Mappings.HibernateMappings;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity1.Answer;
import com.bitlabs.Entity1.Question;

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
         Question q=new Question();
         q.setId(101);
         q.setQuestion("What is JAVA");
         
         Answer a1=new Answer();
         a1.setId(201);
         a1.setAnswer("Java is a Programming language");
         a1.setQue(q);
         Answer a2=new Answer();
         a2.setId(202);
         a2.setAnswer("Java is a Strongly typed language");
         a2.setQue(q);
         Answer a3=new Answer();
         a3.setId(203);
         a3.setAnswer("Java is a secured language");
         a3.setQue(q);
         List<Answer> list=new ArrayList();
         list.add(a1);
         list.add(a2);
         list.add(a3);
         q.setAns(list);
      
         s.save(q);
         s.save(a1);
         s.save(a2);
         s.save(a3);
         tx.commit();
         s.close();
    }
}
