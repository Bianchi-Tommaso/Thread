package Cavalli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Locale;
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
public class GaraCavalliGrafica extends JFrame
{
    int posizione;
    Cavallo[] partecipanti;
    CavalliInGara[] thread_partecipanti;
    Campo pista;
    Graphics offscreen;
    Image buffer_virtuale;
    
    public GaraCavalliGrafica()
    {
        super("Gara Cavalli");
        this.setSize(1000, 645);
        this.setLocation(10, 40);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pista = new Campo();
        partecipanti = new Cavallo[6];
        thread_partecipanti = new CavalliInGara[6];
        posizione = 1;
        
        int partenza = 15;
        
        for(int xx = 0; xx < 6; xx++)
        {
            partecipanti[xx] = new Cavallo(partenza, xx + 1);
            thread_partecipanti[xx] = new CavalliInGara(partecipanti[xx], this);
            partenza += 100;
        }
        
        this.add(pista);
        this.setVisible(true);
    }
    
    public synchronized int getPosizione()
    {
        return posizione++;
    }
    
    public synchronized void ControllaArrivi()
    {
        boolean arrivati = true;
        
        for(int xx = 0; xx < 6; xx++)
        {
            if(thread_partecipanti[xx].posizione == 0)
            {
                arrivati = false;
            }
        }
        
        if(arrivati)
        {
            VisualizzaClassifica();
        }
    }
    
    public void VisualizzaClassifica()
    {
        JLabel[] arrivi = new JLabel[6];
        
        JFrame classifica = new JFrame("Classifica");
        classifica.setSize(500, 500);
        classifica.setLocation(260, 130);
        classifica.setBackground(Color.BLUE);
        classifica.setDefaultCloseOperation(EXIT_ON_CLOSE);
        classifica.getContentPane().setLayout(new GridLayout(6, 1));
        
        for(int xx = 1; xx < 7; xx++)
        {
            for(int yy = 0; yy < 6; yy++)
            {
                if(thread_partecipanti[yy].posizione == xx)
                {
                    arrivi[yy] = new JLabel(xx + "classificato cavallo " + (yy+1) + "Corsia");
                    arrivi[yy].setFont(new Font("Times New Roman", Font.ITALIC, 20));
                    arrivi[yy].setForeground(Color.blue);
                    classifica.getContentPane().add(arrivi[yy]);
                }
            }
        }
        classifica.setVisible(true);
    }    
    
    public void update(Graphics g)
    {
        paint(g);
    }
    
    public void paint(Graphics g)
    {
        if(partecipanti != null)
        {
            Graphics2D screen = (Graphics2D) g;
            buffer_virtuale = createImage(1000, 645);
            offscreen = buffer_virtuale.getGraphics();
            Dimension d = getSize();
            pista.paint(offscreen);
            
            for(int xx = 0; xx < 6; xx++)
            {
                partecipanti[xx].paint(offscreen);
            }
            
            screen.drawImage(buffer_virtuale, 0, 30, this);
            offscreen.dispose();
        }
    }
}
