package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    public void testThrowArrayIndexOutOfBoundsException() {
        ArrayIndexOutOfBoundsExceptionClass exceptionClass = new ArrayIndexOutOfBoundsExceptionClass();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        	exceptionClass.throwArrayIndexOutOfBoundsException();
        });
    }
}
