/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgCompito;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p> Questa Classe Rappresenta se un Thread è Uomo o Donna, Così possiamo gestire quale risorsa dobbiamo chiamare a seconda del sesso</p>
 * @author informatica
 */

public class UomoDonna extends Thread
{
    private String sesso;
    Semaforo bagnoDonne;
    Semaforo bagnoUomini;

    public UomoDonna(String sesso, Semaforo bagnoDonne, Semaforo bagnoUomini) 
    {
        this.sesso = sesso;
        this.bagnoDonne = bagnoDonne;
        this.bagnoUomini = bagnoUomini;

    }
    
    /**
     * <p> QUesto blocco di Codice verrà eseguita non appena viene lanciato il Thread dal Main.</p>
     */
    public void run()
    {
        BagnoUomini bagnoU = new BagnoUomini(bagnoUomini);
        BagnoDonne bagnoD = new BagnoDonne(bagnoDonne);
        
        if(this.sesso == "Uomo")        //Controllo il Thread se Uomo o Donna
        {
            
            try 
            {
                bagnoU.EntrataBagnoUomini();       //Richiamo Il metodo 
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(UomoDonna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try 
            {
                bagnoD.EntrataBagnoDonne();     //Richiamo il metodo
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(UomoDonna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
