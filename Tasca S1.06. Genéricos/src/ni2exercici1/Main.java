package ni2exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Andreia","Sousa",35);
		
		GenericMethods.GenericMethods("Andreia", 56, 86);
		GenericMethods.GenericMethods("Andreia",56, "Sousa");
		GenericMethods.GenericMethods("Andreia",person, "Sousa");

	}

}
