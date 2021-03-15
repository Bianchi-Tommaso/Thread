/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcoloParallelo;

public class Operazioni4 extends Thread
{
    Buffer dati;
    
    private double c;
    private double a = 10;
    
    public Operazioni4(Buffer d)
    {
        dati = d;
        c = dati.c;
    }
    
    public void run()
    {
        dati.t = (dati.z - (a * c));
        System.out.println("Calcolo Finale t: " + dati.t);
    }
}

