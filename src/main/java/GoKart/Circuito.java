package GoKart;

import java.util.Random;

public class Circuito 
{
     int contatoreGiri;
     Semaforo pilotiInPista;
     
     public Circuito()
     {
     }
     
     public Circuito(Semaforo pilotiInPista, int contatoreGiri)
     {
         this.pilotiInPista = pilotiInPista;
         this.contatoreGiri = contatoreGiri;
     }
     
     public void GeneraCircuito(int lunghezzaCircuito)
     {
         int numeroRandom = 0;
         Random r = new Random();
     }
     
    public boolean EntrataPista() throws InterruptedException
    {
        
        pilotiInPista.P();        //Qui vengono decrementati i posti disponibili in Pista
        System.out.println("Il Pilota: " + Thread.currentThread().getName() + " è Entrato Nel Circuito"); //Stampa stato entrata del Circuito di un Pilota
        Giri();                 //Metodo che gestisce i Giri di ogni Pilota.
        pilotiInPista.V();      //Qui vengono incrementati i posti disponibili in Pista
        
        return false;           //Il metodo ritorna un valore FALSO per indicare al Thread che ha finito la sua escuzione, quindi deve terminare
    }
    
     public void Giri() throws InterruptedException
    {
        int i = 0;
        int n = 0;
        long tempo = System.currentTimeMillis();    //Viene preso il Tempo di esecuzione del Thrad.
        Random r = new Random();
        
        for(;i < contatoreGiri; i++)
        {
            n = r.nextInt(5000 - 1000 + 1) + 1000; //Tempo Random per un Pilota 
            System.out.println("Il Pilota: " + Thread.currentThread().getName() + " è Al Giro N°: " + (i + 1)); //Viene stampato a video a che giro è un Pilota 
            Thread.sleep(n);                       //Tempo impiegato da un Pilota per completare un Giro.
        }
        
        tempo = System.currentTimeMillis() - tempo;     //Calcolo effettivo del Tempo impiegato dal primo Giro all'ultimo Giro
        tempo /= 1000;                                  //Conversione Tempo in Secondi.
        
        Classifica classifica = new Classifica(tempo, Thread.currentThread().getName());    //Inizzializzo il Tempo e il Nome di Ogni Pilota
        
        MainGoKart.classifica.add(classifica);          //Salvato il Tempo e il Nome del Pilota All'interno di un ArrayList
        //Stampa Stato Uscita Pilota dalla Pista
        System.out.println("Il Pilota: " + Thread.currentThread().getName() + " è Uscito Dalla Pista"); 
    }
}
