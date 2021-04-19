package Buffer_Circolare;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produttore_Buffer extends Thread
{
    int datiGenerati = 10;
    Semaforo pieno;
    Semaforo vuoto;
   
    public Produttore_Buffer(Semaforo semaforo1, Semaforo semaforo2)
    {
        pieno = semaforo1;
        vuoto = semaforo2;
    }
    
    public void run()
    {   
        int n = 0;
        int i = 0;
        Buffer dati = new Buffer();         //oggetto che serve per interagire con la classe buffer
        Random rand = new Random();         //serve per generare dei numeri all'interno del buffer
        
        while(ProgCircolare.STOP)           //Questa condizione serve per interrompere il ciclo e terminare il Thread
        {
            
            if(dati.isEmpty())              //Qui controllo se è vuoto il Buffer per riempirlo solo quando è vuoto
            {
                for(i = 0; i < datiGenerati; i++)
                {    
                    vuoto.P();                     //Qui il produttore libera le risorse via via che riempe il buffer, dando la possibilita al consumatore di leggerle
                    n = rand.nextInt(50);                                           //genera un numero
                    dati.AggiungiDatiAlBuffer(n);                                   //aggiunge i dati al buffer
                    System.out.println("Produttore: Numero Generato: " + n);        //stampa a video il numero generato
                    pieno.V();                                                      //Vengono incrementate le risorse per il consumatore            
                }
            }
            try 
            {
                Thread.sleep(5000);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Produttore_Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
