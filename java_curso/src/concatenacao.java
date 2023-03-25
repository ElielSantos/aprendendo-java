import java.util.Locale;

public class concatenacao {

	public static void main(String[] args) {
		 String product1 = "Computer";
		 String product2 = "Office desk";
		 
		 int age = 30;
		 int code = 5290;
		 char gender = 'F';
         
		 double prince1 = 2100.0;
		 double prince2 = 650.50;
		 double prince3 = 53.234567;
		 
        System.out.println("Products:");
		System.out.printf(product1 + ", Which price is $ 2100,00\n");
        System.out.println(product2 + ", which prince is $ 650,50\n");
        
        System.out.printf("Record: %d years old, code %d and gender: %s" ,age, code, gender);
        
        System.out.printf("Measue with eight decimal places: %.8f\n", prince3);
        System.out.printf("Rouded(three decimal places): %.3f\n", prince3);
        
        Locale.setDefault(Locale.US);
        System.out.printf("US decimanl point: %.3f", prince3);
        
         
	}
                               
}
