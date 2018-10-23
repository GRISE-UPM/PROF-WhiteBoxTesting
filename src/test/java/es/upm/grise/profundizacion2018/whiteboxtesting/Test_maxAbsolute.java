package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {


	// Testing all possible cases:

	// Case 1: number of elements > 5
	Exercises testerAbs1 = new Exercises();

	int[] test1 = {0,1,3,4,5,6};

	@Test
	public void test1() {
		assertEquals(-1, testerAbs1.max_absolute(test1));
	}


	//Case 2: number of elements < 5 with x < 0 && y >0
	Exercises testerAbs2 = new Exercises();
	int[] test2 = {-2,-1,0,1};

	@Test
	public void test2() {
		assertEquals(2, testerAbs2.max_absolute(test2));
	}

}
