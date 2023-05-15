//print básico_no_java_e_um_pouco_de_concatenação

public class pessoa {

	public static void main(String[] args) {
		
		String name = "ANA YANOMAMI";
		int age = 18;
	    double height = 1.62;
	    char gender = 'F';
		
	    System.out.println(name  + age + height + gender); 
	    System.out.printf("%s tem %s e altura de %.2fcm e se indentifica como: %s", name, age, height, gender);
	}

}
