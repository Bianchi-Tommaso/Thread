package CalcoloParallelo;

/**
 *
 * @author HP
 */
public class CalcoloParalleloEs
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double a = 4, b = 3, c = 12;
       
       System.out.println("Devo Calcolare: 5 * [(2a + 4)(7b + 3)]- 10c");
       Buffer parziali = new Buffer(a, b, c);
       Operazioni1 th1 = new Operazioni1(parziali);  //(2a + 4)
       Operazioni2 th2 = new Operazioni2(parziali);  //(7b + 3);
       Operazioni3 th3 = new Operazioni3(parziali);  //(moltiplico i risultati di Operazioni1 e Operazioni2 e anche * 5)
       Operazioni4 th4 = new Operazioni4(parziali);  //(operazioni3 -10c)
       
       th1.start(); //(2a + 4)
       th2.start(); //(7b + 3);
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
           th2.join();
       }
       catch(InterruptedException e)
       {
           System.out.println("Errore th2");
       }
       
       th3.start();
       
       try
       {
           th3.join();
       }
       catch(InterruptedException e)
       {
           System.out.println("Errore th3");
       }
       
       th4.start();

    }
    
}
