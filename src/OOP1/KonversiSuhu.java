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
public class KonversiSuhu {
    public static void main (String[] args){
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Masukkan suhu celcius           : ");
        int c = masukkan.nextInt();
        
        System.out.println("Convert Celcius to Reamur       : " +CtoR(c));
        System.out.println("Convert Celcius to Fahrenheit   : " +CtoF(c));
        System.out.println("Convert Celcius to Kelven       : " +CtoK(c));

    }

    static double CtoR (double c){
      return 0.8*c;
    }
    static double CtoF (double c) {
        return 1.8*c+32;
    }
    static double CtoK (double c) {
        return c+273;
    }
}
