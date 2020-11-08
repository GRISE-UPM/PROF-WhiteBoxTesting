package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_foo2 {

	private static Exercises exercise;

	@BeforeAll
	public static void before() {
		exercise = new Exercises();
	}

	@Test
	public void foo2_0_2_a_no_mayor_y_no_entra_en_condicion() {
		assertEquals(1F, exercise.foo2(0F, 2F));
	}

	@Test
	public void foo2_2_2_a_no_mayor_y_si_entra_en_condicion_izquierda() {
		assertEquals(2F, exercise.foo2(2F, 2F));
	}

	@Test
	public void foo2_0_0_a_no_mayor_y_si_entra_en_condicion_derecha() {
		assertEquals(2F, exercise.foo2(0F, 0F));
	}
	
	@Test
	public void foo2_2_0_a_mayor_b_y_no_entra_en_condicion() {
		assertEquals(2F, exercise.foo2(1F, -2F));
	}
	
	
	@Test
	public void foo2_2_0_a_mayor_b_y_si_entra_en_condicion_izquierda() {
		assertEquals(2F, exercise.foo2(2F, -2F));
	}
	
	@Test
	public void foo2_2_0_a_mayor_b_y_si_entra_en_condicion_derecha() {
		assertEquals(2F, exercise.foo2(1F, 0F));
	}

}
