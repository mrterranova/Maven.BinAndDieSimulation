package com.github.zipcodewilmington;

public class MainApplication {
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
    }
}
