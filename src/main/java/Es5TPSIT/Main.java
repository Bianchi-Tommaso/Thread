
package Es5TPSIT;

import Es5TPSIT.Semaforo;

public class Main
{
    public static boolean STOP = true;
    
    public static void main(String[] args) throws InterruptedException
    {
    
        Semaforo pieno = new Semaforo(0); 
        Semaforo vuoto = new Semaforo(10);
        
        Produttore produttore = new Produttore(pieno, vuoto);
        
        
        Consumatore consumatore1 = new Consumatore(pieno, vuoto);
        Consumatore consumatore2 = new Consumatore(pieno, vuoto);
        Consumatore consumatore3 = new Consumatore(pieno, vuoto);
        Consumatore consumatore4 = new Consumatore(pieno, vuoto);
        Consumatore consumatore5 = new Consumatore(pieno, vuoto);
        Consumatore consumatore6 = new Consumatore(pieno, vuoto);
        
        //Qui si imposta il nome di ogni Thread
        produttore.setName("Produttore 1");
        
        consumatore1.setName("Consumatore 1");
        consumatore2.setName("Consumatore 2");
        consumatore3.setName("Consumatore 3");
        consumatore4.setName("Consumatore 4");
        consumatore5.setName("Consumatore 5");
        consumatore6.setName("Consumatore 6");
        
        produttore.start();
        consumatore1.start();
        consumatore2.start();
        consumatore3.start();
        consumatore4.start();
        consumatore5.start();
        consumatore6.start();
        
        
        Thread.sleep(20000);    //Il main attende 20 secondi prima di terminare tutti i Thread
        STOP = false;           //Variabile per stoppare i Thread
        System.out.println("Termine Main");
    }      
}
