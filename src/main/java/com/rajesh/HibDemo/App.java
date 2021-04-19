package com.rajesh.HibDemo;

import java.util.ArrayList;
import java.util.List;

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
        
        Laptop laptop1 = new Laptop();
        laptop1.setLid(509);
        laptop1.setLname("Asus");
        
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop1);
        
        StudentName sn = new StudentName();
        sn.setfName("Rajesh");
        sn.setlName("Panda");
        
        Student student = new Student();
        student.setName(sn);
        student.setMark(66.5);
        student.setLaptop(laptops);
        
        AssociationJoin aj = new AssociationJoin();
        aj.saveDetails(student);
    }
}
