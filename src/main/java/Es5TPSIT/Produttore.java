package Es5TPSIT;

import Es5TPSIT.Semaforo;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produttore extends Thread
{
    Semaforo pieno;
    Semaforo vuoto;
    
    public Produttore(Semaforo semaforo1, Semaforo semaforo2)
    {
        pieno = semaforo1;
        vuoto = semaforo2;
    }

    @Override
    public void run() 
    {
        int i = 0;
        int n = 0;
        Random rand = new Random();
        Buffer generaDati = new Buffer();
        
        
        while(Main.STOP)                        //Condizione gestita nel main
        {
            if(generaDati.isEmpty() == true)    //Qui controlliamo se il Buffer è pieno
            {
                try 
                {
                    for(i = 0; i < 10; i++)
                    {
                        vuoto.P();                  //
                        n = rand.nextInt(50);       //Numero n genrato
                        generaDati.AggiungiDatiBuffer(n);   //Numero n generato e aggiunto al Buffer
                        System.out.println(Thread.currentThread().getName() + ": Il Dato Generato è: " + n);    //Stampa del numero generato
                    
                        if(generaDati.isFull()) //Qui controlliamo se il Buffer è pieno, se si allora andiamo a sbloccare i consumatori che stanno aspettando che il Buffer sia pieno
                        {
                            for(i = 0; i < 10; i++)
                            pieno.V();              //Sblocco dei Consumatori
                        }
                    }
                
                    Thread.sleep(5000);             //Attesa di 5 secondi
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        for(i = 0; i < 10; i++)     //Questo for serve per sbloccare il Thread in coda quando la variabile STOP = false, per far uscire dal ciclo il Thread.
             pieno.V();
        System.out.println("Produttore è uscito dal ciclo");
    }  
}
