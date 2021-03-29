package BagniRistorante;

public class ProgBagni
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t = new Thread();
        Uomo  u1 = new Uomo("Antonio");
        Uomo  u2 = new Uomo("Tommaso");
        Uomo  u3 = new Uomo("Lorenzo");
        Uomo  u4 = new Uomo("Ryan");
        Donna d1 = new Donna("Maria");
        Donna d2 = new Donna("Giulia");
        Donna d3 = new Donna("Melissa");
        Donna d4 = new Donna("Priscilla");
        BagnoUomini bu = new BagnoUomini("Bagno Uomini");
        BagnoDonne  bd = new BagnoDonne("Bagno Donne");
        
        u1.start();
        u2.start();
        u3.start();
        u4.start();
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        
        t.wait(5000);
        
        u1.stop();
        u2.stop();
        u3.stop();
        u4.stop();
        d1.stop();
        d2.stop();
        d3.stop();
        d4.stop();
        System.out.println("Stop");
    } 
}
