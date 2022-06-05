/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import java.util.Scanner;

public class LuasBalok {
    public static void main (String [] args){
        
        Scanner masukkan = new Scanner (System.in);
        
        int p,l,t;
        
        System.out.print("Masukkan Nilai Panjang Balok  : ");
        p = masukkan.nextInt();
        
        System.out.print("Masukkan Nilai Lebar Balok    : ");
        l = masukkan.nextInt();
        
        System.out.print("Masukkan Nilai Tinggi Balok   : ");
        t = masukkan.nextInt();

        System.out.println("===================================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("===================================");
        System.out.println("Luas Permukaan Balok adalah " + ((2*p*l)+(2*p*t)+(2*l*t)));
        
    }
}
