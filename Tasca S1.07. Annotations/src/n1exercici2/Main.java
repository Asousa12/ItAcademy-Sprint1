package n1exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trabajador trabajador = new Trabajador("Andreia","Sousa",15.00, 100.0);
		TrabajadorOnline trabajadorOnline =  new TrabajadorOnline("Santiago","Santos",13.0, 50.0, 40);
		TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Susana","Ribeiro",13.0, 70.0, 20.0);
		
	    System.out.println(trabajador.toString() + " Mi sueldo es de: " + trabajador.calcularSueldo2024(25) + "€.");
	    System.out.println(trabajadorOnline.toString() + " Mi sueldo es de: " + trabajadorOnline.calcularSueldo2024(25) + "€.");
	    System.out.println(trabajadorPresencial.toString() + " Mi sueldo es de: " + trabajadorPresencial.calcularSueldo2024(25) + "€.");
        
	    @SuppressWarnings("deprecation")
	    double sueldo = trabajador.calcularSueldo2020(25);
	    @SuppressWarnings("deprecation")
	    double sueldo2 = trabajadorOnline.calcularSueldo2020(25);
	    @SuppressWarnings("deprecation")
	    double sueldo3 = trabajadorPresencial.calcularSueldo2020(25);
	}

}
