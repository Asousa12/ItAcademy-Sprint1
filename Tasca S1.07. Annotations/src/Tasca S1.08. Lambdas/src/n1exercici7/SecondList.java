package n1exercici7;

import java.util.Arrays;
import java.util.List;

public class SecondList {
	
	public static void programa() {
		
		List<Object> lista = Arrays.asList("Andreia", 12, "Santiago", 25, "Susana", 3, "Diogo", 27);
		lista.sort((a, b) -> b.toString().length() - a.toString().length());
		
		System.out.println(lista);
	}

}
