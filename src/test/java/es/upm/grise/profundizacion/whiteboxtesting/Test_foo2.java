package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	/* Se dan 4 ramas distintas:
	 * - a > b, sin entrar al segundo if
	 * - a > b, entrando al segundo if
	 * - a <=b, sin entrar al segundo if
	 * - a <=b, entrando al segundo if
	 */

	@Test
	public void testagtbsinif() {
		Exercises ex = new Exercises();
		float a = 90;
		float b = -90;
		
		/*
		float tmp = b; // tmp = -90;		 
		b = a;         // b = 90 --> cos(90) = 0 --> no es >0
		a = tmp;       // a = -90 --> cos(-90) = 0 --> no es <0		
		
		*/
		
		assertEquals(0, ex.foo2(a, b), 0.0f);
		
	}
	
	@Test
	public void testagtbconif() {
		Exercises ex = new Exercises();
		float a = 0;
		float b = -180;
		
		/*
		float tmp = b; // tmp = -180;		 
		b = a;         // b = 0 --> cos(0) = 1 --> SI es >0
		a = tmp;       // a = -180 --> cos(-180) = -1 --> no es >0		
		
		*/
		
		assertEquals(2, ex.foo2(a, b), 0.0f);
		
	}
	
	@Test
	public void testalebsinif() {
		Exercises ex = new Exercises();
		float a = 90;
		float b = 180;
		
		assertEquals(135, ex.foo2(a, b), 0.0f);
	}
	
	@Test
	public void testalebconif() {
		Exercises ex = new Exercises();
		float a = 135;
		float b = 135;
		
		assertEquals(2, ex.foo2(a, b), 0.0f);
	}

}
