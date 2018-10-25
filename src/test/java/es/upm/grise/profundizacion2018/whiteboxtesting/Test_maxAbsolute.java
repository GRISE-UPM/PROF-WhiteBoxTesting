package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {
        private Exercises exToTest = new Exercises();
        private int[] intArray;
        /**
         * 
         */
	@Test
	public void test_1() {
		//fail("Not yet implemented");
                intArray = new int[] {1,2,3,4,5,6};
                assertEquals(exToTest.max_absolute(intArray),-1);
	}
        /**
         * 
         */
	@Test
	public void test_2() {
		//fail("Not yet implemented");
                intArray = new int[] {};
                assertEquals(exToTest.max_absolute(intArray),0);
	}
        /**
         * 
         */
	@Test
	public void test_3() {
		//fail("Not yet implemented");
                intArray = new int[] {1,2,3,4,5};
                assertEquals(exToTest.max_absolute(intArray),5);
	}
        /**
         * 
         */
	@Test
	public void test_4() {
		//fail("Not yet implemented");
                intArray = new int[] {-1,-2,-3,4,-5};
                assertEquals(exToTest.max_absolute(intArray),5);
	}
        
        

}
