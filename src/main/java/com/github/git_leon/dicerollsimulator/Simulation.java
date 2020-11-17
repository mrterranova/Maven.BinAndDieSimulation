package com.github.git_leon.dicerollsimulator;

public class Simulation {
    private Integer numberOfDie;
    private Integer numberOfTosses;
    private Bins bins;

    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }

    public void run() {
        Dice dice = new Dice(numberOfDie);
        bins = new Bins(dice.getRollMin(), dice.getRollMax());
        for (int i = 0; i < numberOfTosses; i++){
            Integer faceVal = dice.rollAndSum();
            bins.incrementBin(faceVal);
        }

    }

    public Double getPercentageOfOccurrences(Integer faceValueToCheck) {
        Bin bin = bins.getBin(faceValueToCheck);
        Double percentage = (bin.getNumberOfOccurrences().doubleValue() / numberOfTosses) * 100;
        return percentage;
    }

    @Override
    public String toString() {
        return null;
    }

    public Bins getBins() {
        return this.bins;
    }
}
