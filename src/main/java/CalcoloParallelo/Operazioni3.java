/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcoloParallelo;

public class Operazioni3 extends Thread
{
    Buffer dati;
    
    private double a = 5;
    private double b = 0;
    private double c = 0;
    
    public Operazioni3(Buffer d)
    {
        dati = d;
        b = dati.y;
        c = dati.x;
    }
    
    public void run()
    {
        dati.z = (c * b * a);
        System.out.println("Ho Calcolato z: " + dati.z);
    }
}

