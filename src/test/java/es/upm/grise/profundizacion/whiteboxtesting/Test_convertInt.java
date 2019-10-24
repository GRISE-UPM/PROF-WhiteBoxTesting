package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-
//diente

public class Test_convertInt {

	private Exercises exercise = new Exercises();
	private Exercises.convertInt convertInt = exercise.new convertInt();

	/**
	 * Primera condicion verdadera.
	 * 
	 * @throws Exception
	 */
	@Test(expected = Exception.class)
	public void test1() throws Exception {
		convertInt.convert((new char[] { 'a', 'b', 'c', 'd', 'e', 'f', '7' }));
	}

	/**
	 * Primera condicion falsa.
	 * 
	 * Segunda condicion verdadera.
	 * 
	 * Tercera condicion entrada bucle verdadera. (eventualmente falsa).
	 * 
	 * Cuarta condicion verdadera.
	 * 
	 * Quinta condicion falsa.
	 * 
	 * Sexta condicion verdadera.
	 */
	@Test(expected = Exception.class)
	public void test2() throws Exception {
		convertInt.convert((new char[] { '-', '\4', '\3', '\4', '\5', '\6' }));
	}

	/**
	 * Primera condicion falsa.
	 * 
	 * Segunda condicion falsa.
	 * 
	 * Tercera condicion entrada bucle verdadera. (eventualmente falsa).
	 * 
	 * Cuarta condicion falsa.
	 * 
	 * Quinta condicion verdadera.
	 */
	@Test(expected = Exception.class)
	public void test3() throws Exception {
		convertInt.convert((new char[] { '\1', '\2', '\3', '\4', '\5', '\6' }));
	}

	/**
	 * Primera condicion falsa.
	 * 
	 * Segunda condicion falsa.
	 * 
	 * Tercera condicion entrada bucle verdadera. (eventualmente falsa).
	 * 
	 * Cuarta condicion falsa.
	 * 
	 * Quinta condicion falsa.
	 * 
	 * Sexta condicion falsa.
	 */
	@Test
	public void test4() throws Exception {
		assertEquals(1234, convertInt.convert((new char[] { '\1', '\2', '\3', '\4' })), 0);
	}

	/**
	 * Primera condicion falsa.
	 * 
	 * Segunda condicion verdadera.
	 * 
	 * Tercera condicion entrada bucle verdadera. (eventualmente falsa).
	 * 
	 * Cuarta condicion verdadera.
	 * 
	 * Quinta condicion falsa.
	 * 
	 * Sexta condicion falsa.
	 */
	@Test
	public void test5() throws Exception {
		assertEquals(-1234, convertInt.convert((new char[] { '-', '\1', '\2', '\3', '\4' })), 0);
	}

}
