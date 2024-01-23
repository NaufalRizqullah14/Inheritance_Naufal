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
public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;
    @Override
double luas(){
       double hasil = panjang+lebar;
       System.out.println("Luas PersegiPanjang"
       + "= "+ hasil);
       return hasil;
}
}

