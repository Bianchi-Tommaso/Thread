package Semaforo;

public class ConsumaDato extends Thread
{
    public static boolean stop = true;
    Semaforo pieno;
    Semaforo vuoto;
    
    public ConsumaDato(Semaforo semaforo1, Semaforo semaforo2) //Costruttore
    {
        pieno = semaforo1;
        vuoto = semaforo2;
    }
   
    public void run()
    {
        while(stop) 
        {      
            pieno.P();  //Qui il consumatore sta aspettando che venga sbloccato dal produttore
            if(!stop == false) //Questo if serve per evitare di far leggere nuovamente l'ultimo dato generato, qundo il ciclo viene interrotto.
            System.out.println("Lettore: " + " Dato Letto: " + ProdConsSem.buffer);
            vuoto.V(); //Qui sblocca il produttore che ha letto il dato.
        }
    }
    
    public void ferma()
    {
        stop = false;
    }
}
