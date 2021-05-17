/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgCompito;

/**
 *
 * @author informatica
 */
public class ProgBagno
{
    /**
     * 
     * @param args
     * @throws InterruptedException 
     * <p> Il Main Rappresenta Il Test Del Nostro Programma. Ogni Thread ha un nome e un sesso.
     * e infine il Main Attende tutti i Thread che abbiano finito la loro esecuzione.
     */
    
    public static void main (String[] args) throws InterruptedException 
    {
        Semaforo semaforoUominiDonne = new Semaforo(1); //Semaforo per la risorsa Bagno

        //Thread, Ovvero le persone che accederanno al Bagno
        UomoDonna mario = new UomoDonna("Uomo", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna gabriele = new UomoDonna("Uomo", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna orfeo = new UomoDonna("Uomo", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna leonardo = new UomoDonna("Uomo", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna alessandro = new UomoDonna("Uomo", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna tommaso = new UomoDonna("Uomo", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna giulia = new UomoDonna("Donna", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna sofia = new UomoDonna("Donna", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna anna = new UomoDonna("Donna", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna melissa = new UomoDonna("Donna", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna giorgia = new UomoDonna("Donna", semaforoUominiDonne, semaforoUominiDonne);
        UomoDonna alice = new UomoDonna("Donna", semaforoUominiDonne, semaforoUominiDonne);
        
        //Imposto il nome ad ogni Thread
        mario.setName("Mario");
        gabriele.setName("Gabriele");
        orfeo.setName("Orfeo");
        leonardo.setName("Leonardo");
        alessandro.setName("Alessandro");
        tommaso.setName("Tommaso");
        giulia.setName("Giulia");
        sofia.setName("Sofia");
        anna.setName("Anna");
        melissa.setName("Melissa");
        giorgia.setName("Giorgia");
        alice.setName("Alice");
        
        //Lancio i Thread
        mario.start();
        gabriele.start();
        orfeo.start();
        leonardo.start();
        alessandro.start();
        tommaso.start();
        giulia.start();
        sofia.start();
        anna.start();
        melissa.start();
        giorgia.start();
        alice.start();
        
        
        //Il Main attende ogni Thread che abbia finito il suo Turno per poi terminare
        mario.join();
        gabriele.join();
        orfeo.join();
        leonardo.join();
        alessandro.join();
        tommaso.join();
        giulia.join();
        sofia.join();
        anna.join();
        melissa.join();
        giorgia.join();
        alice.join();
        
        System.out.println("Coda Finita");
        
    }
}
