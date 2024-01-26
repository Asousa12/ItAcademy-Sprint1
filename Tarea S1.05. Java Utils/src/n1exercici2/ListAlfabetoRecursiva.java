package n1exercici2;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ListAlfabetoRecursiva {
	
	
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
		
		for (String item : contenido) {
            File fichero = new File(file, item);
            
            if (fichero.isDirectory()) {
                System.out.println("Directorio: (D) " + item + " " + new Date(fichero.lastModified()));
                
                System.out.println();
                lista(fichero);
                
            } else {
                System.out.println("Archivo: (F) " + item + " " + new Date(fichero.lastModified()));
            }
        }
	}
}




     






