package CalcoloParallelo;

public class Operazioni2 extends Thread
{
    Buffer dati;
    
    private double b;

    
    public Operazioni2(Buffer d)
    {
        dati = d;
        b = dati.b;
    }
    
    public void run()
    {
        dati.y = ((7 * b) + 3);
        System.out.println("Ho Calcolato y: " + dati.y);
    }
}

