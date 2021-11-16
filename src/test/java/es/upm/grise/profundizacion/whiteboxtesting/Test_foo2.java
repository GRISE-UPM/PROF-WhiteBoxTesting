package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class Test_foo2 {
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Executed before any test has been run");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Executed before each test");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Executed after each test");
	}

	@Test
	public void values_1_1_returns2() {
		assertEquals(2.0f,Exercises.foo2(1.0f,1.0f),0.0f);
	}
	
	@DisplayName("The function always returns a 2")
	@Test
	public void values_10_minus10_returns2() {
		assertEquals(2.0f,Exercises.foo2(10.0f,-10.0f),0.0f);
	}
	
	@Test
	public void values_100_10_returns2() {
		assertEquals(2.0f,Exercises.foo2(100.0f,10.0f),0.0f);
	}
	
	@Test
	public void values_10_100_returns2() {
		assertEquals(2.0f,Exercises.foo2(10.0f,100.0f),0.0f);
	}
	@Test
	public void values_100_100_returns2() {
		assertEquals(2.0f,Exercises.foo2(100.0f,100.0f),0.0f);
	}


}
