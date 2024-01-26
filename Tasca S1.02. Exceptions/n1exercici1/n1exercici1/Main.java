package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Venta venta = new Venta();
		

		 try {
       venta.calcularTotal();
   } catch (VentaBuidaException e) {
       System.out.println(e.getMessage());
   }
}

}
