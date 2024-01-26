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
			out.close();
			System.out.println("El objeto se ha serializado correctamente.");
		
			
		}catch(Exception e) {
			e.getMessage();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		
	 
	 public static void Deserializar() {
		
		try {
			FileInputStream fileIn = new FileInputStream("silla.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Silla silla_recuperada=(Silla)in.readObject();
			in.close();
			fileIn.close();
			
			System.out.println("El objeto se ha deserializado correctamente." + silla_recuperada.getTipo() + " " + silla_recuperada.getColor());
				
		}catch(Exception e) {
			e.getMessage();
		}
	}
}

	



		
	


