package n1exercici1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaList {


	public static void programa() {
		List<String> palabra = Arrays.asList("Casa", "Formacion", "Perro", "Television", "Niño");
		List<String> WordsWithO = getWordsWithO(palabra);
		
		System.out.println(WordsWithO);
	}
	
	
	public static List<String> getWordsWithO(List<String> palabras){
		
		return palabras.stream()
		        .filter(string -> string.contains("o"))
		        .collect(Collectors.toList());
		}
		
		
		
	}	
	 
	
	

	

