package CalcoloParallelo;

public class Operazioni3 extends Thread
{
    Buffer dati;
    
    private double b;
    private double c;
    
    public Operazioni3(Buffer d)
    {
        dati = d;
        b = dati.y;
        c = dati.x;
    }
    
    public void run()
    {
        dati.z = (c * b * 5);
        System.out.println("Ho Calcolato z: " + dati.z);
    }
}

