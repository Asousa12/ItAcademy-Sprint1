package n1exercici2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.*;
public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(10);
		lista.add(15);
		lista.add(20);
		System.out.println(lista);
		
		List<Integer> lista2Inverso = new ArrayList<Integer>(lista);
		Collections.reverse(lista2Inverso);
		
		System.out.println(lista2Inverso);
		
		ListIterator<Integer> iteratorlista = lista.listIterator();
		while (iteratorlista.hasNext()) {
			  lista2Inverso.add(iteratorlista.next());
			}
		System.out.println(lista2Inverso);
		
		
	}

}
