package n1exercici2;

public class Coche {
	
	public static final String marca="Seat";
	   public static String modelo="Arona";
	   public final int potencia;

	    public Coche(int potencia){
	        this.potencia=potencia;
	    }
	    public static void frenar(){
	        System.out.println("El vehículo está frenando");
	    }
	    public void acelerar(){
	        System.out.println("El vehículo está acelerando");
	    }
	}
	
	


