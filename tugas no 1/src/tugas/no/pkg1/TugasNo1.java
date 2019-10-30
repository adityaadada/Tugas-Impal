/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.no.pkg1;



import java.util.Scanner;

public class TugasNo1 {

  
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        double a;
        double b;
        double c;
        
        System.out.print ("masukan panjang tiap sisi");
        
        System.out.print ("\nsisi 1: ");
        a = input.nextDouble();
        System.out.print ("sisi 2: ");
        b = input.nextDouble ();
        System.out.print ("sisi 3: ");
        c = input.nextDouble ();

        if ((a <= 0) || (b <= 0) || (c <= 0)) {
        System.out.println("EROR");
        } else {
        if ((a == b) && (c == a))
        System.out.println("Segitiga Sama Sisi");
        else
        if ((a == b) || (a == c) || (b == c))
        System.out.println("Segitiga Sama Kaki");
        else
        System.out.println("Segitiga Sembarang");
 }
    }
}