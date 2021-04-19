package Buffer_Circolare;

public class ProgCircolare 
{
    public static boolean STOP = true;
    
    public static void main(String[] args) throws InterruptedException
    {
        Semaforo pieno = new Semaforo(0); //inizializza il semaforo rosso, quindi occupato
        Semaforo vuoto = new Semaforo(10);
        Produttore_Buffer produttore = new Produttore_Buffer(pieno, vuoto);
        Consumatore_Buffer consumatore1 = new Consumatore_Buffer(pieno, vuoto);
        Consumatore_Buffer consumatore2 = new Consumatore_Buffer(pieno, vuoto);
        Consumatore_Buffer consumatore3 = new Consumatore_Buffer(pieno, vuoto);
        
        //Lancio i Thread
        produttore.start();
        consumatore1.start();
        consumatore2.start();
        consumatore3.start();
        
        Thread.sleep(30000); //Tempo di Attesa prima di fermare ogni Thread
        STOP = false;        //Variabile che controlla i While dei Thread
        System.out.println("Termine Main");   
    } 
}
