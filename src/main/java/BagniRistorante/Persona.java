package BagniRistorante;

public class Persona extends Thread
{
    private String nome;
    private String sesso;

    public Persona(String nome, String sesso) 
    {
        this.nome = nome;
        this.sesso = sesso;
    }

    public String getNome()
    {
        return nome;
    }

    public String getSesso() 
    {
        return sesso;
    }
    
    public void run()
    {
        
        BagnoDonne bd = new BagnoDonne("");
        BagnoUomini bu = new BagnoUomini("");
        
        while(ProgBagni.RUN == 1)
        {
            if(this.sesso == "F")
            {
                synchronized(bd)
                {
                    bd.Stampa();
                }
            }
        
            if(this.sesso == "M")
            {
                synchronized(bu)
                {
                    bu.Stampa();
                }
            }
        }
    }
}
