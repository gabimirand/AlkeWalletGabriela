package moneda;

//Interface que se implementará a las clases Dólar y Euro.
public interface Moneda {
	
	//Atributos
    String getSimbolo();
    double getFactorConversion();
    
    //Método para convertir Peso chileno a otra moneda    
    void convertirPesoCL(double cantidad); 
    
    //Método para convertir otra moneda a Peso chileno    
    void convertirMonedaExtranjera(double cantidad); 
}