package Cavalli;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
class Cavallo extends JFrame
{
    int cordx;
    int cordy;
    Image img;
    
    public Cavallo(int yy, int xx)
    {
        cordx = 0;
        cordy = yy;
        setSize(80, 81);
        Toolkit tk = Toolkit.getDefaultToolkit();   
        
        switch(xx)
        {
            case 1:{img = tk.getImage("cavallo1.jpg"); break;}
            case 2:{img = tk.getImage("cavallo2.jpg"); break;}
            case 3:{img = tk.getImage("cavallo3.jpg"); break;}
            case 4:{img = tk.getImage("cavallo4.jpg"); break;}
            case 5:{img = tk.getImage("cavallo5.jpg"); break;}
            case 6:{img = tk.getImage("cavallo6.jpg"); break;}
        }
        
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(img, 1);
        try{mt.waitForID(1);}
        catch(InterruptedException e){}
    }
    
    public void setCordx(int n)
    {
        cordx = n;
    }
    
    public int getCordx()
    {
        return cordx;
    }
    
public void paint(Graphics g)
{
    g.drawImage(img, cordx, cordy, null);
}
}

