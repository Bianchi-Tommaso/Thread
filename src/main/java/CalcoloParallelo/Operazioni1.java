/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcoloParallelo;

public class Operazioni1 extends Thread
{
    Buffer dati;
    
    private double b = 4;
    private double c = 2;
    private double a;
    
    public Operazioni1(Buffer d)
    {
        dati = d;
        a = dati.a;
    }
    
    public void run()
    {
        dati.x = ((a * c) + b);
        System.out.println("Ho Calcolato x: " + dati.x);
    }
}

