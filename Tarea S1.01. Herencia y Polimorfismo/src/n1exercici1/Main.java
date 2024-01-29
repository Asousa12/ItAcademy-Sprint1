package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstrumentoViento flauta = new InstrumentoViento("Flauta", 50.00);

        InstrumentoCuerda Guitarra = new InstrumentoCuerda("Guitarra", 120.00);

        InstrumentoPercursion bateria = new InstrumentoPercursion("bateria", 250.00);

    InstrumentosMusicales.sinfonia();
    System.out.println(flauta.tocar());
    System.out.println(Guitarra.tocar());
    System.out.println(bateria.tocar());

	}

}
