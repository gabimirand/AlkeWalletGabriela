package cuentas;

class CuentaBancaria {

	//Atributos
		protected String titular;
		protected int numeroCuenta;
		protected double saldo;
		
		//Constructor sin datos
		public CuentaBancaria() {
		}
		
		//Constructor con datos
		public CuentaBancaria(String titular, int numeroCuenta, double saldoInicial) {
			this.titular = titular;
			this.numeroCuenta = numeroCuenta;
			this.saldo = saldoInicial; 		 
		}


		//Getter para el atributo titular
		public String getTitular() {
			return titular;
		}
		
		//Getter para el atributo numero de Cuenta
			public double getNumeroCuenta() {
				return numeroCuenta;
			}
		
		//Getter para el atributo saldo
		public double getSaldo() {
			return saldo; 
		}
		
	
		//Método para depositar dinero
		public void depositar(double cantidad) {
			saldo = (saldo + cantidad); 
		}
		
		//Método para retirar dinero
		public void retirar(double cantidad) {
			if (saldo >= cantidad) {
				saldo = saldo - cantidad; 
			}else {
				System.out.println("Saldo insuficiente. No se pude realizar el retiro.");
			}
			
		}
		
		//Método para transferir entre cuentas
	    public void transferir(CuentaBancaria cuentaDestino, double cantidad) {
	    }

	
}
