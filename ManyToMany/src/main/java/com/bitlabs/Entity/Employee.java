package com.bitlabs.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String eName;
	
	@ManyToMany(mappedBy="emp")
	private List<Project> p;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<Project> getP() {
		return p;
	}

	public void setP(List<Project> p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", p=" + p + "]";
	}

	public Employee(int eid, String eName, List<Project> p) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.p = p;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
