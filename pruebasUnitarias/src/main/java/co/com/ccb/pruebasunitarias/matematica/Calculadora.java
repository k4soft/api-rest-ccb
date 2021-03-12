package co.com.ccb.pruebasunitarias.matematica;

public class Calculadora {
	
	private double valor1;
	private double valor2;
	
	public Calculadora(double valor1, double valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public double sumar() {
		return valor1 + valor2;
	}

	public double restar() {
		return valor1 - valor2;
	}

	public double multiplicar() {
		return valor1 * valor2;
	}
	
	
	
	
}
