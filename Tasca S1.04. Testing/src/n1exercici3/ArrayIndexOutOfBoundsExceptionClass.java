package n1exercici3;

public class ArrayIndexOutOfBoundsExceptionClass {
	
	private int[] array = new int[10];

    public void throwArrayIndexOutOfBoundsException() {
        array[11] = 1; 
    }

}
