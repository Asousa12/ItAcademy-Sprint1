package n1exercici2;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculoDniTest {
	
	
	@ParameterizedTest
	@CsvSource({
	    "12345678,Z",
	    "12345679,S",
	    "12345680,Q",
	    "12345681,V",
	    "12345682,H",
	    "12345683,L",
	    "12345684,C",
	    "12345685,K",
	    "12345686,E",
	    "12345687,T"
	})
	public void testCalcularLetra(int numeroDni, char letraEsperada) {
	    char letraCalculada = CalculoDni.calcularLetra(numeroDni);
	    assertEquals(letraEsperada, letraCalculada);
	}
 }

	
	




