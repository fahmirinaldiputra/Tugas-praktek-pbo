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
public class ArrayExceptionExample {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    try{
        System.out.println("Masukan ukuran array");
    int uk=input.nextInt();
    //deklarasi array
    int[] nilai=new int [uk];
    for(int i=0;i<uk;i++){
        System.out.println("Nilai indeks array ke "+i+" = ");
        nilai [i]=input.nextInt();
    }
    System.out.println("Indeks array yang akna ditampilkan =  ");
    int index=input.nextInt();
    
    System.out.println("Nilai indeks ke "+index+"="+nilai[index]);
    }catch(InputMismatchException e){
    System.out.println("Data input tidak sesuai dengan tipe");
    }catch(NegativeArraySizeException e){
        System.out.println("Ukuran array tidak boleh negatif");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Angka yang dimasukan array berlebih");
    }finally{
        System.out.println("Block Exception");
    }
    }
    
}
