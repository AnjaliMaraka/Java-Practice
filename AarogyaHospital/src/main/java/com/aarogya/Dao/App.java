package com.aarogya.Dao;

import java.io.*;
import java.util.*;

public class App {
//	int id,age;
//	String name,gender,city,aadress,dateofadmission,g_name,g_aadress,p_recovery;
//	long aadhrcard,contact,g_contact;
	public static void main(String args[]) {
		DAOInterface dao=new DAOImpl();
		Patient p[]=new Patient[3];
		Scanner sc=new Scanner(System.in);
		boolean ch=true;
		try {
			FileReader fr=new FileReader("Book1.csv");
			BufferedReader br=new BufferedReader(fr);
		while(ch) {
			System.out.println("*************Menu*************");
			System.out.println("1.patient Registration\n2.view Patient Data\n3.search Patient By Id\n4.search Patient By City\n5.search Patient By Age\n6.mark Recovery Patient\n7.delete Patient By Id");
			System.out.println("Enter choice from menu ");
			int choice=sc.nextInt();
			switch(choice) {
			 case 1:
                 String str;
					while((str=br.readLine())!=null) {
						int i=0;
						p[i]=new Patient();
						String arr[]=str.split(",");
						p[i].setName(arr[0]);
						if(arr[1].length()<=2) {
							p[i].setAge(Integer.parseInt(arr[1]));
						}
						else {
							System.out.println("invalid age");
							break;
						}
						
						p[i].setGender(arr[2]);
						
						if(arr[3].length()==12) {
							
							p[i].setAadharcard(Long.parseLong(arr[3]));
						}	
						else {
							System.out.println("invalid addhar card number");
							break;
						}
						if(arr[4].length()==10) {
							p[i].setContact(Long.parseLong(arr[4]));
						}
						else {
							System.out.println("contact number invalid");
							break;
						}
						
						p[i].setCity(arr[5]);
						p[i].setAddress(arr[6]);
						p[i].setDateofaddmission(arr[7]);
						p[i].setG_name(arr[8]);
						p[i].setAddress(arr[9]);
						p[i].setG_contact(Long.parseLong(arr[10]));
						p[i].setP_recovery(arr[11]);
						
						dao.patientRegistration(p[i]);
						i++;
					}	
					break;
			 case 2:
				 dao.viewPatientData();
                 break;
			 case 3:
				 System.out.println("Enter Patient Id you want see");
                 int id1=sc.nextInt();
                 dao.searchPatientById(id1);
                 break;
			 case 4:
				 System.out.println("Enter patient city to view all patients in that city");
                 String ci=sc.next();
                 dao.searchPatientByCity(ci);
                 break;
             case 5:
                 System.out.println("Enter Age group limits that you want patient details");
                 int start=sc.nextInt();
                 System.out.println("Enter End Age group");
                 int end=sc.nextInt();
                 dao.searchPatientByAge(start,end);
                 break;
             case 6:
                 System.out.println("Enter patient id to mark as recovered");
                 int id2=sc.nextInt();
                 dao.markRecoveryPatient(id2);
                 break;
             case 7:
                 System.out.println("Enter patient id to delete");
                 int id3=sc.nextInt();
                 dao.deletePatientById(id3);
                 break;
             default:
                 ch=false;
                 System.out.println("Exit");
                 break;
             }
             }
		}
         
         catch(Exception e)
         {
                 e.printStackTrace();
         }
	}
				 
}
