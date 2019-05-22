/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*date 22/05/2019*/
package studenttemplate;



/**
 *
 * @author lovey
 */
public class StudentTester {
    public static void main(String[] args) {
    StudentTemplate s1=new StudentTemplate(); 
    s1.setName("lovepreet");
    //System.out.println(s1.getName());
    StudentTemplate s2=new StudentTemplate(); 
    s2.setName("singh");
    //System.out.println(s2.getName());
    StudentTemplate[] list=new StudentTemplate[2];//Array of objects
    list[0]=s1;
    list[1]=s2;
    for(int i=0; i<list.length;i++)
    {
        System.out.println(list[i].getName());
    }
    }
    
}
