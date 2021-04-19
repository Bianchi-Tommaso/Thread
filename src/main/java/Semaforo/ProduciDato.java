package Semaforo;

public class ProduciDato extends Thread 
{
    int tanti = 5;
    final int attesa = 500; //Tempo di attessa per il Thread
    Semaforo pieno;
    Semaforo vuoto;
    
    public ProduciDato(Semaforo semaforo1, Semaforo semaforo2) //Costruttore
    {
        pieno = semaforo1;
        vuoto = semaforo2;
    }
    
    public void run()
    {
        int k = 0;
        ConsumaDato d = new ConsumaDato(null, null);
        
        for(;k < tanti; k++)
        {
            vuoto.P();                                          //Controlliamo se la risorsa è disponibile, in caso sia libera genera il numero
            ProdConsSem.buffer = k;
            System.out.println("Scrittore: dato scritto: " + k);
            pieno.V();                                          //Qui va a sbloccare il consumatore
            
            try
            {
                Thread.sleep(attesa);  //Il Produttore attende un po per dare tempo al consumatore di leggere il dato.
            }
            catch(Exception e)
            {
            }
        }
        
        d.ferma();      //Vado a cambiare la variabile stop nella clsse ConsumaDato per poter interrompere il Ciclo
        pieno.V();      //Qui andiamo a richiamare il Thread rimasto in coda.
        System.out.println("Scrittore: Termine di scrittura dati");
    }
}
