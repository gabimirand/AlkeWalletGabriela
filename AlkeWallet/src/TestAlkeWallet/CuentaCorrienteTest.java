package TestAlkeWallet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cuentas.CuentaCorriente;
import cuentas.CuentaVista;

class CuentaCorrienteTest {
	
	CuentaCorriente cuentaCorriente;
	CuentaVista cuentaVista; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
        System.out.println("Inicializando recursos para todos los tests.");
	}


	@BeforeEach
	//Se inicializa el método para dar valor a las pruebas
	void setUp() {
		cuentaCorriente = new CuentaCorriente("Gabriela", 182838, 80500);
        System.out.println("Iniciando un test.");
	}

	
	@Test
	//Test para probar el método depositar en CuentaCorriente
	void testDepositar() {
		double cantidadDeposito = 500;
        double saldoEsperado = 81000;
        cuentaCorriente.depositar(cantidadDeposito);
        assertEquals(saldoEsperado, cuentaCorriente.getSaldo());
    }
	

	@Test
	//Test para probar el método retirar en CuentaCorriente
	void testRetirar() {
		double cantidadGiro = 500;
        double saldoEsperado = 80000;
        cuentaCorriente.retirar(cantidadGiro);
        assertEquals(saldoEsperado, cuentaCorriente.getSaldo());
	}

	
	@Test
	//Test para probar el método transferir en CuentaCorriente
	void testTransferir() {
		cuentaVista = new CuentaVista("Gabriela", 182838, 1000);
		double cantidadTransferencia = 1000;
        cuentaCorriente.transferir(cuentaVista, cantidadTransferencia);
        assertEquals(79500, cuentaCorriente.getSaldo());
        assertEquals(2000, cuentaVista.getSaldo());
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
