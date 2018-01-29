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
public class Perkalian {
    public static void main(String[] args) {
       
        double jml=0;
       
        Scanner jum = new Scanner(System.in);
        System.out.print("Masukan Nilai a: ");
        Integer a = jum.nextInt();
        System.out.print("Masukan Nilai b: ");
        Integer b = jum.nextInt();
       
        if ((a!=0)&&(b!=0)) {
            if ((a > 0) && (b > 0)){
                for (int i=1; i<=b; i++ ){
                    jml=jml+a;}
                    System.out.println("Hasil kali = "+jml);
               
            }else if((a<0)&&(b<0)){
                for (int i=1; i<=(-b); i++ ){
                    jml=jml+(-a);}
                    System.out.println("Hasil kali = "+jml);
           
            }else if ((a>0)&&(b<0)){
                    for (int i=1; i<=(-b); i++ ){
                    jml=jml+a;}
                    System.out.println("Hasil kali = "+-jml);
            }else {
                    for (int i=1; i<=b; i++ ){
                    jml=jml+a;}
                    System.out.println("Hasil kali = "+jml);}
    } else {
        jml=0;
        System.out.println("Hasil kali = "+jml);}
    }
}
