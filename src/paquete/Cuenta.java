package paquete;

public class Cuenta {
	
	double saldo = 0;
	String numero;
	String titular;
	
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double saldo) {
		this.saldo = 500.0;
		
	}
	
	public void Retirar(double saldo) {
		this.saldo = -500.0;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
