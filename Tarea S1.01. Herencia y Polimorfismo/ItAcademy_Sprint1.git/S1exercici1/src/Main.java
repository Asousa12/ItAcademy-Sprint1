public class Main {
    public static void main(String[] args) {

        InstrumentoViento flauta = new InstrumentoViento("Flauta", 50.00);

        InstrumentoCuerda Guitarra = new InstrumentoCuerda("Guitarra", 120.00);

        InstrumentoPercursion bateria = new InstrumentoPercursion("bateria", 250.00);


    System.out.println(flauta.tocar());
    System.out.println(Guitarra.tocar());
    System.out.println(bateria.tocar());

        }



    }
