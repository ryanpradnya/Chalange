/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

/**
 *
 * @author userx
 */
public class Kuadrat {

    /**
     * @param args the command line arguments
     */
    List<Integer> kuadrat = new ArrayList<Integer>();
    public List<Integer> cariKuadrat() {
        
        int akar, angka, j = 0;
        for (int i = 100; i < 1000; i++) {

            akar = (int) Math.sqrt((i));
            angka = (int) Math.pow(akar, 2);

            if (kuadrat.size() == 0) {
                kuadrat.add(angka);
            } else if (kuadrat.size() != 0 && angka != kuadrat.get(j)) {
                kuadrat.add(angka);
                j++;
            }

        }
        return kuadrat;
    }

    public static void main(String[] args) {
        Kuadrat k = new Kuadrat();
        k.cariKuadrat();

        System.out.println(k.kuadrat);
          

    }

}
