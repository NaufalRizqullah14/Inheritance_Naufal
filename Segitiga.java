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
public class Segitiga extends BangunDatar{
    double alas;
    double tinggi;
    @Override
    double luas() {
        double luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    
}

}