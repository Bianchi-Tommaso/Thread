package join;

public class Operazioni2 extends Thread
{
    Buffer dati;
    
    private double b = 3;
    private double c = 3;
    private double a;
    
    public Operazioni2(Buffer d)
    {
        dati = d;
        a = dati.c;
    }
    
    public void run()
    {
        dati.z = c * (a - b);
        System.out.println("Ho Calcolato z: " + dati.z);
    }
}

