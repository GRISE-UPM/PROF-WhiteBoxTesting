package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
public class Test_foo1 {
	float x;
	float y;
	Exercises f= new Exercises();
	@BeforeEach
	 public void init (){
		float y=5;
	}
	@Test
	public void testXMayorQue5() {
		x=6;
		assertEquals(y/(x+10),f.foo1(x, y),0);

	}

	@Test
	public void testXMenorQue5() {
		x=3;
		assertEquals(y/x,f.foo1(x,y), 0);

	}

	/*
	@Test
	public void testXIgual0() throws Exception{
		x=0;
		Assertions.assertThrows(Exception.class, () -> {
		f.foo1(x,y); });

	}*/
}
