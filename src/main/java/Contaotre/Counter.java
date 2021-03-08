package Contaotre;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Counter implements Runnable
{
    private int n = 0;

    public void run()
{

    while(MainGara.RUN == 0)
    {
    }
    
    while(MainGara.RUN == 1)
    {
        this.n++;

        System.out.println("Thread: " + Thread.currentThread().getName() + " ha contato fino a " + n);
    }
}
}
