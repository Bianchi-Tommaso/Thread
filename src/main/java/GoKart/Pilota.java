package GoKart;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Pilota extends Thread
{
    public static int contatoreGiri = 15;       //Variabile per tenere il giro
     boolean indumenti = false;                 //Variabile di controllo per verificare se un Pilota ha gli indumenti da pista
     boolean fineThread = true;                 //Varibile per far finire un Thread quando un pilota esce dalla pista e si cambia
     
    public Pilota()
    { 
    }

    public boolean isIndumenti()
    {
        return indumenti;
    }

    public void setIndumenti(boolean indumenti) 
    {
        this.indumenti = indumenti;
    }
    
    public void run()
    {
        
        while(fineThread)   //Quando la variabile è false significa che il Pilota ha finito il suo circuito e il Thread ferma la sua esecuzione
        {
            //Oggetti spogliatoi e Circuito dove vengono passati i semafori dichiarati nel Main.
        Spogliatoio s = new Spogliatoio(MainGoKart.spogliatoio);        
        Circuito c = new Circuito(MainGoKart.circuito);
        
            try 
            {
                this.indumenti = s.EntrataSpogliatoio(this.indumenti);      //Il Pilota entra nello spogliatoio e ritorna il valore vero o falso a seconda degli indumenti che indossa
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(Pilota.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(this.indumenti == true)      //se il Pilota ha gli indumenti può entrare in Pista
            {
                try 
                {
                    fineThread = c.EntrataPista();      //Il Pilota entra in pista e quando ha percorso i 14 giri, il metodo ritorna il valore FALSE per fermare il Thread
                    this.indumenti = s.EntrataSpogliatoio(this.indumenti);  //Qui Si tolgono gli indumenti del Pilota
                } 
                catch (InterruptedException ex)
                {
                    Logger.getLogger(Pilota.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }      
}
