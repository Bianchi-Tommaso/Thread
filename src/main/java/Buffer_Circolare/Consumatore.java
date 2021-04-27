package Buffer_Circolare;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumatore extends Thread
 {
    
    public void run()
    {      
        int i = 0;
        
        while(ProgCircolare.STOP)       //Questa condizione serve per interrompere il ciclo e terminare il Thread
        {
            for(i = 0; i < ProgCircolare.x.size(); i++)
            {
                try 
                {
                    System.out.println("Consumatore: " + Thread.currentThread().getName() + " Lettura Dato: " + ProgCircolare.x.take());  //Stampa il numero letto
                } catch (InterruptedException ex) 
                {
                    Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                try 
                {
                    Thread.sleep(3000);     //Aspetta dei secondi per dare tempo al produttore di riempire il buffer
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    }
 }
