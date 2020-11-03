package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_foo2 {

	@Test
	public void foo2_a_gt_b() {
		assertEquals(2, new Exercises().foo2(6, 4));
	}
	
	@Test
	public void foo2_a_lt_b() {
		assertEquals(2, new Exercises().foo2(4, 6));
	}
	
	@Test
	public void foo2_cos_ab_gt_0() {
		assertEquals(2, new Exercises().foo2(0, 0));
	}
	
	@Test
	public void foo2_cos_a_gt_0_cos_b_lt_0() {
		assertEquals(1, new Exercises().foo2(2, 0));
	}
}
