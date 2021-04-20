package Buffer_Circolare;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumatore_Buffer extends Thread
 {
    Semaforo pieno;
    Semaforo vuoto;
    
    public Consumatore_Buffer(Semaforo semaforo1, Semaforo semaforo2)
    {
        pieno = semaforo1;
        vuoto = semaforo2;
    }
    
    synchronized public void run()
    {      
        int i = 0;
        Buffer dati = new Buffer();     //oggetto che serve per interagire con la classe buffer
        
        while(ProgCircolare.STOP)       //Questa condizione serve per interrompere il ciclo e terminare il Thread
        {
            for(i = 0; i < dati.getSize(); i++)
            {
                pieno.P();      //Controlla se ci sono risorse, quindi se il produttore ha generato dei numeri
                System.out.println("Consumatore: " + Thread.currentThread().getName() + " Lettura Dato: " + dati.LeggiDatiAlBuffer(i));  //Stampa il numero letto
                vuoto.V();      //Aggiunge risorse al Produttore per poter far generare nuove risorse
            }
                try 
                {
                    Thread.sleep(3000);     //Aspetta dei secondi per dare tempo al produttore di riempire il buffer
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(Consumatore_Buffer.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    }
 }
