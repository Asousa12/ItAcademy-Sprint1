package n1exercici2;

public class Telefono {
	
	private String marca;
    private String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca() {
    	return marca;
    }
    public String getModelo() {
    	return modelo;
    }
    
    public void setMarca(String marca) {
     this.marca=marca;
    }
    public void setModelo(String modelo) {
     this.modelo=modelo;
    }

    public void llamar(String número) {
        System.out.println("Llamando al número " + número);
    }
}

