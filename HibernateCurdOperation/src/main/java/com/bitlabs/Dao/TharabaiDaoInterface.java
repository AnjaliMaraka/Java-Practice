package com.bitlabs.Dao;

public interface TharabaiDaoInterface {
	 public void insert();
	 public void getAllStudent();
	 public void updateById(int id);
	 public void getStudentById(int id);
	 public void deleteStudentById(int id);
	 public void descStudentByMarks();
	 public void ascStudentByMarks();
	 public void getStudentByMarks();
	 public void groupByStudentGrde();
	 public void groupByStudentLocation();
	 }
