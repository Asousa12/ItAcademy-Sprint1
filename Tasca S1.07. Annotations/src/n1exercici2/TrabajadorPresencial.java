package n1exercici2;

public class TrabajadorPresencial extends Trabajador{
	
	private static double precio_gasolina;

	public TrabajadorPresencial(String nombre, String appelido, double precio_hora, double incentivo, double precio_gasolina) {
		super(nombre, appelido, precio_hora, incentivo);
		this.precio_gasolina=precio_gasolina;
	}
	public double getPrecio_Gasonila() {
		return precio_gasolina;
	}
	public void setPrecio_Gasolina(double precio_gasolina) {
		this.precio_gasolina=precio_gasolina;
	}
	@Deprecated
	public double calcularSueldo2020(int horasTrabajadas) {
		return horasTrabajadas * super.getPrecio_Hora() + super.getIncentivo();
	}
	
	@Override
	public double calcularSueldo2024(int horasTrabajadas) {
        return horasTrabajadas * super.getPrecio_Hora();
    }
	@Override
	public String toString() {
		return "Me llamo " + super.getNombre() + ", mi apellido es " + super.getApellido() + " e cobro a la hora el valor de " + super.getPrecio_Hora() + "€, " 
	           + " cobro de galosina " + precio_gasolina + "€.";
}
}
