/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campana;

/**
 *
 * @author HP
 */
public class Campana implements Runnable
{
    String suono;
    int volte;

    public Campana(String suono, int volte)
    {
        this.suono = suono;
        this.volte = volte;
    }
    
    public void run()
    {
        int i = 0;
        
        for(i = 0; i < volte; i++)
        {
            System.out.println((i + 1) + suono + " ");
        }
    }
    
    
}
