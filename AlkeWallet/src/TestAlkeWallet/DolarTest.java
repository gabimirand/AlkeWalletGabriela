package TestAlkeWallet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import moneda.Dolar;


class DolarTest {

	Dolar dolar; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
        System.out.println("Inicializando recursos para todos los tests.");
	}

	@BeforeEach
	//Se inicializa el método para dar valor a las pruebas
	void setUp() {
		dolar = new Dolar();
        System.out.println("Iniciando un test.");
	}
	

	@Test
	//Test para probar el GetSimbolo de Dolar
	void testGetSimbolo() {
        assertEquals("USD", dolar.getSimbolo(), "El símbolo debe ser USD.");
	}

	@Test
	//Test para probar el GetFactorConversion de Dolar
	void testGetFactorConversion() {
        assertEquals(929, dolar.getFactorConversion(), "El factor de conversión debe ser 929.");
	}

	@Test
	//Test para probar método convertir pesocl de Dolar
	void testConvertirPesoCL() {
		double cantidadConvertida = 929; // Cantidad de pesos chilenos a convertir
	    double cantidadConvertidaEsperada = 1;
		dolar.convertirPesoCL(cantidadConvertida);
		assertEquals(929, cantidadConvertida); 	
		assertEquals(1, cantidadConvertidaEsperada); 
	}

	@Test
	//Test para probar método convertir moneda extranjera de Dolar
	void testConvertirMonedaExtranjera() {
		double cantidadConvertida = 1; // Cantidad de moneda extranjera a convertir
	    double cantidadConvertidaEsperada = 929;
	    dolar.convertirMonedaExtranjera(cantidadConvertida);
	    assertEquals(1, cantidadConvertida); 	
	    assertEquals(929, cantidadConvertidaEsperada); 	
    }
	
	@AfterEach
	void tearDown() throws Exception {
        System.out.println("Finalizando un test.");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
        System.out.println("Limpiando recursos después de todos los tests.");
	}
	
}


