package com.github.git_leon.dicerollsimulator.binstest;

import com.github.git_leon.dicerollsimulator.Bin;
import com.github.git_leon.dicerollsimulator.Bins;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {
    @Test(expected = NullPointerException.class)
    public void test1() {
        // given
        Integer minFaceValue = null;
        Integer maxFaceValue = minFaceValue;

        // when
        new Bins(minFaceValue, maxFaceValue);
    }


    @Test(expected = NullPointerException.class)
    public void test2() {
        // given
        Integer minFaceValue = null;
        Integer maxFaceValue = 1;

        // when
        // then
        new Bins(minFaceValue, maxFaceValue);
    }


    @Test(expected = NullPointerException.class)
    public void test3() {
        // given
        Integer minFaceValue = 1;
        Integer maxFaceValue = null;

        // when
        // then
        new Bins(minFaceValue, maxFaceValue);
    }


    @Test(expected = NegativeArraySizeException.class)
    public void test4() {
        // given
        Integer minFaceValue = 2;
        Integer maxFaceValue = 1;

        // when
        // then
        new Bins(minFaceValue, maxFaceValue);
    }


    @Test(expected = NegativeArraySizeException.class)
    public void test5() {
        // given
        Integer minFaceValue = 3;
        Integer maxFaceValue = 2;

        // when
        // then
        new Bins(minFaceValue, maxFaceValue);
    }

    @Test
    public void test6() {
        // given
        Integer minFaceValue = 1;
        Integer maxFaceValue = minFaceValue;

        // when
        // then
        new Bins(minFaceValue, maxFaceValue);
    }


    @Test
    public void test7() {
        // given
        Integer minFaceValue = 2;
        Integer maxFaceValue = minFaceValue;

        // when
        // then
        new Bins(minFaceValue, maxFaceValue);
    }

    
    @Test
    public void test8() {
        // given
        Integer minFaceValue = 1;
        Integer maxFaceValue = 2;

        // when
        // then
        new Bins(minFaceValue, maxFaceValue);
    }


    @Test
    public void test9() {
        // given
        Integer minFaceValue = 1;
        Integer maxFaceValue = 3;

        // when
        // then
        new Bins(minFaceValue, maxFaceValue);
    }

    @Test
    public void test10() {
        // given
        Integer minFaceValue = 2;
        Integer maxFaceValue = 3;

        // when
        Bins bins = new Bins(minFaceValue, maxFaceValue);

        // then
        for (Integer expectedFaceValue = minFaceValue; expectedFaceValue < maxFaceValue; expectedFaceValue++) {
            Bin bin = bins.getBin(expectedFaceValue);
            Integer actualFaceValue = bin.getFaceValueToTrack();
            Assert.assertEquals(expectedFaceValue, actualFaceValue);
        }
    }

}
