/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum2;

/**
 *
 * @author Yusuf
 */
 class NewClass1 extends NewClass {
    private final int absen;
    
    public NewClass1 (int absen, String nama, String mapel, int nilai )
    {
        super (nama, mapel, nilai);
        this.absen= absen;
    }
    public void data()
    {
        System.out.println("Absen = "+this.absen);
        super.data();
    }
}
