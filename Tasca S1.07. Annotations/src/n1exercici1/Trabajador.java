package n1exercici1;

public class Trabajador {
	
	private String nombre;
	private String apellido;
	private double precio_hora;
	
	
	public Trabajador(String nombre, String apellido, double precio_hora) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.precio_hora=precio_hora;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public double getPrecio_Hora() {
		return precio_hora;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public void setPrecio_Hora(double precio_hora) {
		this.precio_hora=precio_hora;
	}
	public double calcularSou(int horasTrabajadas) {
        return horasTrabajadas * precio_hora;
    }
	@Override
	public String toString() {
		return "Me llamo " + nombre + ", mi apellido es " + apellido + " e cobro a la hora el valor de " + precio_hora + "€.";
	}
}







