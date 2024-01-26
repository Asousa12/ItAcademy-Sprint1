package n1exercici1;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class YearListTest {

	@Test
	
	public void laListaTiene12Posiciones() {
     
        ArrayList<String> meses = new ArrayList<>();
        meses.add("enero");
        meses.add("febrero");
        meses.add("marzo");
        meses.add("abril");
        meses.add("mayo");
        meses.add("junio");
        meses.add("julio");
        meses.add("agosto");
        meses.add("septiembre");
        meses.add("octubre");
        meses.add("noviembre");
        meses.add("diciembre");

        assertEquals(12, meses.size());
        assertNotNull(meses);
        assertEquals("agosto", meses.get(7));
        
    }
	
}

 



