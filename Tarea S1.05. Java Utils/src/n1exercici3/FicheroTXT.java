package n1exercici3;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class FicheroTXT {
		
		
		public static void programa() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Dime una ruta");
			String entrada = scanner.nextLine();
			
			File ruta = new File(entrada);
			
			lista(ruta);
		}
		
		
		public static void lista(File file) {
			
			 
			String[] contenido = file.list();
			
			Arrays.sort(contenido);
			
			try(PrintWriter writer = new PrintWriter("lista.txt")){
			
			for (String item : contenido) {
	            File fichero = new File(file, item);
	            
	            if (fichero.isDirectory()) {
	                writer.println("Directorio: (D) " + item + " " + new Date(fichero.lastModified()));
	                
	                writer.flush();
	                lista(fichero);
	                
	            } else {
	                writer.println("Archivo: (F) " + item + " " + new Date(fichero.lastModified()));
	            }writer.flush();
	        }
		}catch (Exception e) {
            e.printStackTrace();
            
		}
	 
	}

}
	



