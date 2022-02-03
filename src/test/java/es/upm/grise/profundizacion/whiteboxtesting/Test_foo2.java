package es.upm.grise.profundizacion.whiteboxtesting;


import static org.junit.Assert.*;
import org.junit.Test;

public class Test_foo2 {

	@Test
	public void cosamenorque0() {
		Exercises ex = new Exercises();
		float result = ex.foo2(4, 2);
		assertEquals(2.0f,result,0.0f);
	}
	@Test
	public void cosbmayorque0() {
		Exercises ex = new Exercises();
		float result = ex.foo2(4, 2);
		assertEquals(2.0f,result,0.0f);
	}
	@Test
	public void aigualqueb() {
		Exercises ex = new Exercises();
		float result = ex.foo2(1, 1);
		assertEquals(2.0f,result,0.0f);
	}
	@Test
	public void nocos() {
		Exercises ex = new Exercises();
		float result = ex.foo2(1, 4);
		assertEquals(2.5f,result,0.0f);
	}

}
