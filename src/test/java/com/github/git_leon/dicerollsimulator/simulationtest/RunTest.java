package com.github.git_leon.dicerollsimulator.simulationtest;

import com.github.git_leon.dicerollsimulator.Simulation;
import org.junit.Assert;
import org.junit.Test;

public class RunTest {
    @Test(expected = NullPointerException.class)
    public void test0() {
        // given
        Integer numberOfDie = null;
        Integer numberOfTosses = null;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // when
        simulation.run();

        // then
        Assert.assertNotNull(simulation);
    }

    @Test(expected = NullPointerException.class)
    public void test1() {
        // given
        Integer numberOfDie = 1;
        Integer numberOfTosses = null;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // when
        simulation.run();

        // then
        Assert.assertNotNull(simulation);
    }

    @Test(expected = NullPointerException.class)
    public void test2() {
        // given
        Integer numberOfDie = null;
        Integer numberOfTosses = 1;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // when
        simulation.run();

        // then
        Assert.assertNotNull(simulation);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test3() {
        // given
        Integer numberOfDie = 0;
        Integer numberOfTosses = null;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // when
        simulation.run();

        // then
        Assert.assertNotNull(simulation);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test4() {
        // given
        Integer numberOfDie = 0;
        Integer numberOfTosses = 0;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // when
        simulation.run();

        // then
        Assert.assertNotNull(simulation);
    }

    @Test
    public void test5() {
        // given
        Integer numberOfDie = 3;
        Integer numberOfTosses = 4;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // when
        simulation.run();

        // then
        Assert.assertNotNull(simulation);
    }


    @Test
    public void test6() {
        // given
        Integer numberOfDie = 7;
        Integer numberOfTosses = 23;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // when
        simulation.run();

        // then
        Assert.assertNotNull(simulation);
    }

    @Test(expected = OutOfMemoryError.class)
    public void test7() {
        // given
        Integer numberOfDie = Integer.MAX_VALUE;
        Integer numberOfTosses = Integer.MAX_VALUE;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // when
        simulation.run();

        // then
        Assert.assertNotNull(simulation);
    }
}
