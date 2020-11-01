package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_maxAbsolute {
	
	private Exercises ex = new Exercises();

	@BeforeAll
	static public void beforeAll()
	{
		System.out.println("Comienza el test maxAbsolute");
	}
	
	@AfterAll
	static public void afterAll()
	{
		System.out.println("El test ha terminado maxAbsolute");
	}

	@Test
	public void test_1() 
	{
		int [] numbers = {1, 2, 3, 4, 5, 6};
		assertEquals(-1, ex.maxAbsolute(numbers)); // Rama 1, numbers.length > 5
	}
	
	@Test
	public void test_2() 
	{
		int [] numbers = {1, -5, 3, -1};
		assertEquals(5, ex.maxAbsolute(numbers)); // Rama 2, numbers.length < 5; numbers[1] < 0
	}

	@Test
	public void test_3() 
	{
		int [] numbers = {1, 2, 3};
		assertEquals(3, ex.maxAbsolute(numbers)); // Rama 3,  numbers.length < 5; numbers[i] > 0
	}

}
