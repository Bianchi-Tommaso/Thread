package Es5TPSIT;

import Es5TPSIT.Semaforo;

public class Consumatore extends Thread
{
    Semaforo pieno;
    Semaforo vuoto;
    
    public Consumatore(Semaforo semaforo1, Semaforo semaforo2)
    {
        pieno = semaforo1;
        vuoto = semaforo2;
    }
    
    synchronized public void run()
    {
        int i = 0;
        Buffer leggiDati = new Buffer();    //Questa instanza serve per accedere al Buffer
        
        while(Main.STOP)                    //Condizione gestita nel main
        {
                pieno.P();                  //Qui il Thread attende di essere sbloccato dal consumatore quando il Buffer è stato riempito
                if(Main.STOP)               //Condizione di controllo per evitare di leggere il Buffer quando si deve uscire dal ciclo
                System.out.println("Il Dato Letto Da " + Thread.currentThread().getName() + " " +"è: " + leggiDati.LeggiDatiBuffer(i)); //lettura dei dati
                vuoto.V();                  //Qui il Thread avvisa il produttore che il Buffer viene letto e quindi deve essere nuovamente riempito
        }
        System.out.println("Consumatore è uscito dal ciclo");
    }
}
