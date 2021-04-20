package com.rajesh.HibDemo.DTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "studentMark")
public class Student implements Serializable {

	@Id
	@GenericGenerator(name = "RollNo", strategy = "increment")
	@GeneratedValue(generator = "RollNo")
	@Column(name = "r_no")
	private int rollno;
	// @Transient - Temp Value that doesn't store in DB
	@Column(name = "name")
	private StudentName name;
	private Double mark;
	/*
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	 private Laptop laptop;

	 * public Laptop getLaptop() { return laptop; }
	 * 
	 * public void setLaptop(Laptop laptop) { this.laptop = laptop; }
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "l_id")
	private List<Laptop> laptop;
	
	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public StudentName getName() {
		return name;
	}

	public void setName(StudentName name) {
		this.name = name;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + ", laptop=" + laptop + "]";
	}


}
