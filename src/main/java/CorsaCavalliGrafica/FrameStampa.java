/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorsaCavalliGrafica;

import java.awt.Container;
import javax.swing.*;

public class FrameStampa extends JFrame
{
    public static int traguardo = 100000;
    private Container c = new Container();
    private JPanel pannello = new JPanel();
    private JLabel cavallo1 = new JLabel(".");
    private JLabel cavallo2 = new JLabel(".");
    private JLabel cavallo3 = new JLabel(".");
    private JLabel cavallo4 = new JLabel(".");
    private JLabel cavallo5 = new JLabel(".");
    private JLabel cavallo6 = new JLabel(".");
    private JLabel cavallo7 = new JLabel(".");
    private JLabel cavallo8 = new JLabel(".");
    private JLabel cavallo9 = new JLabel(".");
    private JLabel cavallo10 = new JLabel(".");
    private JLabel vincitore = new JLabel("ppp");
    private static String[] nomiCavalli = {"Cavallo 1", "Cavallo 2", "Cavallo 3", "Cavallo 4", "Cavallo 5", "Cavallo 6", 
                                           "Cavallo 7", "Cavallo 8", "Cavallo 9", "Cavallo 10"};
    
    public FrameStampa()
    {
        
    }
    
    public FrameStampa(int cavalliInseriti)
    {
        c = this.getContentPane();
        pannello.setLayout(null);
        this.setVisible(true);
        this.setTitle("Gara Cavalli"); 
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(500, 500);
        this.setResizable(false);
        
        cavallo1.setBounds(10, 20, 50, 30);
        cavallo2.setBounds(100, 20, 50, 30);
        cavallo3.setBounds(200, 20, 50, 30);
        cavallo4.setBounds(300, 20, 50, 30);
        cavallo5.setBounds(400, 20, 50, 30);
        cavallo6.setBounds(10, 60, 50, 30);
        cavallo7.setBounds(100, 60, 50, 30);
        cavallo8.setBounds(200, 60, 50, 30);
        cavallo9.setBounds(300, 60, 50, 30);
        cavallo10.setBounds(400, 60, 50, 30);
        vincitore.setBounds(200, 60, 50, 60);
        
        pannello.add(cavallo1);
        pannello.add(cavallo2);
        pannello.add(cavallo3);
        pannello.add(cavallo4);
        pannello.add(cavallo5);
        pannello.add(cavallo6);
        pannello.add(cavallo7);
        pannello.add(cavallo8);
        pannello.add(cavallo9);
        pannello.add(cavallo10);
        pannello.add(vincitore);
        
        c.add(pannello);
        
        CreaThread(Integer.valueOf(cavalliInseriti));      
    }
    
    public void Vincitore(String CavalloVincitore)
    {
        vincitore.setText("Il Vincitore E' " + CavalloVincitore);
        traguardo = 0;
    }
    
    public void StampaThread(String nomeThread, int contatore)
    {
        switch(nomeThread)
        {
            case "Cavallo 1":
                cavallo1.setText("Percorso: " + contatore);
                break;
                
            case "Cavallo 2":
                cavallo2.setText("Percorso: " + contatore);
                break;
                
            case "Cavallo 3":
                cavallo3.setText("Percorso: " + contatore);
                break;
                
            case "Cavallo 4":
                cavallo4.setText("Percorso: " + contatore);
                break;
               
            case "Cavallo 5":
                cavallo5.setText("Percorso: " + contatore);
                break;
                
            case "Cavallo 6":
                cavallo6.setText("Percorso: " + contatore);
                break;
                
            case "Cavallo 7":
                cavallo7.setText("Percorso: " + contatore);
                break;
                
            case "Cavallo 8":
                cavallo8.setText("Percorso: " + contatore);
                break;
                
            case "Cavallo 9":
                cavallo9.setText("Percorso: " + contatore);
                break;
                
            case "Cavallo 10":
                cavallo10.setText("Percorso: " + contatore);
                break;
        }
    }
    
    public void CreaThread(int ci)
    {
        for(int i = 0; i < ci; i++)
        {
            Gara g = new Gara();
            g.setName(nomiCavalli[i]);
            g.start();
        }
    }
}
