/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delta_synchronous_computer_science_organization.gradetracker_project;

/**
 *
 * @author Blackstone
 */
public class Classes 
{
    public String subject;
    public String section;
    public double overallGrade; //Need to figure out how to keep track of someones overall grade in a certain class when they have multiple
    public double assignment;  //This should be added by the user and should influence thier overall grade. Still need to work out stuff like weighting
    
    public Classes(String sub, String sec, double grade)
    {
        subject = sub;
        section = sec;
        overallGrade = grade;
        assignment = 0.0;
    }
    
    public Classes()
    {
        subject = "No Subject";
        section = "No Section";
        overallGrade = 0.0;
        assignment = 0.0;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public String getSection()
    {
        return section;
    }
    
    public double getGrade()
    {
        return overallGrade;
    }
    
    public double lastAssignment()
    {
        return assignment;
    }
    
    public void addClass(String sub, String sec, double grade) //Need to figure out the container to keep track of these
    {
        subject = sub;
        section = sec;
        overallGrade = grade;
    }
}
