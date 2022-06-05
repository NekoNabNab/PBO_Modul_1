/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import java.util.Scanner;

public class KonversiSuhu2 {
    public static void main (String [] args){
        
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Masukkan suhu celcius           : ");
        double c = masukkan.nextInt();
        
        double CtoR, CtoF, CtoK;
        CtoR = (0.8*c);
        CtoF = (1.8*c+32);
        CtoK = (c+273);
        
        System.out.println("Convert Celcius to Reamur       : " +CtoR);
        System.out.println("Convert Celcius to Fahrenheit   : " +CtoF);
        System.out.println("Convert Celcius to Kelven       : " +CtoK);
    }
    
}
