package empresa;

public class Euro extends Moeda {
	
	public Euro(double enteredValue) {
		super(enteredValue);
	}

	@Override
	public void info() {
		System.out.println("Euro: " + valor);
	}
	
	@Override
	public double converter() {
		double total = valor*5.31;
		return total;
	}

	@Override
	public String toString() {
		return "Inserido $ " + valor + " Euros. Equivale a R$ " + converter() + " Reais.";
	}
}
