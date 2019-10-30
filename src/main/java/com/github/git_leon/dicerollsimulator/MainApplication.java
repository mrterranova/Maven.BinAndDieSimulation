package com.github.git_leon.dicerollsimulator;

public class MainApplication {
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.run();
        String output = sim.toString();
        System.out.println(output);
    }
}
