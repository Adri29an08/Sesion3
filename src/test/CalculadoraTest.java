package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(2,3));
	}
	
	@Test
	void testResta() {
		assertEquals(1, Calculadora.suma(3,2));
	}
	
	@Test
	void testMult() {
		assertEquals(6, Calculadora.suma(2,3));
	}
	
	@Test
	void testDiv() {
		assertEquals(2, Calculadora.suma(4,2));
	}

}
