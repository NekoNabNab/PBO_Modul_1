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
public class OOP_KalkulatorSederhana {
    public static void main (String [] args){
        
        Scanner masukkan = new Scanner (System.in);
        
        System.out.print("Masukan Variabel 1        : ");
        int a = masukkan.nextInt ();
        
        System.out.print("Masukan Variabel 2        : ");
        int b = masukkan.nextInt ();        
        
        int hasil_a = a + b;
        int hasil_b = a - b;
        int hasil_c = a * b;
        int hasil_d = a / b;
        
        System.out.println("Hasil penjumlahan adalah           : " + hasil_a);
        System.out.println("Hasil pengurangan adalah           : " + hasil_b);
        System.out.println("Hasil perkalian adalah             : " + hasil_c);
        System.out.println("Hasil pembagian adalah             : " + hasil_d);

    }
}
