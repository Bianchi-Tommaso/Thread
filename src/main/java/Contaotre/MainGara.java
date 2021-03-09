package Contaotre;

public class MainGara
 {
    public static int RUN = 0;
  
    public static void main(String[] args) 
    {
        Counter c1 = new Counter();
        Thread t1 = new Thread(c1, "Contatore 1");
        
        Counter c2 = new Counter();
        Thread t2 = new Thread(c2, "Contatore 2");

        Counter c3 = new Counter();
        Thread t3 = new Thread(c3, "Contatore 3");

            t1.start();
            t2.start();
            t3.start();

            RUN = 1;
            try 
            {
                 Thread.sleep(20000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
           
            RUN = 2;
    }
}
