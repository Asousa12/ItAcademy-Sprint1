package n2exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Andreia","Sousa",35);
		
		GenericMethods.GenericMethods("Andreia", 56, 86);
		GenericMethods.GenericMethods("Andreia",56, "Sousa");
		GenericMethods.GenericMethods("Andreia",person, "Sousa");
		
		// En este caso lo crio para poder testar como da error al introducir un int, donde tengo un String.
		//GenericMethods.GenericMethods(12,person, "Sousa");
	}

}
