package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class LambdaListaMeses {
	
	
	public static void Programa() {
		
		List<String> month = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
		
		month.forEach(mes -> System.out.println(mes));
	}
	

}
