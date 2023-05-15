import java.util.Scanner;

public class String_funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String original = "SANTOS YANOMAMI   ";
		String v1 = "Banana Uva Manga";

		String so1 = original.toUpperCase();
		String so2 = original.toLowerCase();
		String so3 = original.trim();
		String so4 = original.replace("Santos", "Silva");
		String so5 = original.substring(6, 15);

		System.out.println("|toUpperCase  | " + so1);
		System.out.println("|toLowerCase  | " + so2);
		System.out.println("|trim         | " + so3);
		System.out.println("|replaces     | " + so4);
		System.out.println("|substring    | " + so5);

		String[] vect = v1.split(" ");

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

		sc.close();
	}

}
