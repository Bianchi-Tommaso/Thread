package join;

public class ProgCalcoloParallelol 
{
    public static void main(String[] args) 
    {
       double a = 2, b = 3, c = 4;
       
       System.out.println("Devo Calcolare: 3 * (a - 1) + 2 * (b - 2) + 3 * (c - 3)");
       Buffer parziali = new Buffer(a, b, c);
       Operazioni th1 = new Operazioni(parziali); 
       Operazioni1 th2 = new Operazioni1(parziali);
       Operazioni2 th3 = new Operazioni2(parziali);
       Operazioni3 th4 = new Operazioni3(parziali);
       Operazioni4 th5 = new Operazioni4(parziali);
       
       th1.start();
       th2.start();
       th3.start();
       try
       {
           th2.join();
       }
       catch(InterruptedException e)
       {
           System.out.println("Errore th2");
       }
       
       try
       {
           th3.join();
       }
       catch(InterruptedException e)
       {
           System.out.println("Errore th3");
       }
       
       th4.start();
       
       try
       {
           th1.join();
       }
       catch(InterruptedException e)
       {
           System.out.println("Errore th1");
       }
       try
       {
           th4.join();
       }
       catch(InterruptedException e)
       {
           System.out.println("Errore th4");
       }
       
       th5.start();
       try
       {
           th5.join();
       }
       catch(InterruptedException e)
       {
           System.out.println("Errore th5");
       }
    }
    
}
