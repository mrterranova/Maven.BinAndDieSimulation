package com.github.git_leon.dicerollsimulator.binstest;

import com.github.git_leon.dicerollsimulator.Bins;
import org.junit.Assert;
import org.junit.Test;

public class IncrementBinTest {
    @Test
    public void test0() {
        Integer numberOfIncrements = 0;
        Integer faceValueToIncrement = 1;
        test(numberOfIncrements, faceValueToIncrement);
    }

    @Test
    public void test1() {
        Integer numberOfIncrements = 1;
        Integer faceValueToIncrement = 1;
        test(numberOfIncrements, faceValueToIncrement);
    }

    @Test
    public void test2() {
        Integer numberOfIncrements = 2;
        Integer faceValueToIncrement = 1;
        test(numberOfIncrements, faceValueToIncrement);
    }

    @Test
    public void test3() {
        Integer numberOfIncrements = 3;
        Integer faceValueToIncrement = 1;
        test(numberOfIncrements, faceValueToIncrement);
    }


    private void test(Integer numberOfIncrements, Integer faceValueToIncrement) {
        // given
        Bins bins = new Bins();
        Integer preIncrementValue = bins.getBin(faceValueToIncrement);
        Integer postIncrementValue = preIncrementValue + numberOfIncrements;
        Integer expected = postIncrementValue - preIncrementValue;

        // when
        for (int currentIteration = 0; currentIteration < numberOfIncrements; currentIteration++) {
            bins.incrementBin(faceValueToIncrement);
        }

        // then
        Integer actual = bins.getBin(faceValueToIncrement);
        Assert.assertEquals(expected, actual);
    }
}
