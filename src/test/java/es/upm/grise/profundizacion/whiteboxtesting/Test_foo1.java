package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.Test;



public class Test_foo1 {
	Exercises prueba =new Exercises();
	
	//En el caso de ser x mayor que 5 y pasar por el if
	@Test
	public void test() {
		assertEquals(2.0f, prueba.foo1(8.0f, 36.0f),0);
	}
	
	//En el caso de ser x menor que 5 y no pasar por el if
	@Test
	public void test1() {
		assertEquals(3.0f, prueba.foo1(2.0f, 6.0f),0);
	}

}
