package join;

public class Operazioni4 extends Thread
{
    Buffer dati;
    
    private double b = 1;
    private double c = 3;
    private double a;
    
    public Operazioni4(Buffer d)
    {
        dati = d;
        a = dati.a;
    }
    
    public void run()
    {
        dati.k = dati.x + dati.t;
        System.out.println("Risultato Finale: " + dati.k);
    }
}

