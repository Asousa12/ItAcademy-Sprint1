public class InstrumentoPercursion extends InstrumentosMusicales{

    public InstrumentoPercursion(String nombre, double precio){
        super(nombre, precio);
    }
    public String tocar() {
        return "Está sonando un instrumento de percusión";
    }
}
