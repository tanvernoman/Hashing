/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

/**
 *
 * @author afnan
 */
public class StringHashing {

    public void StringHashing(String sfh, int n) {

        int hash = 0;
        int a = 127;

        for (int i = 0; i < sfh.length(); i++) {
            hash = (a * hash + sfh.charAt(i)) % n;
        }

        System.out.println("String sfh: " + sfh + " ... hash of String sfh: " + hash);

    }
}
