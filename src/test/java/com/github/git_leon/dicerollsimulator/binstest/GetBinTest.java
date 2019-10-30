package com.github.git_leon.dicerollsimulator.binstest;

import com.github.git_leon.dicerollsimulator.Bins;
import org.junit.Assert;
import org.junit.Test;

@Deprecated
public class GetBinTest {
    @Test(expected = NullPointerException.class)
    public void test1() {
        // given
        Bins bins = new Bins();
        Integer expected = null;

        // when
        Integer bin = bins.getBin(expected);
    }


    @Test
    public void test2() {
        // given
        Bins bins = new Bins();
        Integer expected = 1;

        // when
        Integer actual = bins.getBin(expected);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Bins bins = new Bins();
        Integer expected = 2;

        // when
        Integer actual = bins.getBin(expected);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        Bins bins = new Bins();
        Integer expected = 3;

        // when
        Integer actual = bins.getBin(expected);

        // then
        Assert.assertEquals(expected, actual);
    }

}
