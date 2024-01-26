package n1exercici2;

public class Trabajador {
	
	private String nombre;
	private String apellido;
	private double precio_hora;
	private double incentivo;
	
	
	public Trabajador(String nombre, String apellido, double precio_hora, double incentivo) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.precio_hora=precio_hora;
		this.incentivo=incentivo;
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
	public double getIncentivo() {
	    return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo=incentivo;
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
	@Deprecated
	public double calcularSueldo2020(int horasTrabajadas) {
		return horasTrabajadas * precio_hora + incentivo;
	}
	
	public double calcularSueldo2024(int horasTrabajadas) {
        return horasTrabajadas * precio_hora;
    }
	@Override
	public String toString() {
		return "Me llamo " + nombre + ", mi apellido es " + apellido + " e cobro a la hora el valor de " + precio_hora + "€.";
	}
}



