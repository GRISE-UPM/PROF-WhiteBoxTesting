package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test_foo2 {

	Exercises ex = new Exercises();
	
	@Test
	public void a_menor_igual_b_cos_a_mayor_igual_0_cos_b_menor_igual_0() {
		
		float x = (float)30.0;
	    float y = (float) 120.0;
	    
	    x = (float)Math.toRadians(x);
	    y = (float) Math.toRadians(y);
	    float result=(x+y)/2;
		assertEquals(result, ex.foo2(x, y),0.01 );
	}
	
	@Test
	public void a_menor_igual_b_cos_a_mayor_igual_0_cos_b_mayor_0() {
		
		float x = (float)30.0;
	    float y = (float) 60.0;
	    
	    x = (float)Math.toRadians(x);
	    y = (float) Math.toRadians(y);
	   
		assertEquals(2.0, ex.foo2(x, y),0.01 );
	}
	
	@Test
	public void a_menor_igual_b_cos_a_menor_0() {
		
		float x = (float)120.0;
	    float y = (float) 150.0;
	    
	    x = (float)Math.toRadians(x);
	    y = (float) Math.toRadians(y);
	   
		assertEquals(2.0, ex.foo2(x, y),0.01 );
	}
	
	@Test
	public void a_mayor_b_cos_b_mayor_igual_0_cos_a_menor_igual_0() {
		
		float x = (float)120.0;
	    float y = (float) 30.0;
	    
	    x = (float)Math.toRadians(x);
	    y = (float) Math.toRadians(y);
	    
	    float result=(x+y)/2;
	  	assertEquals(result, ex.foo2(x, y),0.01 );
	}
	
	@Test
	public void  a_mayor_b_cos_b_mayor_igual_0_cos_a_mayor_0() {
		
		float x = (float)60.0;
	    float y = (float) 30.0;
	    
	    x = (float)Math.toRadians(x);
	    y = (float) Math.toRadians(y);
	   
		assertEquals(2.0, ex.foo2(x, y),0.01 );
	}
	
	@Test
	public void a_mayor_b_cos_b_menor_0() {
		
		float x = (float)150.0;
	    float y = (float) 120.0;
	    
	    x = (float)Math.toRadians(x);
	    y = (float) Math.toRadians(y);
	   
		assertEquals(2.0, ex.foo2(x, y),0.01 );
	}
	


}
