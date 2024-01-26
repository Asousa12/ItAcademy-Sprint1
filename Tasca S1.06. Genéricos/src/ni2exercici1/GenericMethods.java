package ni2exercici1;

public class GenericMethods<T> {
	
	private String nombre;
	private T apellido;
	private T edad;
	
	
	public static <T> void GenericMethods(String nombre, T apellido, T edad){
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(edad);
		
	}

}
