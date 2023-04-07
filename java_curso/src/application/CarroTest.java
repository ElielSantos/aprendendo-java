package application;

public class CarroTest {

	public static void main(String[] args) {

		// instanciando objeto
		Carro c1 = new Carro();

		c1.marca = "Ford";
		c1.modelo = "GL";
		c1.ano = 2020;
		c1.vel = 110;
		
		// chamar os metodos
		c1.acelerar(20);
		System.out.println("Velocidade :" + c1.vel + "km/h");

		c1.freiar(55);
		System.out.println("Velocidade :" + c1.vel + "km/h");
	  
	}
}
