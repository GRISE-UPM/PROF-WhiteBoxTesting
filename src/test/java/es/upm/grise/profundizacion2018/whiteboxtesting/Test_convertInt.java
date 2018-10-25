package es.upm.grise.profundizacion2018.whiteboxtesting;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {
        private  ConvertInt exToTest = new Exercises().new ConvertInt();
        /**
         * Test pata ver si salta excepcion ante un array vacio
         */
	@Test
	public void test_1() {
		//fail("Not yet implemented");
                try{
                    exToTest.convert(new char[] {});        
                    fail("No ha saltado la Ex."); 
                }
                catch(Exception ex){
                    //Ha saltado ls excepcion como debía hacer
                }
                            
	}
        /**
         * Test para ver si salta una excepcion ante un array mayor que 6
         */
        @Test
	public void test_2() {
		//fail("Not yet implemented");
                try{
                    exToTest.convert(new char[] {'a','a','a','a','a','a','a'});        
                    fail("No ha saltado la Ex."); 
                }
                catch(Exception ex){
                    //Ha saltado ls excepcion como debía hacer
                }
                            
	}
        /**
         * Test para ver si salta una exceppcion ante caracteres no deseados
         */
        @Test
	public void test_3() {
		//fail("Not yet implemented");
                try{
                    exToTest.convert(new char[] {'a','a','a','a','a'});        
                    fail("No ha saltado la Ex."); 
                }
                catch(Exception ex){
                    //Ha saltado ls excepcion como debía hacer
                }
                            
	}
        /**
         * Test para ver si convierte adecuadamente ASCI(negativo)
         */
        @Test
	public void test_4() {
            try{
                assertEquals((int)exToTest.convert(new char[] { '-','3','4'}), -562);
            }
            catch(Exception ex){
                fail("No deberia haber saltado una Ex.");
            }
		
	}
        /**
         * Test para ver si convierte adecuadamente ASCI
         */
        @Test
	public void test_5() {
            try{
                assertEquals((int)exToTest.convert(new char[] { '3','4'}), 562);
            }
            catch(Exception ex){
                fail("No deberia haber saltado una Ex.");
            }
		
	}
	/**
         * Test para ver si salta una excepcion ante numeros mayores que 32767
         */
	@Test 
	public void test_6() {
            try{
                exToTest.convert(new char[] {'2', '3','4','5','6'});
                fail("No ha saltado la Ex.");
            }
            catch(Exception ex){
                //Ha saltado la excepcion como debía hacer
            }		
	}
        /**
         * Test para ver si salta una excepcion ante numeros menores que -32767
         */
        @Test 
	public void test_7() {
            try{
                exToTest.convert(new char[] {'-','2', '3','4','5','6'});
                fail("No ha saltado la Ex.");
            }
            catch(Exception ex){
                //Ha saltado ls excepcion como debía hacer
            }		
	}
	
        

}
