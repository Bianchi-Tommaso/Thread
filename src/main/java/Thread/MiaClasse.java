package Thread;

public class MiaClasse extends Thread
{
    public MiaClasse(String NomeThread)
    {
        setName(NomeThread);
    }
    
    public void run()
    {
        int i = 0;
        
        for(i = 0; i < 7; i++)
            System.out.println(i + 1 + " " + "Nome Thread: " +getName());
    }
}
