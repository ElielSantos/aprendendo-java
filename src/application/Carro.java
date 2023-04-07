package application;

public class Carro {

	// atributos
	String marca;
	String modelo;
	String cor;
	int ano;
	int vel;

	// metodos
	void acelerar(int aceleracao) {
		vel += aceleracao;
	}

	void freiar(int reduzir) {
		vel -= reduzir;
	}

	void buzina() {
		System.out.println("pam pam");
	}

}