package cuentas;

public class CuentaCorriente extends CuentaBancaria {
	
	public CuentaCorriente(String titular, int numeroCuenta, double saldoInicial) {
		super(titular, numeroCuenta, saldoInicial); 
	}
	
	
	@Override 
	//Método para depositar dinero
	public void depositar(double cantidad) {
		super.depositar(cantidad);
		System.out.println("¡DEPÓSITO REALIZADO CON ÉXITO! " + titular + " se ha depositado $" + cantidad + "en tu Cuenta Corriente n°" + numeroCuenta + ". Tu saldo actual es de $" +  saldo);
	}
	
	@Override 
	//Método para retirar dinero
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            super.retirar(cantidad);
            System.out.println("Se retiraron " + cantidad + " pesos de la Cuenta Corriente de " + titular + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente. No se pudo realizar el retiro.");
        }
	}
	
	   @Override
	   //Método para transferir dinero desde cuenta corriente
	    public void transferir(CuentaBancaria cuentaDestino, double cantidad) {
	        if (saldo >= cantidad) {
	            saldo = (saldo - cantidad);
	            cuentaDestino.depositar(cantidad);
	            System.out.println("Saldo actual de tu Cuenta Corriente: " + saldo + " pesos.");
	        } else {
	            System.out.println("Saldo insuficiente. No se pudo realizar la transferencia.");
	        }
	}
	   
	   
}
