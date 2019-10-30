package com.github.zipcodewilmington.bintest;

import com.github.zipcodewilmington.Bin;
import org.junit.Assert;
import org.junit.Test;

public class IncrementTest {
    @Test
    public void test1() {
        // given
        Integer faceValue = null;
        Integer expectedNumberOfOccurrences = 1;
        Bin bin = new Bin(faceValue);

        // when
        bin.increment();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurrences();

        // then
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
    }

    @Test
    public void test2() {
        // given
        Integer faceValue = null;
        Integer expectedNumberOfOccurrences = 2;
        Bin bin = new Bin(faceValue);

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
        Integer faceValue = null;
        Integer expectedNumberOfOccurrences = 3;
        Bin bin = new Bin(faceValue);

        // when
        bin.increment();
        bin.increment();
        bin.increment();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurrences();

        // then
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
    }
}
