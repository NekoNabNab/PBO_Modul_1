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
public class OOP11PerulanganWhile11 {
    public static void main (String[] args){
        Scanner masukkan = new Scanner (System.in);
        int a = 0, total=0, bil=7;
        while (bil !=0){
            a++;
            System.out.print("Masukkan bilangan ke-" + (a) + " bilangan : ");
            bil = masukkan.nextInt();
            total += bil;
        }
        System.out.print("Total semua bilangan            :");
        System.out.println(total);
    }
}
