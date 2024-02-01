package n1exercici3;
import java.util.*;
import java.io.*;


public class Game {

    Scanner entrada = new Scanner(System.in);
    HashMap<String, String> paises = new HashMap<>();
    String capitales;
    String name;
    String respuesta;
    int score;

    public void Programa() {

        HashMap<String, String> paises = ReadCountries();
        System.out.println("¿Cuál es tu nombre? ");
        name = entrada.nextLine();
        System.out.println("Te dire un pais y tu me tiene que adivinar la capital. Tienes 10 tentativas y sumas puntos.");        
        
        int puntos=0;  
        
        for (int i = 0; i < 10; i++) {

            Random random = new Random();            
            int randomNumber = random.nextInt(paises.size());
            
            String randomCountry = (String)paises.keySet().toArray()[randomNumber];
            String randomCapital = paises.get(randomCountry);
            System.out.println("¿Cuál es la capital de " + randomCountry + "?");
            
            respuesta = entrada.nextLine();
            
            if (respuesta.equals(randomCapital)) {
                puntos++;
            }            
        }
        
        savePuntos(name,puntos);
        System.out.println("Parabens " + name + " seu Score : " + puntos + "\n");
        
    }    

    public HashMap<String,String> ReadCountries() {

        HashMap<String, String> paises = new HashMap<String, String>();
        FileReader fileReader = null;
        BufferedReader readPerfection = null;

        try (fileReader = new FileReader("countries.txt")
        {
            readPerfection = new BufferedReader(fileReader);
            String line = "";

            while ((line = readPerfection.readLine()) != null) {
               
	                String[] parts = line.split(" ");
	                if(parts.length > 1)
	                {
		                String country = parts[0];
		                String capital = parts[1];		                
		                paises.put(country, capital);		                
	                }
            }
            
            readPerfection.close();
        }
        catch (IOException e) {

            e.printStackTrace();
        }
        
        return paises;
    }

    public void savePuntos(String name, int score){

            File file = new File("clasificacio.txt");
            try (FileWriter fileWriter = new FileWriter(file, true))
            { 
                
                fileWriter.write(name + " " + score + "\n");
                fileWriter.close();  
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            }          
    }    
}
	

	    


	
	
	

		
