package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {
	
	/*
	 * Haciendo la prueba de caja blanca con el grafo y calculando la complejidad ciclomatica se ha obtenido 3 caminos independientes.
	 * Existen 3 regiones, 2 Nodos predicados, 11 aristas y 10 nodos. Existen 3 formas diferentes para calcular los caminos independientes.
	 * 1. Obteniendo directamente con numero de regiones, por lo tanto, 3 caminos independientes.
	 * 2. Obteniendo con numeros de nodos predicados sumando 1, 3 + 1 = 4, es 4 porque incluyendo un return más.
	 * 3. Obteniendo con número de aristas y nodos. 11 aristas - 10nodos + 2 = 3, el resultado son 3.
	 * Pero como existe dos return entonces es necesario añadir otro camino.
	 * A continuacion se mostraran los 4 caminos:
	 * 1. 26-27-28
	 * 2. 26-27-29-30-35
	 * 3. 26-27-29-30-31-32-34-31-35
	 * 4. 26-27-29-30-31-33-34-31-35
	 */

	/*
	 * 1. 26-27-28
	 * Para el primer camino, cuando la longitud del array es mayor que 5, entonces se hace el return que esta en la linea 28.
	 */
	
	@Test
	public void testMaxAbsolute_1() {
		int[] a = {3, 4, 5, 6, 7, 8};
		assertEquals(-1, new Exercises().maxAbsolute(a));
	}
	
	/*
	 * 2. 26-27-29-30-35
	 * Para el segundo camino, cuando la entrada es vacio, es decir, no contiene ningún valor, entonces no entra al for y pasa a la linea 35.
	 */

	@Test
	public void testMaxAbsolute_2() {
		int[] a = {};
		assertEquals(0, new Exercises().maxAbsolute(a));
	}
	
	/*
	 * 3. 26-27-29-30-31-32-34-31-35
	 * Para el tercer camino, con la entrada de variable negativo, por lo tanto, ejecuta una vez el for y como es negativo entra al if.
	 */
	
	@Test
	public void testMaxAbsolute_3() {
		int[] a = {-12};
		assertEquals(12, new Exercises().maxAbsolute(a));
	}
	
	/*
	 * 4. 26-27-29-30-31-33-34-31-35
	 * Para el cuarto camino, es lo mismo que el tercer camino, pero en este caso con valores positivos, por lo tanto, entra el else de la linea 33.
	 */
	
	@Test
	public void testMaxAbsolute_4() {
		int[] a = {12};
		assertEquals(12, new Exercises().maxAbsolute(a));
	}

}
