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
public class OOP6KonversiNilai {
    public static void main (String [] args){
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Masukkan nilai WEB : ");
        int nilai = masukkan.nextInt();
        if (nilai >- 90)
            System.out.println("Nilai A");
        else if (nilai >- 75)
            System.out.println("Nilai B");
        else if (nilai >- 50)
            System.out.println("Nilai C");
        else if (nilai >- 35)
            System.out.println("Nilai D");
        else
            System.out.println("Nilai E");
    }
}
