package Thread;

public class ProvaThread
{
    public static void main(String[] args) 
    {
        Thread thread1 = new MiaClasse("Brontolo");
        Thread thread2 = new MiaClasse("Cucciolo");
        Thread thread3 = new MiaClasse("Dotto");
        Thread thread4 = new MiaClasse("Eolo");
        Thread thread5 = new MiaClasse("Gongolo");
        Thread thread6 = new MiaClasse("Mammolo");
        Thread thread7 = new MiaClasse("Pisolo");
    
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();
    thread6.start();
    thread7.start();
    }
    
}
        