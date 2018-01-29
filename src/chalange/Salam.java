/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalange;

import java.util.Scanner;

/**
 *
 * @author userx
 */
public class Salam {
    
    int orang;
    int salam;
   
    int Hitung(){
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan jumlah orang = ");
            orang = scan.nextInt();      
            salam = (orang *(orang-1))/2;
            System.out.println("Jumlah jabat tangan dari " + orang + " orang = " + salam);
            System.out.println("\n");
        }
    }
   
    public static void main(String[] args) {
       Salam salam = new Salam();
       salam.Hitung();
    }
}
