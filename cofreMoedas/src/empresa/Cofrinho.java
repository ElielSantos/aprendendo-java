package empresa;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	//Lista/Estoque de novas moedas
	private List<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda c) { //Função adicionar moedas
		listaMoedas.add(c);
	}
	
	public void remover(Moeda c) { //Função remover moedas
		listaMoedas.remove(c);
	}
	
	public void listar() { //Mostrar moedas do ArrayList
		if (this.listaMoedas.isEmpty()) {
 			System.out.println("--Cofre está vazio!--");
			System.out.println(".....................");
			System.out.println("Adicione uma moeda:");
			return;
		}
		
		for(Moeda c : listaMoedas) {
			System.out.println(c);
		}
	}
	
	public double valorConvertido(){  //Retorna total convertido de moedas 
		double total = 0;
		for(Moeda moeda : listaMoedas) {
			total += moeda.converter();
		}
		return total;
	}	
}
