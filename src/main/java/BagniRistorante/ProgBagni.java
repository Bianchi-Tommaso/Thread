package BagniRistorante;

public class ProgBagni
{
    public static int RUN = 0;
    
    public static void main(String[] args) throws InterruptedException
    {
        Bagno BagnoDonne = new Bagno("Donne");
        Bagno BagnoUomini = new Bagno("Uomini");
        
        Thread p1 = new Thread(new Persona(BagnoUomini, "M"));
        Thread p2 = new Thread(new Persona(BagnoUomini, "M"));
        Thread p3 = new Thread(new Persona(BagnoUomini, "M"));
        Thread p4 = new Thread(new Persona(BagnoUomini, "M"));
        Thread p5 = new Thread(new Persona(BagnoDonne, "F"));
        Thread p6 = new Thread(new Persona(BagnoDonne, "F"));
        Thread p7 = new Thread(new Persona(BagnoDonne, "F"));
        Thread p8 = new Thread(new Persona(BagnoDonne, "F"));
        
        p1.setName("Mario");
        p2.setName("Tommaso");
        p3.setName("Lorenzo");
        p4.setName("cccc");
        p5.setName("Valeria");
        p6.setName("Sara");
        p7.setName("Melissa");
        p8.setName("Giulia");
        

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
       
        RUN = 1;
        
        
        Thread.sleep(100000);
        
        RUN = 0;
    } 
}
