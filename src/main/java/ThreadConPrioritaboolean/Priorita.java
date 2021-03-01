/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadConPrioritaboolean;

/**
 *
 * @author HP
 */
public class Priorita implements Runnable
{
    private String chiSono;
    private volatile boolean esecuzione = true;

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

    public void stopThread()
    {
        esecuzione = false;
    }
    
    @Override
    public void run() 
    {
        int conta = 0;
        
        for(conta = 0; esecuzione != false; conta++)
        {
            if(conta % 10000 == 0)
            {
                System.out.println("Thread: " + chiSono + " Conta = " + conta);
            }
        }
        if(esecuzione == false)
            System.out.println("Thread: Stop");
    }
    
}
