package Buffer_Circolare;

import java.util.Vector;

public class Buffer 
{
     public static Vector<Integer> elementi = new Vector<Integer>();    //Qui all'interno ci andranno tutti i numeri generati dal Produttore e letti dal Consumatore

    public Buffer()     //costruttore
    {
    }
    
     public void AggiungiDatiAlBuffer(int x)        //metodo che aggiunge i dati al Buffer
     {
         elementi.add(x);
     }
     
     synchronized public int LeggiDatiAlBuffer(int i)            //Metodo che il Consumatore accede per leggere un dato 
     {
         elementi.get(i);
         elementi.remove(i);
         
         return i;
     }
     
     public boolean isEmpty()                       //Metodo per verificare se il buffer è vuoto
     {
         return elementi.isEmpty();
     }
     
     public int getSize()                           //metodo per ritornare la grandezza del Vector
     {
         return elementi.size();
     }
}
