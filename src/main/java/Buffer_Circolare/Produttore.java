package Buffer_Circolare;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produttore extends Thread
{
    int datiGenerati = 10;
    
    public void run()
    {   
        int n = 0;
        int i = 0;
        Random rand = new Random();         //serve per generare dei numeri all'interno del buffer
        
        while(ProgCircolare.STOP)           //Questa condizione serve per interrompere il ciclo e terminare il Thread
        {
                       //Qui controllo se è vuoto il Buffer per riempirlo solo quando è vuoto
                for(i = 0; i < datiGenerati; i++)
                {                            
                    n = rand.nextInt(50);                                           //genera un numero
                    try 
                    {
                        ProgCircolare.x.put(n);                                                       //aggiunge i dati al buffer
                    } catch (InterruptedException ex)
                    {
                        Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Produttore:" + Thread.currentThread().getName() + " Numero Generato: " + n);        //stampa a video il numero generato                                                   //Vengono incrementate le risorse per il consumatore            
                }
            
            try 
            {
                Thread.sleep(5000);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
