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
public class PersegiPanjang implements Relation {
    private double panjang;
    private double lebar;
   
    
    
    public  PersegiPanjang(){}
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        
    }
    public double getLuas(){
        double  luas =(panjang*lebar);
        return luas;
    }
     public double getKeliling(){
        double  keliling =2 * (panjang+lebar);
        return keliling;
    }
    
    public boolean isGreater(Object a,Object b){ 
        double aLen = ((PersegiPanjang)a).getLuas();
        double bLen = ((PersegiPanjang)b).getLuas();
        return(aLen > bLen);  
    }
    public boolean isLess(Object a,Object b){
        double aLen = ((PersegiPanjang)a).getLuas();
        double bLen = ((PersegiPanjang)b).getLuas();
        return(aLen < bLen);  
    }
    public boolean isEqual(Object a,Object b){
        double aLen = ((PersegiPanjang)a).getLuas();
        double bLen = ((PersegiPanjang)b).getLuas();
        return(aLen == bLen);
    }
}
