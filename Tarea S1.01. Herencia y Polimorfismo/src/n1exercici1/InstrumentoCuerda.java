package n1exercici1;

public class InstrumentoCuerda extends InstrumentosMusicales{

    public InstrumentoCuerda(String nombre, double precio){
        super(nombre, precio);
    }
   public String tocar() {
        return "Está sonando un instrumento de cuerda";
    }
}