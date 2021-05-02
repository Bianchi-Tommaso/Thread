package GoKart;

public class Spogliatoio 
{
     Semaforo spogliatoio;
     
    public Spogliatoio(Semaforo semaforo1) //Costruttore
    {
        spogliatoio = semaforo1;
    }
    
    public boolean EntrataSpogliatoio(boolean indumenti) throws InterruptedException
    {
                
        spogliatoio.P();    //Qui Leviamo una risorsa allo spogliatoio ogni volta che ci accede un Pilota, Massimo due Piloti nello Spogliatoio
        
        System.out.println("Il Pilota: " + Thread.currentThread().getName() + " è Entrato Nello Spogliatoio");  //Stampa stato di entrata Pilota
        
        if(indumenti == false)      //Se gli indumenti risultano FALSE, significa che il Pilota non ha i vestiti da Pilota.
        {
            indumenti = true;
            Thread.sleep(3000);     //Tempo per vestirsi.
        }
        else                        //Altrimenti se gli indumenti da Pilota sono già indossati vengono messi a FALSE per indicare che il Pilota si sta cambiando con i suoi vestiti
        {
            indumenti = false;
            Thread.sleep(3000);
        }
        
        System.out.println("Il Pilota: " + Thread.currentThread().getName() + " è Uscito Dallo Spogliatoio"); //Stmpa stato di uscita Pilota
        spogliatoio.V();    //Qui il Pilota libera una risorsa, ovvero lascia un posto Libero nello Spogliatoio.
        
        return indumenti;   //Ritorna lo stato degli indumenti
    }
}
