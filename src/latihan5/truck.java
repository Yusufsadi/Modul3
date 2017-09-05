/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author Yusuf
 */
public class truck {
    public int cadance;
    public int gear;
    public int speed;
    
    public truck (int startcadence, int startspeed, int startgear)
    {
        gear = startgear;
        cadance = startcadence;
        speed = startspeed;
    }
    public void setcadence (int newvalue)
    {
        cadance=newvalue;
    }
    public void setgear (int newvalue)
    {
        gear =newvalue;
    }
    public void applybrake (int decrement)
    {
        speed = decrement;
    }
    public void speedup (int increment)
    {
        speed = increment;
    }
}
