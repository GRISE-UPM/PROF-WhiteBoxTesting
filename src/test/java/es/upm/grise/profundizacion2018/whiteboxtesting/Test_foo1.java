package es.upm.grise.profundizacion2018.whiteboxtesting;


import org.junit.Test;

public class Test_foo1 {

    private Exercises exercises = new Exercises();

	@Test
    public void shouldReturnfloatWhenXgtFive(){
	    this.exercises.foo1(6,2);
    }

    @Test
    public void shouldReturnfloatWhenXeqFive(){
        this.exercises.foo1(5,2);
    }

    @Test
    public void shouldReturnfloatWhenXltFive(){
        this.exercises.foo1(2,2);
    }

}
