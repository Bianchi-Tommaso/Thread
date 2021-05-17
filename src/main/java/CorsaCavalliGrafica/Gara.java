package CorsaCavalliGrafica;

public class Gara extends Thread
{
    private int contatore;
    
    public void run()
    {
        FrameStampa fs = new FrameStampa();
        String s = "";
        
        while(contatore < FrameStampa.traguardo)
        {
            s = Thread.currentThread().getName();
            fs.StampaThread(s, getContatore());
            System.out.println(s + getContatore());
            contatore++;
            
            if(contatore == FrameStampa.traguardo)
                fs.Vincitore(s);
        }
    }   

    public int getContatore() 
    {
        return contatore;
    }
    
    
}
