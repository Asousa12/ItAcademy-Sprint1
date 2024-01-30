package n1exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ReadFicheroTXT {

			public static void programa() {
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Dime una ruta");
				String entrada = scanner.nextLine();
				
				File ruta = new File(entrada);
			
				ImprimirDirectorio(ruta);
				FileRead(ruta);
			}
						
			public static void ImprimirDirectorio(File file) {
				
				 
				String[] contenido = file.list();
				
				Arrays.sort(contenido);
				
				try(PrintWriter writer = new PrintWriter("lista.txt")){
				
				for (String item : contenido) {
		            File fichero = new File(file, item);
		            
		            if (fichero.isDirectory()) {
		                writer.println("Directorio: (D) " + item + " " + new Date(fichero.lastModified()));
		                
		                writer.flush();
		                ImprimirDirectorio(fichero);
		                
		            } else {
		                writer.println("Archivo: (F) " + item + " " + new Date(fichero.lastModified()));
		            }writer.flush();
		        }
			}catch (Exception e) {
	            e.printStackTrace();
	            
			}
		}
		 public static void FileRead(File file) {
			 
			 File fichero = new File("lista.txt");
			 
			 if(fichero.exists()) {
				 try(FileReader fileReader = new FileReader(fichero)){
					 BufferedReader bffread = new BufferedReader(fileReader);
					
					 String linea;
			      
				 while ((linea = bffread.readLine()) != null) {
			            System.out.println(linea);
				 }
			}
	
			 catch(IOException e) {
			 System.out.println(e.getMessage());
		 }

	 }
		 
		 }
}
		

