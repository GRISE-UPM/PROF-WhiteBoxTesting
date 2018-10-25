package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {
	
	private Exercises ejercicio = new Exercises();
	
	
    private int[] listaLongitudMayor6() {
	    return new int[]{1,3,5,7,9,11};
    }

    private int[] listaPositivaLongitudMenor6() {
        return new int[]{1,2,3};
    }
   
    private int[] listaLongitudZero() {
        return new int[]{};
    }
    
    private int[] listaNegativa() {
        return new int[]{1,2,3, -4};
    }

	@Test
	public void prueb1(){
        int result = this.ejercicio.max_absolute(listaLongitudMayor6());
        assertEquals(result,-1);
    }
    @Test
    public void prueb2(){
        int result = this.ejercicio.max_absolute(listaPositivaLongitudMenor6());
        assertEquals(result,3);
    }

    @Test
    public void prueb3(){
        int result = this.ejercicio.max_absolute(listaNegativa());
        assertEquals(result,4);
    }

    @Test
    public void prueb4(){
        int result = this.ejercicio.max_absolute(listaLongitudZero());
        assertEquals(result,0);
    }
	
}
