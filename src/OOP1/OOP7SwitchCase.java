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
public class OOP7SwitchCase {
    public static void main (String [] args){
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Silahkan pilih angka 1 2 3 : ");
        int bil = masukkan.nextInt ();
        switch (bil) {
            case 1 : System.out.println("Satu");
            break;
            case 2 : System.out.println("Dua");
            break;
            case 3 : System.out.println("Tiga");
            break;
        }
    }
}
