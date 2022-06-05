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
public class OOP10Counter {
    public static void main (String [] args){
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Masukkan batas bilangan : ");
        int batas = masukkan.nextInt();
        int hasil = 0;
        for (int i = 1; i <= batas; i++) {
            hasil += i;
            System.out.println("Total jumlahnya adalah : " + hasil);
            
        }
    }
}
