package es.upm.grise.profundizacion2018.whiteboxtesting;



import org.junit.Test;

public class Test_foo2 {


    private Exercises exercises = new Exercises();

    @Test
    public void shouldReturnFloatWhenAgtBAndCosAltZero() {
        this.exercises.foo2(5,2);
    }
    @Test
    public void shouldReturnFloatWhenAgtBAndCosAgtZero() {
        this.exercises.foo2(201,200);
    }
    @Test
    public void shouldReturnFloatWhenAltBAndCosAltZero() {
        this.exercises.foo2(2,5);
    }
    @Test
    public void shouldReturnFloatWhenAltBAndCosAgtZero() {
        this.exercises.foo2(200,201);
    }
}
