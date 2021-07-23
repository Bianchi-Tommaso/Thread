package GoKart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainGoKart 
{    
        public static Semaforo spogliatoio = new Semaforo(2);
        public static Semaforo circuito = new Semaforo(4);
        public static ArrayList<Classifica> classifica = new ArrayList<Classifica>();
        public static ArrayList<Pilota> piloti = new ArrayList<Pilota>();
        public static ArrayList<String> nomi = new ArrayList<String>();
        
        
        
    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException
    {
        //Chiedo in Input quanti Piloti che Gareggeranno
        final int MAX_Piloti = 100;
        final int MAX_Giri = 100;
        int inputPilotiUtente = 0;
        int inputContatoreGiri = 0;
        
        inputPilotiUtente = inputNumber("Inserire Piloti Da Gareggiare!!! Massimo " + MAX_Piloti + " Piloti.", MAX_Piloti);
        inputContatoreGiri = inputNumber("Inserire il numero di giri. Max "+MAX_Giri+".", MAX_Giri);
        
        nomi = loadNames("nomi.txt", inputPilotiUtente);
        
        if (nomi.isEmpty()) 
        {
            System.out.println("Impossibile continuare: non e' stato possibile generare i nomi dei piloti.");
            System.exit(0);
        }

          //Creo i Piloti e Imposto i Nomi Ai Piloti
        for(int i = 0; i < inputPilotiUtente; i++)
        {
           Pilota p = new Pilota(nomi.get(i), inputContatoreGiri);
           piloti.add(p);
           piloti.get(i).setName(p.getNomePilota());
        }    
   
       
            //Lancio I Piloti(Thread)
            for(int i = 0; i < inputPilotiUtente; i++)                
                piloti.get(i).start();
     
        //Qui il Main aspetta che ogni pilota completi la sua Gara per stampare la classifica
        for(int i = 0; i < inputPilotiUtente; i++)
        piloti.get(i).join();
           
       //Stampa della classifica generale.
        System.out.println("La Classifica Finale In Base Al Tempo E' La Seguente:");
        Ordina();
        for(int i = 0; i < classifica.size(); i++)
        System.out.println(classifica.get(i).toString());
        
        System.out.println("Fine Gara");
    }
    
    public static boolean isDigit(String controllo)
    {
        String numbers = "0123456789";
        
        for(int i = 0; i < controllo.length(); i++)
        {
            if(numbers.indexOf(controllo.charAt(i)) < 0)
                return false;
        }
        
        return true;
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

    public static ArrayList<String> loadNames(String filename, int number)
    {
        ArrayList<String> names = new ArrayList<String>();  
        if ( number > 0)
        {
            for(int i=0; i < number; i++) 
            {
                names.add("Pilota " + (i + 1));
            }
            if (!filename.isEmpty()) 
            {
                try 
                {
                    File hfilename = new File(filename);
                    Scanner myReader = new Scanner(hfilename);  
                    int i = 0;
                    while (myReader.hasNextLine() && i < number) 
                    {
                       String data = myReader.nextLine();
                       names.set(i, data);
                       i++;
                    }
                    myReader.close();
                }
                catch (FileNotFoundException e) 
                {
                    System.out.println("An error occurred opening or reading the file.");
                    //e.printStackTrace();
                }
            }
        }
        return names;
    }
    
    public static int inputNumber(String testo, int max_value) throws IOException
    {
        int inputValue;
        do
        {
            inputValue = 0;
            System.out.println(testo);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            
            if(isDigit(s))
            {
                inputValue = Integer.parseInt(s);    
            }
            else
            {
                System.out.println("Inserire Un Numero Non Una Stringa");
            }
             
        }while(inputValue > max_value || inputValue <= 0);
        
        return inputValue;
    }    
}
