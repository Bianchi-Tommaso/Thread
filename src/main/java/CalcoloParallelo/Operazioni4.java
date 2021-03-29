package CalcoloParallelo;

public class Operazioni4 extends Thread
{
    Buffer dati;
    
    private double c;
    
    public Operazioni4(Buffer d)
    {
        dati = d;
        c = dati.c;
    }
    
    public void run()
    {
        dati.t = (dati.z - (10 * c));
        System.out.println("Calcolo Finale t: " + dati.t);
    }
}

