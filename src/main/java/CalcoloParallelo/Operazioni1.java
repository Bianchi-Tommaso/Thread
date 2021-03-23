/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcoloParallelo;

public class Operazioni1 extends Thread
{
    Buffer dati;

    private double a;
    
    public Operazioni1(Buffer d)
    {
        dati = d;
        a = dati.a;
    }
    
    public void run()
    {
        dati.x = ((a * 2) + 4);
        System.out.println("Ho Calcolato x: " + dati.x);
    }
}

