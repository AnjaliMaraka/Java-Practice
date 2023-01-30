package com.aarogya.Dao;

import java.sql.*;

public class DAOImpl implements DAOInterface {
	Connection con=null;
	public DAOImpl() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","root");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Override
	public void patientRegistration(Patient p) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("insert into Patient values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, null);
			ps.setString(2,p.getName());
			
			ps.setString(3,p.getGender());
			ps.setString(4,p.getCity());
			ps.setInt(5,p.getAge());
			ps.setLong(6,p.getAadharcard());
			ps.setLong(7, p.getContact());
			ps.setString(8,p.getAddress());
			ps.setString(9,p.getDateofaddmission());
			ps.setString(10,p.getG_name());
			ps.setString(11,p.getG_aadress());
			ps.setLong(12, p.getG_contact());
			ps.setString(13,p.getP_recovery());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void viewPatientData() {
		// TODO Auto-generated method stub
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient ");
			while(rs.next())
			{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getLong(6)+" "+rs.getLong(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void searchPatientById(int id) {
		// TODO Auto-generated method stub
		try
		{
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from patient where id='"+id+"'");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getLong(6)+" "+rs.getLong(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
		}
		}
		catch(Exception e)
		{
		e.printStackTrace(); 
		}

	}
	@Override
	public void searchPatientByCity(String city) {
		// TODO Auto-generated method stub
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient where city='"+city+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getLong(6)+" "+rs.getLong(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void searchPatientByAge(int start,int end) {
		// TODO Auto-generated method stub
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient where age between'"+start+"'and'"+end+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getLong(6)+" "+rs.getLong(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void markRecoveryPatient(int id) {
		// TODO Auto-generated method stub
		{
			try
			{
			Statement st=con.createStatement();
			int i=st.executeUpdate("update patient set P_recovery ='"+"recoverd"+"' where id= '"+id+"'");
			if(i!=0)
			{
			System.out.println("patient has been recoverd successfully:");
			}
			}
			catch(Exception e)
			{
			e.printStackTrace(); 
			}
		}
		
	}
	@Override
	public void deletePatientById(int id) {
		// TODO Auto-generated method stub
		{
			try
			{
			Statement st=con.createStatement();
			int i=st.executeUpdate("delete from patient where id='"+id+"'");
			if(i!=0)
			{
			System.out.println("patient has been deleted successfully:");
			}
			}
			catch(Exception e)
			{
			e.printStackTrace(); 
			}
			}

	}
//	@Override
//	public void patientRegistration(Object p) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
