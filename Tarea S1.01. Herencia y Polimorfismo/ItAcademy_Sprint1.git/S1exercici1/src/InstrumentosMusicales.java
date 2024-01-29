public abstract class InstrumentosMusicales {

    private String nombre="";
    private double precio=0.0;


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

    public abstract String tocar();
}
