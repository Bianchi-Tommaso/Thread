package Semaforo;

public class ProdConsSem
{
    
    protected static int buffer;
    
    public static void main(String args[]) throws InterruptedException
    {
        Semaforo pieno = new Semaforo(0); //inizializza il semaforo rosso, quindi occupato
        Semaforo vuoto = new Semaforo(1);  //inizializza il semaforo verde, quindi libero(la risorsa)
        ProduciDato prod = new ProduciDato(pieno, vuoto);
        ConsumaDato cons = new ConsumaDato(pieno, vuoto);
        
        prod.start();
        cons.start();
        
        Thread.sleep(3000);
        System.out.println("Termine Del Main");
    }
}
