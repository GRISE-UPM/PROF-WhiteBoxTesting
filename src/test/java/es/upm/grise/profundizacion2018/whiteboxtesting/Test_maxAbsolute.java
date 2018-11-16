package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {


	Exercises ex = new Exercises();

	//shouldReturn.......When......

	@Test
	public void lengthMajor5(){
		int [] nums = {1,2,3,4,5,6};
		assertEquals(-1,ex.max_absolute(nums));
	}

	@Test
	public void lengthMinor5True(){
		int [] nums = {-1,-2,-3,-4};
		assertEquals(4,ex.max_absolute(nums));
	}

	@Test
	public void lengthMinor5False(){
		int [] nums = {1,2,3,4};
		assertEquals(4,ex.max_absolute(nums));
	}

	@Test
	public void lengthMinor5TrueFalse(){
		int [] nums = {1,2,-3,-4};
		assertEquals(4,ex.max_absolute(nums));
	}

}
