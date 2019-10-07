package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises exercises = new Exercises();
	
	//Ejecuta la rama: (numbers.length)
	@Test
	public void test_branch1() {
		int[] nums = {1,2,3,4,5,6};
		
		assertEquals(-1, exercises.maxAbsolute(nums));
	}

	//Entra al for, y solo ejecuta la rama "else"
	@Test
	public void test_branch2() {
		int[] nums = {1,2,3,4,5};
		
		assertEquals(5, exercises.maxAbsolute(nums));
	}
	
	//Entra al for y solo ejecuta la rama (numbers[i]>0)
	@Test
	public void test_branch3() {
		int[] nums = {-1,-2,-3,-4,-5};
		
		assertEquals(5, exercises.maxAbsolute(nums));
	}
	
	//En teoria, con los 3 test de arriba, me aparece que ya da
	//el 100% de coverage. 
	
	//Entra al for y ejecuta las ramas (numbers[i]>0) y else
	@Test
	public void test_branch4() {
		int[] nums = {1,-2,3,-4,5};
		
		assertEquals(5, exercises.maxAbsolute(nums));
	}
}
