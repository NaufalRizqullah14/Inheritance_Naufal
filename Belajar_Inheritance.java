package bangundatar;

import java.util.Scanner;

public class Belajar_Inheritance {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi();
        System.out.println("masukan  nilai persegi :");
        persegi.sisi = input.nextInt();
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("masukan nilai lingkaran :");
        lingkaran.r = input.nextInt();
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.println("masukan nilai persegi panjang :");
        persegiPanjang.panjang = input.nextInt();
        persegiPanjang.lebar = input.nextInt();
        
        Segitiga segitiga = new Segitiga();
        System.out.println("masukan nlai segitiga :");
        segitiga.alas = input.nextInt();
        segitiga.tinggi = input.nextInt();
        
       bangunDatar.luas();
       bangunDatar.keliling();
       
       persegi.luas();
       persegi.keliling();
       
       lingkaran.luas();
       lingkaran.keliling();
       
       persegiPanjang.luas();
       persegiPanjang.keliling();
       
       segitiga.luas();
       segitiga.keliling();
       
       
               
    }
    
}
