package com.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fb = new FizzBuzz();

    @Test
    public void returnsFizzIfNumberIsDivisibleBy3() throws Exception {
        String result = fb.translate(3);

        assertThat(result).isEqualTo("fizz");
    }

    @Test
    public void returnsBuzzIfNumberIsDivisibleBy5() throws Exception {
        String result = fb.translate(5);

        assertThat(result).isEqualTo("buzz");
    }

    @Test
    public void returnsFizzBuzzIfNumberIsDivisibleBy3And5() throws Exception {
        String result = fb.translate(15);

        assertThat(result).isEqualTo("fizzbuzz");
    }

    @Test
    public void returnsOriginalNumberifNotDivisibleBy3Or5() throws Exception {
        String result = fb.translate(4);

        assertThat(result).isEqualTo("4");
    }
}
