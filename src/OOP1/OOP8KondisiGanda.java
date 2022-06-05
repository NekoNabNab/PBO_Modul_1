/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import java.util.Scanner;


public class OOP8KondisiGanda {
    public static void main (String [] args){
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Masukkan nilai TPA            : ");
        int TPA = masukkan.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris : ");
        int BahasaInggris = masukkan.nextInt();
        System.out.print("Masukkan nilai Matematika     : ");
        int Matematika = masukkan.nextInt();
        
        // && artinya semua kondisi itu harus terpenuhi //
        // || artinya salah satu atau semua harus terpemuhi //
        
        if ((TPA > 85) && (BahasaInggris > 80) && (Matematika > 80))
            System.out.println("Siswa dapat beasiswa");
        else 
            System.out.println("Siswa tidak dapat beasiswa");
    }
    
}
