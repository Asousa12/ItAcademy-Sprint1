package n1exercici1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Month> year = new ArrayList<Month>();
		
		year.add(new Month("Enero"));
		year.add(new Month("Febrero"));
		year.add(new Month("Marzo"));
		year.add(new Month("Abril"));
		year.add(new Month("Mayo")); 
		year.add(new Month("Junio"));
		year.add(new Month("Julio"));
		year.add(new Month("Septiembre"));
		year.add(new Month("Octubre"));
		year.add(new Month("Noviembre"));
		year.add(new Month("Diciembre"));
		
		year.add(7, new Month("Agosto"));
		
		System.out.println("\nLista con ArrayList:");
		
		for(Month month : year) {
		System.out.println(month.getName());
		}
		
		HashSet<Month> yearSet = new HashSet<>(year);
		
	     yearSet.addAll(year);
	     
	     System.out.println("\nLista con Hashet:");
	     
	     for (Month month : yearSet) {
	    	 System.out.println(month.getName()); 
	     }
	     
	     System.out.println("\nRecorrido lista con for:");
	     
		 for(int i =0; i <year.size(); i++) {
			 System.out.println(year.get(i).getName());
		 }
		 
		 System.out.println("\nRecorrido con iterador:");
	        Iterator<Month> iterator = year.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next().getName());
	        }
	}
}

