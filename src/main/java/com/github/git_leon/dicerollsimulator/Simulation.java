package com.github.git_leon.dicerollsimulator;

import java.util.Formatter;

public class Simulation {
    private Integer numberOfDie;
    private Integer numberOfTosses;
    private Bins bins;


    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }

    //Create a simulation where two dies are thrown one million times.Keep track of all bins.
    public void run() {
        Dice dice = new Dice(numberOfDie);
        bins = new Bins(dice.getRollMin(), dice.getRollMax());
        for (int currentTossNumber = 0; currentTossNumber < numberOfTosses; currentTossNumber++) {
            Integer faceValue = dice.rollAndSum();
            bins.incrementBin(faceValue);
        }
    }

    public Double getPercentageOfOccurrences(Integer faceValueToCheck) {
        Integer numberOfOccurrences = bins.getBin(faceValueToCheck);
        Double ratio = numberOfOccurrences.doubleValue() / numberOfTosses;
        Double percentage = ratio * 100;
        return percentage;
    }

    @Override
    public String toString() {
        Formatter outPut = new Formatter();
        for(Integer faceValueToTrack : bins.getBins()) {
            // doing math
            Integer numberOfOccurrences = bins.getBin(faceValueToTrack);
            Double percentage = getPercentageOfOccurrences(faceValueToTrack);


            // formatting string
            Integer starCount = percentage.intValue();
            String stars = new String(new char[starCount]).replace("\0", "*");
            outPut.format("%d : %d: %.2f: %s%n", faceValueToTrack, numberOfOccurrences, percentage, stars);
        }
        return outPut.toString();
    }

    public Bins getBins() {
        return bins;
    }
}
