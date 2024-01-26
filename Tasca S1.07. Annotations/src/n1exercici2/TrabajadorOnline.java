package n1exercici2;

public class TrabajadorOnline extends Trabajador {
	
	private static double tarifa_internet;

	public TrabajadorOnline(String nombre, String appelido, double precio_hora, double incentivo, double tarifa_internet) {
		super(nombre, appelido, precio_hora, incentivo);
		this.tarifa_internet=tarifa_internet;
	}
	public double getTarifa_Internet() {
		return tarifa_internet;
	}
	public void settTarifa_Internet() {
		this.tarifa_internet=tarifa_internet;
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
	           + " cobro de tarifa de internet " + tarifa_internet + "€.";
}

}
