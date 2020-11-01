package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_foo1 {
	
	private Exercises ex = new Exercises();
	
	@BeforeAll
	static public void beforeAll()
	{
		System.out.println("Comienza el test Foo1");
	}
	
	@AfterAll
	static public void afterAll()
	{
		System.out.println("El test ha terminado Foo1");
	}

	@Test
	public void test_1() 
	{
		 assertEquals(1, ex.foo1(6, 16)); // Rama 1, entra en el if
	}
	
	@Test
	public void test_2() 
	{
		 assertEquals(2, ex.foo1(5, 10)); // Rama 2, no entra en el if
	}

}
