/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhlamSaleh_19425106;

/**
 *
 * @author WELCOME
 */

import java.util.*;
public class Student extends People{
    private int weight;
    private Date AdmissionDate;
    private String year;
    Student()
    {
        
    }
    Student(String Name, int Id, int Age, boolean isFemale, int weight, String year)
    {
        
        super(Name,Id,Age,isFemale);
        this.weight=weight;
        this.year = year;
        AdmissionDate= new Date();
        

    }
    
    public int getweight()
    {
        return this.weight;
    }
    public void setweight(int weight)
    {
        this.weight=weight;
    }
    
    public Date getAdmissionDate()
    {
        return this.AdmissionDate;
    }

    public String getyear() {
        return this.year;
    }

    public void setyear(String year) {
        this.year = year;
    }
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Student)
        {
            Student s=(Student)o;
            if(super.equals(s))
            {
                return s.getweight() == this.weight && s.getAdmissionDate().equals(this.AdmissionDate)&& s.getyear().equals(this.year);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "weight=" + weight + ", AdmissionDate=" + AdmissionDate + ", year=" + year ;
    }
    
    
   
}
