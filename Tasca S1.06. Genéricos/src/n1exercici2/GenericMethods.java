package n1exercici2;

public class GenericMethods<T> {

	private T nombre;
	private T apellido;
	private T edad;
	
	
	public static <T> void GenericMethods(T nombre, T apellido, T edad){
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(edad);
		
	}
}
