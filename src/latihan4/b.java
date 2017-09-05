/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Yusuf
 */
public class b extends a {
    private int B;
    public void setb(int nilai)
    {
        B =nilai;
    }
    public int getb()
    {
        return B;
    }
    public void tampilkannilai ()
    {
    super.tampilkannilai();
    System.out.println("Nilai b = "+ getb());
    }
}
