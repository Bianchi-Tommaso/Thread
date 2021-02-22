package Contaotre;

public class Contatore1 implements Runnable
{
    static Integer c;

    public Contatore1(Integer c)
    {
        this.c = c;
    }

    public void run()
    {
        while(1 == 1)
        {
          if(this.c > 100)
          {
            this.c--;
            System.out.println("Valore C: " + c);
          }
        }   
    }
}
