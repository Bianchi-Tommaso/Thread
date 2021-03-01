/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadConPrioritaboolean;

/**
 *
 * @author HP
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        Runnable r1 = new Priorita("IMPORTANTE (10)"); 
        Runnable r2 = new Priorita("IMPORTANTE MEDIO (5)");   
        Runnable r3 = new Priorita("IMPORTANTE BASSA (1)");
        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);
        Thread th3 = new Thread(r3);
        Priorita p = new Priorita("");
        
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MIN_PRIORITY);
        
        th1.start();
        th2.start();
        th3.start();
        th1.sleep(5000);
        p.stopThread();
    } 
}
