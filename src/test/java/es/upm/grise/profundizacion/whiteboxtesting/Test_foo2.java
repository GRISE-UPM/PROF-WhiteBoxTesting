package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

// OSCAR: CC = 4. Te sobran muchos casos de prueba, en concreto 4 de ellos: 4, 6, 7 y 8

public class Test_foo2 {

	@Test
	public void test() {
		Exercises foo2Test = new Exercises();
		/*
		 * 1.a>b cos(a2)<0 || cos(b2)>0
		 * 
		 * 2.a>b cos(a2)>0 || cos(b2)>0
		 * 
		 * 3.a>b cos(a2)>0 || cos(b2)<0
		 * 
		 * 4.a>b cos(a2)<0 || cos(b2)<0 
		 * 
		 * 5.a<b cos(a)<0 || cos(b)>0
		 * 
		 * 6.a<b cos(a)>0 || cos(b)>0
		 * 
		 * 7.a<b cos(a)>0 || cos(b)<0
		 * 
		 * 8.a<b cos(a)<0 || cos(b)<0
		 * 
		 * 
		 * */
		float result1 = foo2Test.foo2(11.0f,-115.0f);
		TestCase.assertEquals(2.0f, result1);
		float result2 = foo2Test.foo2(12.0f, 11.0f);
		TestCase.assertEquals(2.0f, result2);
		float result3 = foo2Test.foo2(10.0f, -14.0f);
		TestCase.assertEquals(-2.0f, result3);
		float result4 = foo2Test.foo2(3.0f, 2.0f);
		//TestCase.assertEquals(2.0f, result4);
		float result5 = foo2Test.foo2(-15.0f, 14.0f);
		TestCase.assertEquals(2.0f, result5);
		float result6 = foo2Test.foo2(11, 12);
		//TestCase.assertEquals(2.0f, result6);
		float result7 = foo2Test.foo2(-11.0f, 115.0f);
		//TestCase.assertEquals(52.0f, result7);
		float result8 = foo2Test.foo2(2.0f, 3.0f);
		//TestCase.assertEquals(2.0f, result8);
		
		
		
		
		
		
	}
	

}
