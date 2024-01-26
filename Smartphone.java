package n1exercici2;

public class Smartphone extends Telefono implements Camera, Reloj {

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public void fotografiar() {
        System.out.println("Se está haciendo una foto");
    }

    public void alarma() {
        System.out.println("Está sonando la alarma");
    }
}
