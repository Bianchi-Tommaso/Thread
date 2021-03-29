package BagniRistorante;

public class Donna extends Thread
{
    private String nome;
    BagnoDonne bd;

    public Donna(String nome) 
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }  
    
    public String nomeThread()
    {
        return "Donna: " + this.getNome();
    }
    
    public void run()
    {                
        synchronized(bd)
        {
            System.out.println("Il Bagno E' Occupato Da: " + nomeThread() + " " + bd.getTipoBagn());
        }
    }
}
