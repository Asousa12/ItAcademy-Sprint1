package n1exercici4;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	
public static void Programa() {
		
		List<String> month = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
		
		month.forEach(System.out::println);
	}

}
