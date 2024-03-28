/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventori;

/**
 *
 * @author user
 */
public class ProductTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 6 object Product
        // 2 object mengacu pada default constructor
        Product p1=new Product();
        Product p2=new Product();
        // 4 Object mengacu pada constructor dengan parameter
        Product p3= new Product(1,"rinso 1.8 kg",10,48500.00);
        Product p4= new Product(2,"molto cair 100 ml",25,15500.00);
        Product p5= new Product(3,"Pepsodent 100 gr",250,7500.00);
        Product p6= new Product(4,"Lifeboy 150 ml",35,20000.00);
        
        System.out.println(p1); 
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5); 
        System.out.println(p6);
         
    }
    
}
