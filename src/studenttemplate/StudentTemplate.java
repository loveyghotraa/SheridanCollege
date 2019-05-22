/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttemplate;

/**
 *
 * @author lovey
 */
public class StudentTemplate {

    /**
     * @param args the command line argument
     */
    private String name;//encapsulation
    private int student_id;
    private int maxCourse;

    // TODO code application logic here
    /**
     * @return the name
     */
    //constructors
    public StudentTemplate() {

    }

    public StudentTemplate(String name, int studentId) {
        this.name = name;
        this.student_id = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudent_Id() {
        return student_id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setStudent_Id(int studentId) {
        this.student_id = studentId;
    }

    /**
     * @return the maxCourse
     */
    public int getMaxCourse() {
        return maxCourse;
    }

    /**
     * @param maxCourse the maxCourse to set
     */
    public void setMaxCourse(int maxCourse) {
        this.maxCourse = maxCourse;
    }

}
