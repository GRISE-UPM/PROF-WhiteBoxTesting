package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_foo2 {
	
	private Exercises ex = new Exercises();
	
	@BeforeAll
	static public void beforeAll()
	{
		System.out.println("Comienza el test Foo2");
	}
	
	@AfterAll
	static public void afterAll()
	{
		System.out.println("El test ha terminado Foo2");
	}

	@Test
	public void test_1() 
	{
		 assertEquals(2, ex.foo2(4, 2)); // Rama 1, a > b;  cos(a) < 0;
	}
	
	@Test
	public void test_2() 
	{
		 assertEquals(2, ex.foo2(100, 270)); // Rama 2,  a < b;  cos(b) > 0;
	}

	@Test
	public void test_3() 
	{
		 assertEquals(2, ex.foo2(180, 180)); // Rama 3, a == b;  cos(a) < 0;
	}

	@Test
	public void test_4() 
	{
		 assertEquals(90, ex.foo2(0, 180)); // Rama 4, a < b;  cos(a) > 0; cos(b) < 0
	}
}
