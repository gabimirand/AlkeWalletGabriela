package TestAlkeWallet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cuentas.CuentaCorriente;
import cuentas.CuentaVista;

class CuentaVistaTest {

	CuentaCorriente cuentaCorriente;
	CuentaVista cuentaVista; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
        System.out.println("Inicializando recursos para todos los tests.");
	}

	
	@BeforeEach
	//Se inicializa el método para dar valor a las pruebas
	void setUp() {
		cuentaVista = new CuentaVista("Gabriela", 19772, 15000);
        System.out.println("Iniciando un test.");
	}

	@Test
	//Test para probar el método depositar en CuentaVista
	void testDepositar() {
		double cantidadDeposito = 5000;
        double saldoEsperado = 20000;
        cuentaVista.depositar(cantidadDeposito);
        assertEquals(saldoEsperado, cuentaVista.getSaldo());
	}

	@Test
	//Test para probar el método depositar en CuentaVista
	void testRetirar() {
		double cantidadGiro = 1000;
        double saldoEsperado = 14000;
        cuentaVista.retirar(cantidadGiro);
        assertEquals(saldoEsperado, cuentaVista.getSaldo());
    }

	@Test
	//Test para probar el método depositar en CuentaVista
	void testTransferir() {
		cuentaCorriente = new CuentaCorriente("Gabriela", 12918, 5000);
		double cantidadTransferencia = 1000;
        cuentaVista.transferir(cuentaCorriente, cantidadTransferencia);
        assertEquals(14000, cuentaVista.getSaldo());
        assertEquals(6000, cuentaCorriente.getSaldo());
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
