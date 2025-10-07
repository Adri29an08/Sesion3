package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import paquete.Cuenta;

class CuentaTest {
	
	private static Cuenta cuenta;
	private static Cuenta c12345;
	private static Cuenta c67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(0, "00000");
		c12345 = new Cuenta(50, "12345");
		c67890 = new Cuenta(0, "67890");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*@Test
	void testIngresar() {
		cuenta.Ingresar(500.0);
		assertEquals(500, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.Retirar(500.0);
		assertEquals(-500, cuenta.getSaldo());
	}*/
	
	@Test
	void test0014() {
		c12345.Retirar(200);
		c67890.Retirar(350);
		c12345.Ingresar(100);
		c67890.Retirar(200);
		c67890.Retirar(150);
		c12345.Ingresar(200);
		c67890.Ingresar(50);
		c67890.Retirar(100);
		
		assertEquals(-250, c12345.getSaldo());
		assertEquals(-450, c67890.getSaldo());
	}
	
	
}
