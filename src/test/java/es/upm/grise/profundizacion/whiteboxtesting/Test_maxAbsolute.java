package es.upm.grise.profundizacion.whiteboxtesting;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class Test_maxAbsolute {

	private Exercises ex = new Exercises();

	@BeforeEach
	public void beforeEach() {
		System.out.println("Nuevo test_maxAbsolute:");
	}

	@Test
	@DisplayName("numbers superior a 5 valores")
	public void maxAbsolute_numbersSizeLimit(){
		int[] numbers = new int[]{4,5,2,8,6,8};
		assertEquals(-1, ex.maxAbsolute(numbers), 0);
	}

	@Test
	@DisplayName("max_value positivo")
	public void maxAbsolute_maxValuePositive(){
		int[] numbers = new int[]{4,5,2,40};
		assertEquals(40, ex.maxAbsolute(numbers), 0);
	}

	@Test
	@DisplayName("max_value negativo")
	public void maxAbsolute_maxValueNegative(){
		int[] numbers = new int[]{4,5,2,-40};
		assertEquals(40, ex.maxAbsolute(numbers), 0);
	}

	@Test
	@DisplayName("todos negativos")
	public void maxAbsolute_allNegatives(){
		int[] numbers = new int[]{-4,-5,-2,-40};
		assertEquals(40, ex.maxAbsolute(numbers), 0);
	}

}
