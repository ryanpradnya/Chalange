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
public class Faktorial {

    public static void main(String[] args) {
        for (long a = 0; a <= 100; a++) {
            long b = 1;
            for (long i = 1; i <= a; i++) {
                b = i * b;
            }

            List listbaru = new ArrayList();
            listbaru.add(b);
            System.out.print(listbaru);
        }
    }
}
