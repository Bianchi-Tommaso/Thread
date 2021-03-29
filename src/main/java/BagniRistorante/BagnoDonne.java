package BagniRistorante;

public class BagnoDonne 
{  
    private String TipoBagn;

    public BagnoDonne(String TipoBagn)
    {
        this.TipoBagn = TipoBagn;
    }
    
    public String getTipoBagn() 
    {
        return TipoBagn;
    }

    public void setTipoBagn(String TipoBagn) 
    {
        this.TipoBagn = TipoBagn;
    }
    
    public void Stampa()
    {   
        System.out.println("Il Bagno E' Occupato Da: " + Thread.currentThread().getName() + " In " + this.getTipoBagn());
    }
}
