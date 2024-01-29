package n1exercici2;

import java.util.Scanner;

public class CalculoDni {	
	
	 public static void LetraDni() {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Dime un numero de Dni y te dire la letra");
		 int numeroDni = scanner.nextInt();
		   
		   
		   char letra = calcularLetra(numeroDni);
		   System.out.println("El DNI " + numeroDni + " tiene la letra " + letra);
	}
	
     public static char calcularLetra(int numeroDni) {
	   int resto = numeroDni % 23;
	   String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
	   return letrasDni.charAt(resto);
}

}
