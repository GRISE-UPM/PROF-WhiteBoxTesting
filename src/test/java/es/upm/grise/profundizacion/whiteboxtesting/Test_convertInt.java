package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {
	Exercises e;
	Exercises.convertInt c;


	/*
	 * En este caso existe dos excepción, por lo tanto, ya tiene dos caminos. Y en este método existen 6 caminos independientes.
	 */
	
	/*
	 * 1. 39-40-41
	 * Siendo la linea 39 el inicio del método, cuando la entrada es mayor que 5, lanza el excepción
	 */
	
	@Test
	public void testConvertInt_1() throws Exception {
		e = new Exercises();
		c = e.new convertInt();
		char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		assertThrows(Exception.class, () -> {c.convert(a);});
	}
	
	/*
	 * 2. 39-40-(42-43)-45-49-51-53
	 * En teoría es un camino posible, pero no puedo conseguir implementar un test para comprobar.
	 */
	
	/*
	 * 3. 39-40-(42-43)-44-45-49-51-53
	 * Este camino es un camino imposible, debido a que al entrar el if de la linea 43, tiene que entrar si o si el if de linea 49
	 */
	
	/*
	 * 4. 39-40-(42-43)-45-(46-47)-45-49-51-53
	 */
	
	@Test
	public void testConvertInt_4() throws Exception {
		e = new Exercises();
		c = e.new convertInt();
		char[] a = {'a', 'b'};
		assertEquals(540, c.convert(a));
	}
	
	/*
	 * 5. 39-40-(42-43)-45-49-50-51-53
	 * Igual que el camino 3, debido a que no entrar el if de la linea 43, no es posible entrar el if de linea 49. Porque tiene la misma condición para entrar.
	 */
	
	/*
	 * 6. 39-40-(42-43)-45-49-51-52
	 * Tambien es una camino imposible, debido a que con una sola caracter no puedo llegar o superar el condición de la linea 51
	 */
}
