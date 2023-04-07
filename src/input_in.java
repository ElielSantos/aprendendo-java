import java.util.Scanner;

public class input_in {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
          
		x = sc.next();
		y = sc.nextInt();
  		
		System.out.printf("%s tem %d anos", x ,y);

     sc.close();
	}
}
