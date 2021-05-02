package GoKart;

public class Classifica
{
    private long tempo;
    private String nomePilotaThread;
    
    public Classifica(long tempo, String nomePilotaThread)
    {
        this.tempo = tempo;
        this.nomePilotaThread = nomePilotaThread;
    }
    
    public String toString()    //Metodo toString per la classifica
    {
        String s = "Pilota: " + nomePilotaThread + " Ha Classifficato Un Tempo Pari A: " + tempo;
        
        return s;
    }
    
    public long getTempo() 
    {
        return tempo;
    }

    public void setTempo(long tempo)
    {
        this.tempo = tempo;
    }
    
    
}
