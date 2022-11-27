package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Test_foo1 {
	
	/*
	 * Tengo implementado pom para JUnit5 pero en caso de no funciona test es necesario cambiar la configuración a JUnit4.
	 */
	
	
	/*
	 * Haciendo la prueba de caja blanca con el grafo y calculando la complejidad ciclomatica se ha obtenido 2 caminos independientes.
	 * Existen 2 regiones, 1 Nodos predicados, 4 aristas y 4 nodos. Existen 3 formas diferentes para calcular los caminos independientes.
	 * 1. Obteniendo directamente con numero de regiones, por lo tanto, 2 caminos independientes.
	 * 2. Obteniendo con numeros de nodos predicados sumando 1, 1 + 1 = 2, tambien son 2.
	 * 3. Obteniendo con número de aristas y nodos. 4 aristas - 4 nodos + 2 = 2, el resultado son 2.
	 * A continuacion se mostraran los 6 caminos:
	 * 1. 6-7-8-9
	 * 2. 6-8-9
	 */

	/*
	 * El primer camino llega a 100%, es decir, que pasa por todo las lineas de codigos del método. Y es un camino posible.
	 */
	@Test
	public void testFoot1_1() {
		assertTrue(new Exercises().foo1(6, 64) == 4.0f);
	}
	
	/*
	 * El segundo camino llega a 71,4%, es decir, que pasa por todo las lineas de codigos del método. Y es un camino posible.
	 */
	@Test
	public void testFoot1_2() {
		assertTrue(4.0 == new Exercises().foo1(2, 4));
	}

}
