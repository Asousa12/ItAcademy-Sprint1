package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador trabajador = new Trabajador("Andreia","Sousa",15.00);
		TrabajadorOnline trabajadorOnline =  new TrabajadorOnline("Santiago","Santos",13.0, 40);
		TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Susana","Ribeiro",13.0, 70.0);
		
	    System.out.println(trabajador.toString() + " Mi sueldo es de: " + trabajador.calcularSou(25) + "€.");
	    System.out.println(trabajadorOnline.toString() + " Mi sueldo es de: " + trabajadorOnline.calcularSou(25) + "€.");
	    System.out.println(trabajadorPresencial.toString() + " Mi sueldo es de: " + trabajadorPresencial.calcularSou(25) + "€.");

	}

}
