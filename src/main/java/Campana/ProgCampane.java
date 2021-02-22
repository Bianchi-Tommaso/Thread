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
public class ProgCampane 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
       Runnable campana1 = new Campana("din", 3);
       Thread thread1 = new Thread(campana1);
       Thread thread2 = new Thread(new Campana("don", 3));
       Thread thread3 = new Thread(new Campana("dan", 3));
       Thread thread4 = new Thread(new Campana("dun", 3));
       
       thread1.start();
        thread1.sleep(1);
        thread4.start();
       thread2.start();
        thread2.sleep(1);
       thread3.start();
        thread3.sleep(1);
    }
    
}
