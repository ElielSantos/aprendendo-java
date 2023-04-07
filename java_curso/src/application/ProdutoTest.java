package application;

public class ProdutoTest {

	public static void main(String[] args) {

		// construtor padrao
		Produto p1 = new Produto();
		p1.nome = "Caneta azul";
		p1.marca = "Bic";
		p1.valor = 1.50f;

		// construtor de dois parametos
		Produto p2 = new Produto("Borracha", "Mercur");
		p2.valor = 1.80f;

		// construtor de tres parametros
		Produto p3 = new Produto("Lapis", "Paris", 4.0f);
        
		System.out.println("Você comprou: " + p1.nome + " da marca " + p1.marca + " no valor de: " + p1.valor + "$");
		System.out.println("Você comprou: " + p2.nome + " da marca " + p2.marca + " no valor de: " + p2.valor + "$");
		System.out.println("Você comprou: " + p3.nome + " da marca " + p3.marca + " no valor de: " + p3.valor + "$");

	}
        

}
