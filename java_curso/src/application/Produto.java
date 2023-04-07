package application;

public class Produto {

	// atributos
	String nome;
	String marca;
	float valor;

	Produto() {

	}

	// com um parmetro
	Produto(String nome) {
		this.nome = nome;
	}

	// com dois parametros
	Produto(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
	}

	//com tres parametros
	Produto (String nome, String marca, float valor) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
    }
}
