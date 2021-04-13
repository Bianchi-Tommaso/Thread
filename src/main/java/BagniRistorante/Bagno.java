/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BagniRistorante;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Bagno
{
     private String nome;

    public Bagno(String nome) 
    {
        this.nome = nome;
    }
    
            public synchronized void Utilizza() throws InterruptedException 
            {
              System.out.println("Bagno Occupato Da:" + Thread.currentThread().getName());
              Thread.sleep(5000);
              System.out.println("Bagno Liberato Da:" + Thread.currentThread().getName());
    }
}

