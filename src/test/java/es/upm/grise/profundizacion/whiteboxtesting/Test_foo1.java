package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;






public class Test_foo1 {
	
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
	public void values_1_1_return1() {
		assertEquals(1.0f, Exercises.foo1(1.0f,1.0f),0.0f);
	
	}
	
	@Test
	public void values_16_2_return8() {
	   assertEquals(0.125f, Exercises.foo1(6.0f, 2.0f),0.0f);	
	
	}

}
