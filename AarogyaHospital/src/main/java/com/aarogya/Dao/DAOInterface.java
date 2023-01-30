package com.aarogya.Dao;

public interface DAOInterface {
	public void patientRegistration(Patient p);
	public void viewPatientData();
	public void searchPatientById(int id);
	public void searchPatientByCity(String city);
	public void searchPatientByAge(int start,int end);
	public void markRecoveryPatient(int id);
	public void deletePatientById(int id);
}
