/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package delta_synchronous_computer_science_organization.gradetracker_project;

import javax.swing.JOptionPane;

/**
 *
 * @author Blackstone
 */


public class GradeTracker_Project {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// - --------------- DECISIONS MADE ----------------
// -- Decided to not have a separate Grades datatype for now because it has no justification
// -- We have not yet decided on dataype for list of classes and list of grades


// ------------------ CONSIDERATIONS -------------  
// -- We are going to have a list of classes (Math, Composition, History)
// -- Those classes will have their own grades(Math: 40, 80, 100, 200, ; Composition: 20, 50, 60 etc)
// -- We have to know the most efficient way of storing this kind of information

// -- To build a graph, we will need a max value for the potential Y axis