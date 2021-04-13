package BagniRistorante;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona implements Runnable
{
    private String nome;
    private Bagno bagno;

    public Persona(Bagno bagno, String sesso) 
    {
        this.nome = nome;
        this.bagno = bagno;
    }
   
    public void run() 
    {
        while(ProgBagni.RUN == 1)
        {
            try 
            {
                bagno.Utilizza();
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
}
