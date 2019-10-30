package com.github.git_leon.dicerollsimulator.bintest;

import com.github.git_leon.dicerollsimulator.Bin;
import org.junit.Assert;
import org.junit.Test;

public class IncrementTest {
    @Test
    public void test1() {
        // given
        Bin bin = new Bin(null);
        Integer expectedNumberOfOccurrences = 1;

        // when
        bin.increment();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurrences();

        // then
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
    }

    @Test
    public void test2() {
        // given
        Bin bin = new Bin(null);
        Integer expectedNumberOfOccurrences = 2;

        // when
        bin.increment();
        bin.increment();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurrences();

        // then
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
    }


    @Test
    public void test3() {
        // given
        Bin bin = new Bin(null);
        Integer expectedNumberOfOccurrences = 3;

        // when
        bin.increment();
        bin.increment();
        bin.increment();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurrences();

        // then
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
    }
}
