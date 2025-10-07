package paquete;

public class Cuenta {
	
	double saldo = 0;
	String numero;
	String titular;
	
	
	public Cuenta(double saldo, String numero) {
		this.saldo = saldo;
		this.numero = numero;
	}

	public void Ingresar(double saldo) {
		this.saldo += saldo;
		
	}
	
	public void Retirar(double saldo) {
		if(this.saldo - saldo < -500) {
			System.out.println("Fondos insuficientes (saldo " + this.saldo + ") en la cuenta " + this.numero + " para el reintegro de " + saldo);
		}
		else {
			this.saldo -= saldo;
		}
		 
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
