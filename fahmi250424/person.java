/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahmi250424;

/**
 *
 * @author user
 */
public class person {
    protected String name;
    protected String address;
    
    public person() {
        System.out.println("Person:Constructor");
    name="";
    address="";  
} 
/**
 * Constructor dengan dua parameter
 */
 public person(String name,String address){
 this.name = name;
 this.address = address;
 }
 /**
  * Method accssor
  */
 public String getName(){
     System.out.println("Person getName");
     return name;
 }
 public String getAddress(){
     return address;
 }
 public void setName(String name){
    this.name = name;
 }
 public void setAddress(String address){
    this.address = address;
 }
}
