package empresa;

public class Dolar extends Moeda{

	public Dolar(double enteredValue) {
		super(enteredValue);
	}

	@Override
	public void info() {
		System.out.println("Dolar: " + valor);
	}
	
	@Override
	public double converter() {
		double total = valor*4.89; //return this.valor * 4.89; Ao invés de criar a variável total
		return total;
	}

	@Override
	public String toString() {
		return "Inserido $ " + valor + " Dolares. Equivale a R$ " + converter() + " Reais.";
	}
}
