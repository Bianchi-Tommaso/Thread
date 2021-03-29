package BagniRistorante;

public class ProgBagni
{
    public static int RUN = 0;
    
    public static void main(String[] args) throws InterruptedException
    {
        Thread p1 = new Persona("Antonio", "M");
        Thread p2 = new Persona("Tommaso", "M");
        Thread p3 = new Persona("Lorenzo", "M");
        Thread p4 = new Persona("Ryan", "M");
        Thread p5 = new Persona("Maria", "F");
        Thread p6 = new Persona("Priscilla", "F");
        Thread p7 = new Persona("Melissa", "F");
        Thread p8 = new Persona("Giulia", "F");
        BagnoUomini bu = new BagnoUomini("Bagno Uomini");
        BagnoDonne  bd = new BagnoDonne("Bagno Donne");
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
       
        RUN = 1;
        
        
        Thread.sleep(5000);
        
        RUN = 0;
    } 
}
