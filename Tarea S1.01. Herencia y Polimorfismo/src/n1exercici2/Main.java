package n1exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Coche micoche = new Coche(100);
	    micoche.acelerar();
	    Coche.frenar();
	    System.out.println(Coche.marca);
	    System.out.println("La marca de mi coche es: " + Coche.marca + " modelo " + Coche.modelo + " y con una potencia de " + micoche.potencia);

	}

}
