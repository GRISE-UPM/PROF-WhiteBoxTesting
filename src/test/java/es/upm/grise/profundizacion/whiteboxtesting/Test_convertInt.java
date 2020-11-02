package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test convertInt")
public class Test_convertInt {

	Exercises ex = new Exercises();
	Exercises.convertInt cInt = ex.new convertInt();
	
	@DisplayName("Test 1 - convertInt")
	@Test
	public void test1() throws Exception {
		char [] str = {'1','2','3'};
		int res = cInt.convert(str);
		
		assertEquals(res,123);
	}
	
	@DisplayName("Test 2 - convertInt")
	@Test
	public void test2() throws Exception {
		char [] str = {'1','2','3','4','5','6','7'};
		
		assertThrows(Exception.class, () -> {
			cInt.convert(str);
		});
	}
	
	@DisplayName("Test 3 - convertInt")
	@Test
	public void test3() throws Exception {
		char [] str = {'-','1','2','3'};
		int res = cInt.convert(str);
		
		assertEquals(res,-123);
	}
	
	@DisplayName("Test 4 - convertInt")
	@Test
	public void test4() throws Exception {
		char [] str = {'3','2','8','0','0'};
		
		assertThrows(Exception.class, () -> {
			cInt.convert(str);
		});
	}
	
	@DisplayName("Test 5 - convertInt")
	@Test
	public void test5() throws Exception {
		char [] str = {'-','4','3','0','0','0'};
		
		assertThrows(Exception.class, () -> {
			cInt.convert(str);
		});
	}
}
