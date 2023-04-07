//print básico_no_java_e_um_pouco_de_concatenação

public class pessoa {

	public static void main(String[] args) {
		
		String name = "Eliel";
		int age = 21;
	    double height = 1.78;
	    char gender = 'M';
		
	    System.out.println(name  + age + height + gender); 
	    System.out.printf("%s tem %s e altura de %.2fcm e se indentifica como: %s", name, age, height, gender);
	}

}
