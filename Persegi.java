/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author SMK TELKOM 08
 */
public class Persegi extends BangunDatar{
   double sisi;
   
   @Override
   double luas(){
       double hasil = sisi+sisi;
       System.out.println("Luas Persegi"
       + "= "+ hasil);
       return hasil;
   }
   @Override
   double keliling(){
       double hasil = 4*sisi;
       System.out.println("Keliling Persegi"
       + "= "+ hasil);
       return hasil;
   }
}    
