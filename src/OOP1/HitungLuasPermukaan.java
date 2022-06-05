/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import java.util.Scanner;

/**
 *
 * @author nabil
 */
public class HitungLuasPermukaan {
    public static void main (String [] args){
        System.out.println("Hitung Luas Permukaan Bola");
        System.out.println("==================================");
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Masukkan jari-jari (cm)    : ");
        int jarijari = masukkan.nextInt();
        
        double LuasPermukaan;
        double phi = 3.14; 
        LuasPermukaan = 4*phi*jarijari;
        System.out.println("Luas Permukaan             : "+LuasPermukaan);
    }
}
