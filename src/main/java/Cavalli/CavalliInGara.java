package Cavalli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class CavalliInGara implements Runnable
{
    Cavallo cavallo;
    GaraCavalliGrafica campo;
    Thread t;
    int conta;
    int posizione;
    int velocita;
    
    public CavalliInGara(Cavallo c, GaraCavalliGrafica g)
    {
        cavallo = c;
        campo = g;
        conta = 0;
        velocita = 2;
        t = new Thread(this);
        t.start();
        posizione = 0;
    }

    @Override
    public void run()
    {
        int dimImmagine = 79;
        int dimPista = 960;
        
        while((cavallo.getCordx() + dimImmagine) < dimPista)
        {
            if((conta % 10) == 0)
            {
               velocita = (int) (Math.random()* 4 + 1);
               cavallo.setCordx(cavallo.getCordx() + velocita);
               conta++;
               
               try
               {Thread.sleep(75);}
               catch(Exception e)
                       {
                       
                       }
            }
        }
        posizione = campo.getPosizione();
        campo.ControllaArrivi();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
