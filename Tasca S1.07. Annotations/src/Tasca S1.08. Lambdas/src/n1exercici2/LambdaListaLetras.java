package n1exercici2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaListaLetras {
	
	public static void programa() {
		List<String> palabra = Arrays.asList("Casa", "Formacion", "Perro", "Television", "Niño");
		List<String> WordsWithOMoreFiveLetters = getWordsWithOandMoreFiveLetters(palabra);
		
		System.out.println(WordsWithOMoreFiveLetters);
	}
	
	
	public static List<String> getWordsWithOandMoreFiveLetters(List<String> palabras){
		
		return palabras.stream()
		        .filter(string -> string.contains("o") && string.length() > 5)
		        .collect(Collectors.toList());
		}
		
		
		
	}	
	 


