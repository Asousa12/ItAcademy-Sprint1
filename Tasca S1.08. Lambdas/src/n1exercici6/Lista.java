package n1exercici6;

import java.util.Arrays;
import java.util.List;

public class Lista {
	
	public static void programa() {
	
	List<Object> lista = Arrays.asList("Andreia", 12, "Santiago", 25, "Susana", 3, "Diogo", 27);
		lista.sort((a, b) -> a.toString().length() - b.toString().length());
		
		System.out.println(lista);
	}
	
	

}
