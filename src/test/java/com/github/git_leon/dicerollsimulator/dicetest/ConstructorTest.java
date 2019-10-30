package com.github.git_leon.dicerollsimulator.dicetest;

import com.github.git_leon.dicerollsimulator.Dice;
import org.junit.Test;

public class ConstructorTest {
    @Test(expected = NullPointerException.class)
    public void test0() {
        // given
        // when
        Dice dice = new Dice(null, null);
    }

}
