package ThreadConImplementazioneRunnable;

public class MiaClasse implements Runnable
{
    String NomeThread;
    
    public MiaClasse(String NomeThread)
    {
        this.NomeThread = NomeThread;
    }
    
    @Override
    public void run()
    {
        int i = 0;
        
        for(i = 0; i < 7; i++)
            System.out.println(i + 1 + " " + "Thread Nome: " + NomeThread);
    }
    
}
