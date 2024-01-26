package n1exercici2;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculoDniTest {
	
	
	@Test
	    public void testCalcularLetra() {
	       
	        int[] numerosDni = {12345678, 12345679, 12345680, 12345681, 12345682, 12345683, 12345684, 12345685, 12345686, 12345687};
	        char[] letrasEsperadas = {'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};

	    
	        for (int i = 0; i < numerosDni.length; i++) {
	       
	            char letraEsperada = letrasEsperadas[i];
	           
	            char letraReal = CalculoDni.calcularLetra(numerosDni[i]);
	            assertEquals(letraEsperada, letraReal);
	        }
	
	    }
	
	
 }



