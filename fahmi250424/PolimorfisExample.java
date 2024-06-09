/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahmi250424;

/**
 *
 * @author user
 */
public class PolimorfisExample {
    public static void printInformation(person p){
        System.out.println("Nama     :"+p.getName());
        System.out.println("Alamat   :"+p.getAddress());
    }
    public static void main(String[] args){
        //person  ref;
        Student studentObject = new Student();
        studentObject.setName("Ali");
        studentObject.setAddress("PadangPanjang");
        Employee employeeObject = new Employee();
        employeeObject.setName("Deni");
        employeeObject.setAddress("Padang Panjang");
        
        
       /* ref = studentObject;
        System.out.println("Nama    :"+ref.getName());
        System.out.println("Alamat  :"+ref.getAddress());
        
        ref = employeeObject;
        System.out.println("Nama    :"+ref.getName());
        System.out.println("Alamat  :"+ref.getAddress());
        */
       
       printInformation(studentObject);
       printInformation(employeeObject); 
    }
}
