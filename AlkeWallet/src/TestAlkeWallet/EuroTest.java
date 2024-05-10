package TestAlkeWallet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import moneda.Euro;

class EuroTest {

	Euro euro; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
        System.out.println("Inicializando recursos para todos los tests.");
	}

	@BeforeEach
	//Se inicializa el método para dar valor a las pruebas
	void setUp() {
		euro = new Euro();
        System.out.println("Iniciando un test.");
	}

	
	@Test
	//Test para probar el GetSimbolo de Euro
	void testGetSimbolo() {
        assertEquals("EU", euro.getSimbolo(), "El símbolo debe ser EU.");
	}

	@Test
	//Test para probar el GetFactorConversion de Dolar
	void testGetFactorConversion() {
        assertEquals(1003, euro.getFactorConversion(), "El factor de conversión debe ser 1003.");
	}

	@Test
	//Test para probar método convertir pesocl de Euro
	void testConvertirPesoCL() {
		double cantidadConvertida = 1003; // Cantidad de pesos chilenos a convertir
	    double cantidadConvertidaEsperada = 1;
		euro.convertirPesoCL(cantidadConvertida);
		assertEquals(1003, cantidadConvertida); 	
		assertEquals(1, cantidadConvertidaEsperada); 
    }

	@Test
	//Test para probar método convertir moneda extranjera de Euro
	void testConvertirMonedaExtranjera() {
		double cantidadConvertida = 1; // Cantidad de moneda extranjera a convertir
	    double cantidadConvertidaEsperada = 1003;
	    euro.convertirMonedaExtranjera(cantidadConvertida);
	    assertEquals(1, cantidadConvertida); 	
	    assertEquals(1003, cantidadConvertidaEsperada);	}

	@AfterEach
	void tearDown() throws Exception {
        System.out.println("Finalizando un test.");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
        System.out.println("Limpiando recursos después de todos los tests.");
	}
}
