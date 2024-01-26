package n2exercici2;

public class GenericMethods<T > {
	
	private String nombre;
	private T apellido;
	private T edad;
	
	
	public static <T> void GenericMethods(String nombre, T apellido, T edad, T...elementos ){
		
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(edad);
		
		for(T list : elementos) {
			System.out.println(list);
			
		}
		
	}

}
