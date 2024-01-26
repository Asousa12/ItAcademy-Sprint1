package n1exercici1;
import java.util.ArrayList;
public class Venta {
	private ArrayList<Producto> productos;
    private double precioTotal;

    public Venta() {
        this.productos = new ArrayList<Producto>();
        this.precioTotal = 0;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal=precioTotal;
    }

    public void calcularTotal() throws VentaBuidaException {
        if (this.productos.isEmpty()) {
            throw new VentaBuidaException("Para hacer una venta primero tienes que añadir productos");
        } else {
            double total=0;
            for(Producto producto : this.productos) {
                precioTotal += producto.getPrecio();
                total=precioTotal;

                System.out.println(total);
            }
        }
    }
}
