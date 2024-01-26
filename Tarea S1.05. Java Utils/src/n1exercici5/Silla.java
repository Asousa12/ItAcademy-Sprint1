package n1exercici5;

public class Silla implements Serializable{
	
	private String tipo;
	private String color;
	
	public Silla(String tipo,String color) {
	
		this.tipo = tipo;
		this.color = color;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
 


