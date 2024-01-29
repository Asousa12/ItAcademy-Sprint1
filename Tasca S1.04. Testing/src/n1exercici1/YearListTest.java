package n1exercici1;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class YearListTest {

    private YearList yearList;

    @BeforeEach
    public void setUp() {
    	yearList = new YearList();
    }

    @Test
    public void testListaDeMesesTiene12Posiciones() {
        List<String> meses = yearList.getMeses();
        assertEquals(12, meses.size());
    }

    @Test
    public void testListaDeMesesNoEsNula() {
        List<String> meses = yearList.getMeses();
        assertNotNull(meses);
    }

    @Test
    public void testPosicion8DeLaListaContieneAgosto() {
        List<String> meses = yearList.getMeses();
        assertEquals("agosto", meses.get(7));
    }
}
	




 



