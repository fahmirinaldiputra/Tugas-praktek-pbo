/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fahmi17052024;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PembagianKosong {
    // method
    public static int bagi(int a, int b) throws ArithmeticException{
        if (b==0)
            throw new ArithmeticException("tidakk boleh pembagian nol ");
        return a/b;
    }
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
       }catch(InputMismatchException e){
           System.out.println("Nilai yang akan diinputkan salah");
       }catch(Exception e){
           System.out.println("Pengecualian lain"+e.getMessage());
       }finally{
           System.out.println("Program Exception Berakhir");
       }
       
    }
    
}
