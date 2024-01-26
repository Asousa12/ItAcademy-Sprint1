package n1exercici1;

public class TrabajadorOnline extends Trabajador {
	
	private static double tarifa_internet;

	public TrabajadorOnline(String nombre, String appelido, double precio_hora, double tarifa_internet) {
		super(nombre, appelido, precio_hora);
		this.tarifa_internet=tarifa_internet;
	}
	public double getTarifa_Internet() {
		return tarifa_internet;
	}
	public void settTarifa_Internet() {
		this.tarifa_internet=tarifa_internet;
	}
	
	@Override
	public double calcularSou(int horasTrabajadas) {
        return horasTrabajadas * super.getPrecio_Hora();
    }
	
	@Override
	public String toString() {
		return "Me llamo " + super.getNombre() + ", mi apellido es " + super.getApellido() + " e cobro a la hora el valor de " + super.getPrecio_Hora() + "€, " 
	           + " cobro de tarifa de internet " + tarifa_internet + "€.";
}

}
