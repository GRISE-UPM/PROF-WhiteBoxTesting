package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {
	/* Se dan dos casos que engloban las variaciones del programa: una rama
	 * en la que x > 5 y otra en la que sea <=5. Por lo tanto, hacemos dos tests distintos.
	 */

	@Test
	public void testXgt5() {
		
		Exercises ex = new Exercises();
		float x = 6;
		float y = 16;
		assertEquals(1, ex.foo1(x,y), 0.0f);
	}
	
	@Test
	public void testXle5() {

		Exercises ex = new Exercises();
		float x = 5;
		float y = 10;
		assertEquals(2, ex.foo1(x, y), 0.0f);
	}

}
