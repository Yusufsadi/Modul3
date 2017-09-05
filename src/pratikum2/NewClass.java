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
public class NewClass {
    private String nama;
     private String mapel;
     private int nilai;
     
  public NewClass (String nama, String mapel, int nilai)
  {
      this.nama = nama;
      this.mapel = mapel;
      this.nilai =nilai;
  }
  public void data()
  {
      System.out.println ("Nama = "+this.nama);
      System.out.println ("Mapel = "+this.mapel);
      System.out.println ("Nilai = "+this.nilai);
  }
}
