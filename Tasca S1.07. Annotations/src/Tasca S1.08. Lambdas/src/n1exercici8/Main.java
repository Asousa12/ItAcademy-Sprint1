package n1exercici8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse reverser = (input) -> {
			  StringBuilder builder = new StringBuilder(input);
			  builder.reverse(); 
			  return builder.toString(); 
		};
		
		String alreves = reverser.getReverse("Hola me llamo Andreia");
		
        System.out.println("Frase normal: Hola me llamo Andreia" );
        System.out.println("Frase al reves: " + alreves);
	}

}
