package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
        private Exercises exToTest = new Exercises();
        /**
         * Test para comprobar si obtenemos 75 siendo a<b y 
         *  no cumpliendose (Math.cos(a) < 0 ||(Math.cos(b) > 0)
         */
	@Test
	public void test_1() {
		//fail("Not yet implemented");
                assertEquals(exToTest.foo2(70, 80),75,0);
	}
        /**
         * Test para comprobar si obtenemos 2 siendo a<b y 
         *  cumpliendose cumplen (Math.cos(a) < 0) y no 
         * (Math.cos(b) > 0)
         */
	@Test
	public void test_2() {
		//fail("Not yet implemented");
                assertEquals(exToTest.foo2(80, 170),2,0);
	}
        /**
         * Test para comprobar si obtenemos 2 siendo a<b,
         *  no cumpliendose (Math.cos(a) < 0 ) y si 
         * (Math.cos(b) > 0)
         */
	@Test
	public void test_3() {
		//fail("Not yet implemented");
               assertEquals(exToTest.foo2(70, 100),2,0);
	}
        
        /**
         * Test para comprobar si obtenemos 75 siendo a>b y 
         *  no cumpliendose (Math.cos(a) < 0 ||(Math.cos(b) > 0)
         */
	@Test
	public void test_4() {
		//fail("Not yet implemented");
                assertEquals(exToTest.foo2(80, 70),75,0);
	}
        /**
         * Test para comprobar si obtenemos 2 siendo a>b y 
         *  cumpliendose cumplen (Math.cos(a) < 0) y no 
         * (Math.cos(b) > 0)
         */
	@Test
	public void test_5() {
		//fail("Not yet implemented");
                assertEquals(exToTest.foo2(170, 80),2,0);
	}
        /**
         * Test para comprobar si obtenemos 2 siendo a>b,
         * no cumpliendose (Math.cos(a) < 0 ) y si 
         * (Math.cos(b) > 0)
         */
	@Test
	public void test_6() {
		//fail("Not yet implemented");
               assertEquals(exToTest.foo2(100, 70),2,0);
	}

        

}
