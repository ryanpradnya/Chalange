/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chalange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author userx
 */
public class Token {
    public String getToken() {
        String alphnum = "ABCDEFGHIJKLMNOPQRSTUVXYZ1234567890abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder();
        Random rd = new Random();
        while (sb.length() < 6) {
            int i =(int) (rd.nextFloat()*(alphnum.length()));
            sb.append(alphnum.charAt(i));
        }
        String token = sb.toString();
        return token;
    }
    public static void main(String[] args) {
        Token m = new Token();
        String token = m.getToken();
        List tk = new ArrayList();
        tk.add(token);
        tk.forEach((c) -> System.out.println(c));
    }
}
