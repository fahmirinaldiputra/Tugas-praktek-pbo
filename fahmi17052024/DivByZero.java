/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fahmi17052024;

import static fahmi17052024.PembagianKosong.bagi;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DivByZero {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       try{
           System.out.println("Masukan nilai yang akan dibagi =");
           int nilai1 = input.nextInt();
           System.out.println("Masukan nilai pembagi =");
           int nilai2=input.nextInt();
           int result = bagi(nilai1,nilai2);
       System.out.println("Hasil = "+result);
       }catch(ArithmeticException e){
           System.out.println("Pesan Eror:"+e);
       }
    }
    
}
