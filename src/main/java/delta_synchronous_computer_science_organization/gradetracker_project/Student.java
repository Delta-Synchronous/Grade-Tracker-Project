/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delta_synchronous_computer_science_organization.gradetracker_project;

import java.util.ArrayList;

/**
 *
 * @author Blackstone
 */
public class Student {
    public String first_name;
    public String last_name;
    public enum classification{FRESHMAN, SOPHOMORE, JUNIOR, SENIOR};
    public ArrayList<Classes> student_subjectclass; //We should convert this to a list that is able to grow
   // public Grades studentgrades; //Not sure if this should be here
    public classification estudent_class;
   
    
    //constructors
    public Student(String first_name, String last_name, classification estudent_class, ArrayList<Classes> student_subjectclass){
        this.first_name = first_name;
        this.last_name = last_name;
        this.estudent_class = estudent_class;
        this.student_subjectclass = student_subjectclass;
    }
    public Student() {
        this.first_name = "";
        this.last_name = "";
        this.estudent_class = estudent_class.FRESHMAN;
        this.student_subjectclass = new ArrayList<Classes>();
    }
    
    //setters
    public void setFname(String fName) {
        first_name = fName;
    }
    
    public void setLname (String lName) {
        last_name = lName;
    }
    
    public void setClassification (classification eclass) {
        estudent_class = eclass;
    }
    
    //getters
    public String getFname () {
        return first_name;
    }
    
    public String getLname() {
        return last_name;
    }
    
    public classification getClassification() {
        return estudent_class;
    }
    
}
