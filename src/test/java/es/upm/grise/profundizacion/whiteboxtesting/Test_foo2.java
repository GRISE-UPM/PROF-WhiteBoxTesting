package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	
	/*
	 * Haciendo la prueba de caja blanca con el grafo y calculando la complejidad ciclomatica se ha obtenido 4 caminos independientes.
	 * Existen 4 regiones, 3 Nodos predicados, 9 aristas y 7 nodos. Existen 3 formas diferentes para calcular los caminos independientes.
	 * 1. Obteniendo directamente con numero de regiones, por lo tanto, 4 caminos independientes.
	 * 2. Obteniendo con numeros de nodos predicados sumando 1, 3 + 1 = 4, tambien son 4.
	 * 3. Obteniendo con número de aristas y nodos. 9 aristas - 7 nodos + 2 = 4, el resultado son 4.
	 * A continuacion se mostraran los 4 caminos:
	 * 1. 13-18-19A-19B-22
	 * 2. 13-(14-17)-18-19-19-22
	 * 3. 13-18-19-20-22
	 * 4. 13-18-19A-19B-20-22
	 */

	/*
	 * 1. 13-18-19A-19B-22
	 * El primer camino es un camino posible, porque cuando a = 50 y b = 60 no cumple la condición del primer if, por lo tanto, pasa a segundo if.
	 * En segundo if, haciendo coseno de los valores, da resultado a =  0.96 y b = -0.95, no cumple ninguna condición de segundo if.
	 * Como no cumple el segundo if, pasa a return y devolviendo el resultado (a + b) / 2 = 55.
	 */
	
	@Test
	public void testFoot2_1() {
		assertTrue(new Exercises().foo2(50, 60) == 55.0f);
	}
	
	/*
	 * 2. 13-(14-17)-18-19-19-22
	 * El segundo camino es un camino posible, cuando a = 60 y b = 50 cumple la condición del primer if, por lo tanto, se cambia los valores de a y b,
	 * es decir, llega a mismo resultado de primer camino.
	 */
	
	@Test
	public void testFoot2_2() {
		assertTrue(new Exercises().foo2(60, 50) == 55.0f);
	}
	
	/*
	 * 3. 13-18-19-20-22
	 * El tercer camino tambien es un camino posible, con la posible solución de a = 30 y b = 40, como a es menor que b, entonces no cumple el primer if.
	 * Y para el segundo if, cuando a = 30, el coseno de a es 0.15, que es mayor que 0 y cuando b = 40, el coseno es -0.66 por lo tanto, no cumple ninguna condición
	 * del segundo if.
	 */
	
	@Test
	public void testFoot2_3() {
		assertTrue(new Exercises().foo2(30, 40) == 35.0f);
	}
	
	/*
	 * 4. 13-18-19A-19B-20-22
	 * El camino que queda para probar es el cuarto camino, cuando a = 30 y b = 70, como a es menor que b, entonces no cumple el primer if.
	 * Y para el segundo if, cuando cuando a = 30, el coseno de a es 0.15, que es mayor que 0 y cuando b = 70, el coseno es 0.633, por lo tanto,
	 * cumple la segundo condición del segundo if, y en este caso, le asignamos el nuevo valor para a y b, y el resultado da (1 + 3) / 2 = 2.
	 */
	
	@Test
	public void testFoot2_4() {
		assertTrue(new Exercises().foo2(30, 70) == 2.0f);
	}



}
