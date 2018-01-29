/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalange;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author userx
 */
public class BilanganPrima {
    public static void main(String[] args) {
        List<Integer> prima = new ArrayList<Integer>();
        for (int i = 100; i < 1000; i++) {
            boolean isPrima = true;
 
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima == true) {
                prima.add(i);
            }
        }
        System.out.println(prima);
    }
}
