package CalcoloParallelo;

public class Operazioni1 extends Thread
{
    Buffer dati;

    private double a;
    
    public Operazioni1(Buffer d)
    {
        dati = d;
        a = dati.a;
    }
    
    public void run()
    {
        dati.x = ((a * 2) + 4);
        System.out.println("Ho Calcolato x: " + dati.x);
    }
}

