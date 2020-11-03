package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Test_convertInt {
    private Exercises.convertInt exercise;

    @BeforeEach
    public void beforeAll() {
        this.exercise = new Exercises.convertInt();
    }

    @Test()
    public void length_grater_than_6() {
        assertThrows(Exception.class, () -> this.exercise.convert(new char[]{'-', '0', '0', '0', '0', '0', '0'}));
    }

    @Test
    public void negative_number() throws Exception {
        assertEquals(-12345, this.exercise.convert(new char[]{'-', '1', '2', '3', '4', '5'}));
    }

    @Test
    public void positive_number() throws Exception {
        assertEquals(12345, this.exercise.convert(new char[]{'1', '2', '3', '4', '5'}));
    }

    @Test
    public void upper_number_exception() throws Exception {
        assertThrows(Exception.class, () -> this.exercise.convert(new char[]{'-', '3', '2', '7', '6', '9'}));
    }

    @Test
    public void lower_number_exception() throws Exception {
        assertThrows(Exception.class, () -> this.exercise.convert(new char[]{'3', '2', '7', '6', '8'}));
    }
}