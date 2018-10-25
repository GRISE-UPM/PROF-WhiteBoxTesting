package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {
	
	private Exercises exer = new Exercises();
	@Test
	public void Mayor5(){
		int [] arr = {0,0,0,0,0,0};
        assertEquals(this.exer.max_absolute(arr),-1);
    }
    @Test
    public void Menor5YPositiva(){
    	int [] arr2 = {1,2,3,4};
        assertEquals(this.exer.max_absolute(arr2),4);
    }

    @Test
    public void Menor5YNegativa(){
    	int [] arr3 = {1,-2,3,-4};
        assertEquals(this.exer.max_absolute(arr3),4);
    }
    @Test
    public void vacio(){
    	int [] arr4 = {};
        assertEquals(this.exer.max_absolute(arr4),0);
    }
	
}