/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalange;

import java.util.Random;

/**
 *
 * @author userx
 */
public class Kartu {
     String [] kartuRemi = {"As","1","2","3","4","5","6","7","8","9","10","J","Q","K",
    "As1","1.","2.","3.","4.","5.","6.","7.","8.","9.","10.","J.","Q.","K.",
    "As2","1,","2,","3,","4,","5,","6,","7,","8,","9,","10,","J,","Q,","K,",
    "As3","1/","2/","3/","4/","5/","6/","7/","8/","9/","10/","J/","Q/","K/"};
   
    public void acakKartu(){
        int i = 0;
        Random random = new Random();
        while(i <= 52){
            int index = (int)(random.nextFloat()*52);
            System.out.println(i + " "+ kartuRemi[index]);
            i++;
        }
    }
   
    public static void main(String[] args) {
        Kartu k = new Kartu();
        k.acakKartu();
    }
}
