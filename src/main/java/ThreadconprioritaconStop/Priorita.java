/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadconprioritaconStop;

/**
 *
 * @author HP
 */
public class Priorita implements Runnable
{
    private String chiSono;
    private boolean esecuzione;

    public Priorita(String chiSono)
    {
        this.chiSono = chiSono;
    }

    public boolean isEsecuzione() 
    {
        return esecuzione;
    }

    public void setEsecuzione(boolean esecuzione) 
    {
        this.esecuzione = esecuzione;
    }
    
    public String getChiSono() 
    {
        return chiSono;
    }

    public void setChiSono(String chiSono) 
    {
        this.chiSono = chiSono;
    }

    @Override
    public void run() 
    {
        int conta = 0;
        
        for(conta = 0; esecuzione != true; conta++)
        {
            if(conta % 10000 == 0)
            {
                System.out.println("Thread: " + chiSono + " Conta = " + conta);
            }
        }
        if(esecuzione == true)
            System.out.println("Thread: Stop");
    }
    
}
