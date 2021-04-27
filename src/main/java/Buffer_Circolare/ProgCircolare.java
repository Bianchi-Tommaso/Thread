package Buffer_Circolare;

import java.util.concurrent.LinkedBlockingQueue;

public class ProgCircolare 
{
    public static boolean STOP = true;
    public static LinkedBlockingQueue x = new LinkedBlockingQueue(10);
    
    public static void main(String[] args) throws InterruptedException
    {
        
        Produttore produttore = new Produttore();
        Produttore produttore1 = new Produttore();
        
        Consumatore consumatore1 = new Consumatore();
        Consumatore consumatore2 = new Consumatore();
        Consumatore consumatore3 = new Consumatore();
        
        //Lancio i Thread
        produttore.setName("Produttore 1");
        produttore1.setName("Produttore 2");
        consumatore1.setName("Consumatore 1");
        consumatore2.setName("Consumatore 2");
        consumatore3.setName("Consumatore 3");
        
        produttore1.start();
        produttore.start();
        consumatore1.start();
        consumatore2.start();
        consumatore3.start();
        
        
               
        produttore1.join();
        produttore.join();
        STOP = false;      //Variabile che controlla i While dei Thread
        
        consumatore1.stop();
        consumatore2.stop();
        consumatore3.stop();
        
        System.out.println("Termine Main");   
    } 
}
