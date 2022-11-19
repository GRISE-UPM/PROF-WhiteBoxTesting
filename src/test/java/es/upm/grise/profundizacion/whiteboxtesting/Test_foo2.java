package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test_foo2 {

	private Exercises e = new Exercises();
	static final float PI = (float) Math.PI;

	@Test
	@DisplayName("El arg.A es mayor que el arg.B. Se intercambian. Ambos cosenos son mayor que 0.")
	public void Arg1_Mayor_Arg2_Cos_Mayor_0() {
		
		assertEquals(2,e.foo2(5*PI/3, 0));

	}
	
	@Test
	@DisplayName("El arg.A es mayor que el arg.B. Se intercambian. Ambos cosenos son menor que 0.")
	public void Arg1_Mayor_Arg2_Cos_Menor_0() {
		
		assertEquals(2,e.foo2(-4*PI/3, 2*PI/3));

	}

	@Test
	@DisplayName("El arg.B es mayor que el arg.A. No se intercambian. Ambos cosenos son menor que 0.")
	public void Arg2_Mayor_Arg1_Cos_Menor_0() {

		assertEquals(2,e.foo2(2*PI/3, 4*PI/3));

	}
	
	@Test
	@DisplayName("El arg.B es mayor que el arg.A. No se intercambian. Ambos cosenos son mayor que 0.")
	public void Arg2_Mayor_Arg1_Cos_Mayor_0() {

		assertEquals(2,e.foo2(PI/6, 2*PI));

	}
	
	@Test
	@DisplayName("El arg.B es mayor que el arg.A. No se intercambian."
			+ "El coseno del arg.A es mayor que 0 y el del arg.B es menor que 0, no fijan se fija el valor a=1 y b=3.")
	public void Arg2MayorQueArg1_CosA_Mayor_0_Y_CosB_Menor_0() {

		double res = (4*PI/3)/2;
		assertEquals(res,e.foo2(0, 4*PI/3));

	}

}
