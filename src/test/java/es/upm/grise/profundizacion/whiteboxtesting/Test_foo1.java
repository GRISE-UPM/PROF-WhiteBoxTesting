package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_foo1 {
	Exercises exercises=new Exercises();
	
	//Caso 1 en el que x<5.
	@Test
	public void test_foo1_caso1() {
		float x=3.0f;
		float y=6.0f;
		float result=2.0f;
		assertEquals(result, this.exercises.foo1(x, y));
	}
	//Caso 2 en el que x>5.
	@Test
	public void test_fool_caso2() {
		float x=6.0f;
		float y=32.0f;
		float result=2.0f;
		assertEquals(result, exercises.foo1(x, y));
	}

}
