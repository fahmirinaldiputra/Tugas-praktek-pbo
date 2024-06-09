/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacce;

/**
 *
 * @author user
 */
public class RelationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Line line1 = new Line(1, 5, 1,  4);
        Line line2 = new Line(2, 5, 1,  4);
        
        Relation line = new Line();
        System.out.println("Line 1   :"+line1.getLenght());
        System.out.println("Line 2   :"+line2.getLenght());
        System.out.println(line.isEqual(line1, line2));
        System.out.println(line.isGreater(line1, line2));
        System.out.println(line.isLess(line1, line2));
    }
    
}
