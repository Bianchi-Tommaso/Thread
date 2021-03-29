package BagniRistorante;

public class Uomo extends Thread
{
    private String nome;
    BagnoUomini bu;

    public Uomo(String nome) 
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
        return "Uomo: " + getNome();
    }
    
     public void run()
    {
        
        synchronized(bu)
        {
            System.out.println("Il Bagno E' Occupato Da: " + nomeThread() + " " + bu.getTipoBagn());
        }
    }
}
