package n1exercici3;

import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    public void testThrowArrayIndexOutOfBoundsException() {
        ArrayIndexOutOfBoundsExceptionClass exceptionClass = new ArrayIndexOutOfBoundsExceptionClass();

        try {
            exceptionClass.throwArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
    
        }
    }
}
