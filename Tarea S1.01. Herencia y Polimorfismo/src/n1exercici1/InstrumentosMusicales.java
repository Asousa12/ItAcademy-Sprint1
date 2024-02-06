package n1exercici1;

public abstract class InstrumentosMusicales {

    protected String nombre;
    protected double precio;


    public InstrumentosMusicales(String nombre, double precio) {

        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public static void sinfonia() {
    	System.out.println("Con el conjunto de instrumentos tocaremos una sinfonia");
    }

    public abstract String tocar();
}
    

