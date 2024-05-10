package moneda;

public class Euro implements Moneda {

	@Override
	public String getSimbolo() {
		return "EU";
	}

	@Override
	public double getFactorConversion() {
		// Conversión real durante la 2da semana de Mayo:  1003 pesos chilenos = 1 Euros 
		return 1003;
	}

	@Override
	//Método sobreescrito para convertir pesos chilenos a Euros
	public void convertirPesoCL(double cantidad) {
	    double cantidadConvertida = cantidad / getFactorConversion();
	    System.out.println("Cantidad convertida: CLP" + cantidad + " en euros: " + getSimbolo() + cantidadConvertida);
	}
	
	@Override   
    //Método sobreescrito para convertir Euro a Peso chileno    
	public void convertirMonedaExtranjera(double cantidad) {
	    double cantidadConvertida = cantidad * getFactorConversion();
	    System.out.println("Cantidad convertida: " + getSimbolo() + cantidad + " en pesos chileno: CLP"  + cantidadConvertida);
	}
}
