package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
		//Menu opções
		 System.out.println("... Bem Vindo ao Sistema de Cofrinho de Moedas!...");
		 System.out.println("......... Menu ........");
	         System.out.println(">>> 1- Adicionar Moeda ");
		 System.out.println(">>> 2- Remover Moeda   ");
		 System.out.println(">>> 3- Listar Moedas   ");
	         System.out.println(">>> 4- Total Depositado");
	         System.out.println(">>> 0- Encerrar        ");
	         System.out.println(".......................");
		 opcao = teclado.nextInt();
		
		double typeCoin; //Váriavel tipo da moeda
		double enteredValue;; //Valor inserido da moeda
		Moeda coin; //Moeda
		
		while(opcao!=0) {
			switch(opcao) {
			case 1: //Método para adicionar os tipos de moedas disponíveis.
				typeCoin = 0;
				while(typeCoin > 3 || typeCoin <= 0) {
					System.out.println("    Escolha o tipo da moeda ");
					System.out.println(">>> 1- Dolar................");
					System.out.println(">>> 2- Euro.................");
					System.out.println(">>> 3- Real.................");
					typeCoin = teclado.nextInt();
				}
				
				System.out.println("introduze um valor:");
				enteredValue = teclado.nextDouble();
				 coin = null;

				 if(typeCoin == 1) {
					 coin = new Dolar(enteredValue);
				 }
				 if(typeCoin == 2) {
					 coin = new Euro(enteredValue);
				 }
				 if(typeCoin == 3) {
					 coin = new Real(enteredValue);
				 }
				    cofrinho.adicionar(coin);
					break;

			case 2: //Método para remover moedas.
				 typeCoin = 0;
				while(typeCoin > 3 || typeCoin <= 0) {
					System.out.println("    Escolha o tipo da moeda ");
					System.out.println(">>> 1- Dolar................");
					System.out.println(">>> 2- Euro.................");
					System.out.println(">>> 3- Real.................");
					typeCoin = teclado.nextInt();
				}

				System.out.println("introduze um valor:");
				enteredValue = teclado.nextDouble();
				 coin = null;

				 if(typeCoin == 1) {
					 coin = new Dolar(enteredValue);
				 }
				 if(typeCoin == 2) {
					 coin = new Euro(enteredValue);
				 }
				 if(typeCoin == 3) {
					 coin = new Real(enteredValue);
				 }
				    cofrinho.remover(coin);
				    break;			

			case 3: //Método para listar moedas.
				cofrinho.listar();
				break;

			case 4: //Calcular valor total convertido para real.
				System.out.println("Total convertido para real: R$ " + cofrinho.valorConvertido());
				break;

			default:
				System.out.println("Essa opção não existe!!!");
			}
			
	    	       System.out.println("......... Menu ........");
	               System.out.println(">>> 1- Adicionar Moeda ");
		       System.out.println(">>> 2- Remover Moeda   ");
		       System.out.println(">>> 3- Listar Moedas   ");
	               System.out.println(">>> 4- Total Depositado");
	               System.out.println(">>> 0- Encerrar        ");
	               System.out.println(".......................");

			opcao = teclado.nextInt();
		}
		    System.out.println("Sistema encerrado, Até breve!");
	}
}
