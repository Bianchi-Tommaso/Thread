package join;

public class Operazioni1 extends Thread
{
    Buffer dati;
    
    private double b = 2;
    private double c = 2;
    private double a;
    
    public Operazioni1(Buffer d)
    {
        dati = d;
        a = dati.b;
    }
    
    public void run()
    {
        dati.y = c * (a - b);
        System.out.println("Ho Calcolato y: " + dati.y);
    }
}

