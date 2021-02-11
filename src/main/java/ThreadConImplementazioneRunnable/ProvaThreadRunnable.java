package ThreadConImplementazioneRunnable;

public class ProvaThreadRunnable
{
    public static void main(String[] args) 
    {
        Runnable r = new MiaClasse("Brontolo");
        
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(new MiaClasse("Cucciolo"));
        Thread thread3 = new Thread(new MiaClasse("Dotto"));
        Thread thread4 = new Thread(new MiaClasse("Eolo"));
        Thread thread5 = new Thread(new MiaClasse("Mammolo"));
        Thread thread6 = new Thread(new MiaClasse("Gongolo"));
        Thread thread7 = new Thread(new MiaClasse("Pisolo"));
        
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();
    thread6.start();
    thread7.start();
    }
    
}
