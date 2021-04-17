package com.rajesh.HibDemo.DTO;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "student")
public class StudentName {
	private String fName;
	private String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "StudentName [fName=" + fName + ", lName=" + lName + "]";
	}
	

}
