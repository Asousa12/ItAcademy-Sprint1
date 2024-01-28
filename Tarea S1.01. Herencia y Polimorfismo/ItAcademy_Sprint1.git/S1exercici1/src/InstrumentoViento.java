public class InstrumentoViento extends InstrumentosMusicales {

    public InstrumentoViento(String nombre, double precio){
        super(nombre, precio);
    }
 public String tocar(){
        return "Está sonando un instrumento de viento";
 }

}
