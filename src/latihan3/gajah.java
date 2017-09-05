/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Yusuf
 */
public class gajah extends hewan {
    public static void testclassmethod()
    {
        System.out.println ("The class method in Hewan..");
    }
    public static void main (String[] args )
    {
        gajah mygajah = new gajah();
        hewan myhewan = mygajah;
        hewan.testclassmethod();
        myhewan.testistancemethod();
    }
}
