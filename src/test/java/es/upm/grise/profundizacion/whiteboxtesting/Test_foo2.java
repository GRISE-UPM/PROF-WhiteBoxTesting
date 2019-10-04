package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	//explicado rapido de cuantos caminos hay (lo he dibujado tambien y
	//hecho la cuenta como en clase:
	//hay 2 branches en el primero y 4 en el segundo if, por tanto, 
	//
	
	//primer camino, todo es falso
	@Test
	public void test1() {
		Exercises ejercicio = new Exercises();
		float a=(float) 1.5;
		float b=(float) 3.1;
		
		assertEquals(2.3, ejercicio.foo2(a, b),0.001);	
	}
	
	//segundo camino, el primer if falso y el segundo es falsa 
	//la primera parte
	@Test
	public void test2() {
		Exercises ejercicio = new Exercises();
		float a=(float) 1.4;
		float b=(float) 1.5;
		
		assertEquals(2, ejercicio.foo2(a, b),0.001);	
	}
	
	//tercer camino, todo es true ahora (menos la ultima condicion del ultimo if)
	@Test
	public void test3() {
		Exercises ejercicio = new Exercises();
		float a=(float) 3.14;
		float b=(float) 3.13;
		
		assertEquals(2, ejercicio.foo2(a, b),0.001);	
	}
	
	//me salen solo 3 caminos, no lo entiendo. Pensaba que me saldrian mas, pero
	//si hago mas repito branches y mis calculos dan que hay solo 
	//3 caminos sin repetir
	//con estos 3 caminos tengo toda la cobertura asi que ya esta

	


	


}
