package es.upm.grise.profundizacion2018.whiteboxtesting;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {
        private Exercises exToTest = new Exercises();
        /**
         * Primer caso de prueba: no se cumple el if(x<5)
         */
	@Test
	public void test_1() {
		//fail("Not yet implemented");
            assertEquals(exToTest.foo1(1, 10),(float)10,0);
                
                
	}
        /**
         * Segundo caso de prueba: se cumple el if(x>5)
         */
        @Test
	public void test_2() {
		//fail("Not yet implemented");
            assertEquals(exToTest.foo1((float) 5.5, 10),(float)10/15.5,0.005);
                
                
	}
        /**
         * Tercer caso de prueba: no se cumple el if(x<5) y se divide cero
         */
        @Test
	public void test_3() {
		//fail("Not yet implemented");
                
                assertEquals(exToTest.foo1((float) 0, 10),Infinity,0);
	}
        

}
