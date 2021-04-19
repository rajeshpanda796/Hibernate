package com.rajesh.HibDemo.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Laptop")
public class Laptop {
	@Id
	private int lid;
	private String lname;
	//@OneToOne(mappedBy = "rollno")
	//private int rollno;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
