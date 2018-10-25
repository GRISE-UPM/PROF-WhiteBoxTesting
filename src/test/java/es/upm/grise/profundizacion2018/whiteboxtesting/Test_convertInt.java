package es.upm.grise.profundizacion2018.whiteboxtesting;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {
        private  ConvertInt exToTest = new Exercises().new ConvertInt();
	@Test
	public void test() {
		//fail("Not yet implemented");
                try{
                    exToTest.convert(new char[] {});        
                    fail("No ha saltado la Ex."); 
                }
                catch(Exception ex){
                    //assertTrue(true);
                }
                            
	}

}
