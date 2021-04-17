package com.rajesh.HibDemo;

import com.rajesh.HibDemo.DAO.AssociationJoin;
import com.rajesh.HibDemo.DTO.Laptop;
import com.rajesh.HibDemo.DTO.Student;
import com.rajesh.HibDemo.DTO.StudentName;

public class App 
{
    public static void main( String[] args )
    {
        Laptop laptop = new Laptop();
        laptop.setLid(510);
        laptop.setLname("Lenovo");
        
        StudentName sn = new StudentName();
        sn.setfName("Rajesh");
        sn.setlName("Panda");
        
        Student student = new Student();
        student.setName(sn);
        student.setMark(66.5);
        student.setLaptop(laptop);
        
        AssociationJoin aj = new AssociationJoin();
        aj.saveDetails(student);
    }
}
