package n1exercici1;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ListAlfabeto {
	
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
	                System.out.println("Directorio: " + item);
	                System.out.println();
	                lista(fichero);
	            } else {
	                System.out.println("Archivo: " + item);
	            }
	        }
		}
}


