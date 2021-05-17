/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgCompito;

import java.util.Random;

/**
 * 
 * @author informatica
 * <p> Questa classe rappresenta la risorsa Bagno Donne </p>
 */

public class BagnoDonne  //Classe per la risorsa Bagno Uomini
{
    Semaforo bagnoDonne;

    /**
     * 
     * @param bagnoDonne 
     *  <p> Questo costruttore serve per inizializzare il semaforo, infatti viene passato come parametro il semaforo </p>
     */
    
    public BagnoDonne(Semaforo bagnoDonne)  //Costruttore
    {
        this.bagnoDonne = bagnoDonne;       //Inizializzo il semaforo
    }
    
     /**
     * 
     * @throws InterruptedException
     * <P> Questo metodo rappresenta la gestione con un semaforo l'entrata e l'uscita del Bagno </p> 
     */
    
    public void EntrataBagnoDonne() throws InterruptedException
    {
        bagnoDonne.P(); //Qui si richiama il metodo per il Semaforo, ovvero se il Bagno è disponibile una persona può entrare, altrimenti attende il suo turno.
        System.out.println(Thread.currentThread().getName() + " Sta Entrando Nel Bagno");

        Attesa(); //Tempo di Attesa per simulare il tempo in Bagno
        
        System.out.println(Thread.currentThread().getName() + " Sta Uscendo Dal Bagno");
        bagnoDonne.V();  //La risorsa viene liberata
    }
    
    /**
      * 
      * @throws InterruptedException
      * <p> Questo Metodo Rapppresenta La Simulazione Del Tempo In Bagno
      */
    
    public void Attesa() throws InterruptedException
    {
        int n = 0;
        Random r = new Random();
        
        n = r.nextInt(8000 - 1000 + 1); //Tempo generato random 
        Thread.sleep(n);                //Thread che si interrompe per un tempo n
    }
}
