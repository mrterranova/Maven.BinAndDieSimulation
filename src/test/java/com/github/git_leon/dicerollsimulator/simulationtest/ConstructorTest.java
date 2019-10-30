package com.github.git_leon.dicerollsimulator.simulationtest;

import com.github.git_leon.dicerollsimulator.Simulation;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {
    @Test
    public void test0() {
        // given
        Integer numberOfDie = null;
        Integer numberOfTosses = null;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation);
    }

    @Test
    public void test1() {
        // given
        Integer numberOfDie = 1;
        Integer numberOfTosses = null;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation);
    }

    @Test
    public void test2() {
        // given
        Integer numberOfDie = 1;
        Integer numberOfTosses = 1;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation);
    }

    @Test
    public void test3() {
        // given
        Integer numberOfDie = 2;
        Integer numberOfTosses = 3;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation);
    }

    @Test
    public void test4() {
        // given
        Integer numberOfDie = Integer.MAX_VALUE;
        Integer numberOfTosses = Integer.MAX_VALUE;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation);
    }
}
