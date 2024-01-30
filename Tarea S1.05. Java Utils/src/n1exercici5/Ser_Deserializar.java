package n1exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;	

public class Ser_Deserializar {
	
	 public static void programa() {
		
     Silla silla = new Silla("madera","rojo");
     Serializar(silla);
     Deserializar();

	 }
	 public static void Serializar(Silla silla) {
			FileOutputStream fileOut = null;
			ObjectOutputStream out = null;
		
		try {
			fileOut = new FileOutputStream("silla.ser");
			out = new ObjectOutputStream(fileOut);
			out.writeObject(silla);
			System.out.println("El objeto se ha serializado correctamente.");
		
			
		}catch(Exception e) {
			e.getMessage();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
		
	 
	 public static void Deserializar() {
		 FileInputStream fileIn = null;
		 ObjectInputStream in = null;
		 
		try {
			fileIn = new FileInputStream("silla.ser");
			in = new ObjectInputStream(fileIn);
			Silla silla_recuperada=(Silla)in.readObject();
			
			System.out.println("El objeto se ha deserializado correctamente." + silla_recuperada.getTipo() + " " + silla_recuperada.getColor());
				
		}catch(Exception e) {
			e.getMessage();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

	



		
	


