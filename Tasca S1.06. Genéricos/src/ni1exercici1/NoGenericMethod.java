package ni1exercici1;

import java.util.ArrayList;

public class NoGenericMethod {
	
	private String nombre;
	private String identificacion;
	private String departamento;
	
	
	public static void programa() {
		
	 ArrayList<NoGenericMethod> empleado = new ArrayList<NoGenericMethod>(3);
	 
	empleado.add(new NoGenericMethod("Andreia","1234568","RH"));
	empleado.add(new NoGenericMethod("Susana","Finanzas","1547896"));
	empleado.add(new NoGenericMethod("Transporte","15248796","Santiago"));
	
	for(NoGenericMethod e : empleado)
		System.out.println(e.getNombre()+ " " + e.getIdentificacion() + " "+ e.getDepartamento());
	}
	
	
	public NoGenericMethod(String nombre, String identificacion, String departamento) {
		this.nombre=nombre;
		this.identificacion=identificacion;
		this.departamento=departamento;
	}

	public String getNombre() {
		return nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public String getDepartamento() {
		return departamento;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion=identificacion;
	}
	public void setDepartamento(String departamento) {
		this.departamento=departamento;
	}
	
}
