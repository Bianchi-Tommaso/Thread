package GoKart;

import java.util.ArrayList;

public class MainGoKart 
{    
        public static Semaforo spogliatoio = new Semaforo(2);
        public static Semaforo circuito = new Semaforo(4);
        public static ArrayList<Classifica> classifica = new ArrayList<Classifica>();
        public static ArrayList<Pilota> piloti = new ArrayList<Pilota>();
        public static ArrayList<String> nomi = new ArrayList<String>();
        
        
        
    public static void main(String[] args) throws InterruptedException
    {
        final int MAX_Piloti = 8;
        
       for(int i = 0; i < MAX_Piloti; i++)
       {
           
           
        //Creo gli 8 Piloti
           piloti.add(new Pilota());

       
        //Imposto i Nomi Ai Piloti
        piloti.get(i).setName("Pilota " + (i + 1));

       
        //Lancio I Piloti(Thread)
        piloti.get(i).start();

        }
     
        //Qui il Main aspetta che ogni pilota la sua Gara per stampare la classifica
        for(int i = 0; i < MAX_Piloti; i++)
        piloti.get(i).join();
        
        
           
       //Stampa della classifica generale.
       
        System.out.println("La Classiffica Finale In Base Al Tempo E' La Seguente:");
        Ordina();
        for(int i = 0; i < classifica.size(); i++)
        System.out.println(classifica.get(i).toString());
        
        System.out.println("Fine Gara");
    }

    private static void Ordina() //Metodo che Orina la classifica in base al tempo
    {
       int i = 0;
        int j = 0;
        int min = 0;
        Classifica temp;
         
        for (i = 0; i < classifica.size(); i++)
          {
                 min = i;

             for (j = i + 1; j < classifica.size(); j++)
            {
                if (classifica.get(j).getTempo() < classifica.get(min).getTempo())
                {
                    min = j;
                }
            }
                temp = classifica.get(min);
                classifica.set(min, classifica.get(i)); 
                classifica.set(i, temp);
          }
    }
     
}
