/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import java.util.Scanner;

public class Biodata {
    public static void main (String [] args){
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Nama              : ");
        String Nama = masukkan.nextLine();
        
        System.out.print("NIS               : ");
        String NIS = masukkan.nextLine();
        
        System.out.print("Tempat Lahir      : ");
        String TempatLahir = masukkan.nextLine();
        
        System.out.print("Jenis Kelamin     : ");
        String JenisKelamin = masukkan.nextLine();
        
        System.out.print("Alamat di Malang  : ");
        String AlamatMalang = masukkan.nextLine();
    }
}
