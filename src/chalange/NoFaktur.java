/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalange;

/**
 *
 * @author userx
 */
public class NoFaktur {

    public static void main(String[] args) {
        String kode = "";

        for (int f = 0; f < 1000; f++) {

            if (f < 9) {
                kode = "000" + (f + 1);
            } else if (f < 99) {
                kode = "00" + (f + 1);
            } else if (f < 999) {
                kode = "0" + (f + 1);
            } else {
                kode = "" + (f + 1);
            }

            System.out.println(kode);
        }
    }
}
