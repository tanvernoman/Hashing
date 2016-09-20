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
public class Hashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        String[] sfhArray_ = {"A", "thing", "of", "beauty", "is", "a", "joy", "for", "ever",
//            "Its", "loveliness", "increases",};
//
//        int n = 97;
//
//        StringHashing sh = new StringHashing();
//
//        for (int i = 0; i < sfhArray_.length; i++) {
//            sh.StringHashing(sfhArray_[i], n);
//        }
        
        
        
        int[] array_ = {254, 122, 899, 344, 789, 665,
                        119, 701, 300, 565, 844, 319};
        
        for (int k : array_)
        {
            System.out.println( "key: " + k
            + " hash (n = 100) > " + k % 100
            + " hash (n = 97) > " + k % 97
            );
        }
    }

}
