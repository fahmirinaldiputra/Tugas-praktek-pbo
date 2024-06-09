/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahmi250424;

/**
 *
 * @author user
 */
public class Student extends person {
    public Student() {
        super("Ali","Padang");
        System.out.println("Student:Constructor");
    }
    @Override
    public String getName(){
     System.out.println("Student getName()");
     return name;
    }
}
