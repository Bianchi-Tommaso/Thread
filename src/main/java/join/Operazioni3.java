package join;

public class Operazioni3 extends Thread
{
    Buffer dati;
    
    private double b = 1;
    private double c = 3;
    private double a;
    
    public Operazioni3(Buffer d)
    {
        dati = d;
        a = dati.a;
    }
    
    public void run()
    {
        dati.t = dati.y * dati.z;
        System.out.println("Ho Calcolato t: " + dati.t);
    }
}

