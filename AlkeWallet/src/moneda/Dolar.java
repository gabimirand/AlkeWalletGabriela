package moneda;

public class Dolar implements Moneda {


	@Override
	public String getSimbolo() {
		return "USD";
	}

	@Override
	public double getFactorConversion() {
		// Conversión real durante la 2da semana de Mayo:  929 pesos = 1 dolares
		return 929;
	}

	@Override
	//Método sobrescrito para convertir pesos chilenos a Dólares
	public void convertirPesoCL(double cantidad) {
	    double cantidadConvertida = cantidad / getFactorConversion();
	    System.out.println("Cantidad convertida: CLP" + cantidad + " en dólares: " + getSimbolo() + cantidadConvertida);
	}
	
	@Override
    //Método sobreescrito para convertir Dolar a Peso chileno    
	public void convertirMonedaExtranjera(double cantidad) {
	    double cantidadConvertida = cantidad * getFactorConversion();
	    System.out.println("Cantidad convertida: " + getSimbolo() + cantidad + " en pesos chileno: CLP"  + cantidadConvertida);
	}

}
