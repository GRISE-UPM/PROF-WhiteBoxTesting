package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	
	private Exercises ex = new Exercises();
	private convertInt obj = ex.new convertInt();

	@BeforeAll
	static public void beforeAll()
	{
		System.out.println("Comienza el test convertInt");
	}
	
	@AfterAll
	static public void afterAll()
	{
		System.out.println("El test ha terminado convertInt");
	}

	@Test
	public void test_1() {
		char [] str = {'0', '1', '2', '3', '4', '5', '6'};
		
		assertThrows(Exception.class, () -> obj.convert(str)); // Rama 1: str > 6 -> Exception
	}
	
	@Test
	public void test_2() throws Exception {
		char [] str = {'-', '1', '2', '3'};
		
		assertEquals(-123, obj.convert(str)); // Rama 2: str[0]=='-'
	}
	
	@Test
	public void test_3() throws Exception {
		char [] str = {'1', '2', '3', '4'};
		
		assertEquals(1234, obj.convert(str)); // Rama 3: str[0] != '-'
	}

	@Test
	public void test_4() throws Exception {
		char [] str = {'3', '2', '7', '6', '8'};
		
		assertThrows(Exception.class, () -> obj.convert(str)); // Rama 4: number > 32767
	}
	
	@Test
	public void test_5() throws Exception {
		char [] str = {'-', '3', '2', '7', '6', '9'};
		
		assertThrows(Exception.class, () -> obj.convert(str)); // Rama 5: number < -32768
	}
}
