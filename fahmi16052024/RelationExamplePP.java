/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahmi16052024;

import interfacce.Relation;

/**
 *
 * @author user
 */
public class RelationExamplePP {
    public static void main(String[] args) {
        PersegiPanjang luas1 = new PersegiPanjang(10, 20);
        PersegiPanjang luas2 = new PersegiPanjang(15, 30);
        
        Relation luas = new PersegiPanjang();
        System.out.println("Luas 1   :"+luas1.getLuas());
        System.out.println("Luas 2   :"+luas2.getLuas());
        System.out.println(luas.isEqual(luas1, luas2));
        System.out.println(luas.isGreater(luas1, luas2));
        System.out.println(luas.isLess(luas, luas2));
    }
}
