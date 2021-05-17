package ProgCompito;

/**
 * <p> Questa CLasse rappresenta la gestione delle risorse, ovvero quante risorse sono disponibili. In caso siano tutte occupate, il semaforo mette in coda i Thread.</p>
 * @author informatica
 */
public class Semaforo 
{
    int valore;  // si inizializza il valore del semaforo
    
    public Semaforo(int valore)  //costruttore
     {
        this.valore = valore;
     }
    
    synchronized public void P()
    {
        while(valore == 0)  // Qui controlliamo se la risorsa è disponibile. Se non ci sono risorse il thread verrà sospeso, altrimenti verrà decrementata la risorsa.
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
            }
        }
        
        valore--;
    }
    
    synchronized public void V()
    {
        valore++;       //Qui il semaforo quando viene incrementato, significa che è stata liberata una risorsa.
        notify();       //Quindi risveglia il thread in coda.
    }
}