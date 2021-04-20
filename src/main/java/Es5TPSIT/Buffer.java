package Es5TPSIT;

import java.util.ArrayList;

public class Buffer
{
   public static ArrayList<Integer> bufferDati = new ArrayList<Integer>();  //Contenitore dati
   
   public Buffer()      //Costruttore
   {   
   }
   
   public void AggiungiDatiBuffer(int dato)     //Questo metodo aggiunge i dati al Buffer
   {
       bufferDati.add(dato);
   }
   
   public int LeggiDatiBuffer(int i)        //Questo metodo legge il dato del Buffer i esima passata come parametro. Infime elimina il dato-
   {
       int datoLetto = 0;
       
       datoLetto = bufferDati.get(i);
       bufferDati.remove(i);
       
       return datoLetto;
   }
   
   public int getSize()                 //Metodo che ritorna la lunghezza del Vector
   {
       return bufferDati.size();
   }
   
   public boolean isFull()              //Metodo che ritorna VERO se il Vector è pieno, altrimenti FALSO.
   {
       boolean valore = false;
       
       if(getSize() == 10)
           valore = true;
       
       return valore;
   }
   
   public boolean isEmpty()         //Metodo che ritorna VERO se il Vector è vuoto, altrimenti FALSO.
   {
       return bufferDati.isEmpty();
   }
}
