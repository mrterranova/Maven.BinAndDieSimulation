package com.github.zipcodewilmington;

import java.util.Formatter;

public class Simulation {
    //numberOfDies to throw
    private int numOfDies;
    //numberOfTosses to run
    private int numberOfTosses;
    //make Bin a property so easier to print
    private Bins results;


    public Simulation(int numOfDies, int numberOfTosses) {
        this.numOfDies = numOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    //Create a simulation where two dies are thrown one million times.Keep track of all results.
    public void runSimulation() {
        Dice dice = new Dice(numOfDies);
        results = new Bins(dice.getRollMin(), dice.getRollMax());
        for (int i = 0; i <= numberOfTosses; i++) {
            Integer rollValue = dice.tossAndSum();
            results.incrementBin(rollValue);
        }
    }

    public Double getPercentageOfOccurrences(Integer faceValueToCheck) {
        Bin bin = results.getBin(faceValueToCheck);
        Integer numberOfOccurrences = bin.getNumberOfOccurrences();
        Double ratio = numberOfOccurrences.doubleValue() / numberOfTosses;
        Double percentage = ratio * 100;
        return percentage;
    }

    @Override
    public String toString() {
        Formatter outPut = new Formatter();
        for(Bin bin : results.getBins()) {
            // doing math
            Integer faceValue = bin.getFaceValueToTrack();
            Double percentage = getPercentageOfOccurrences(faceValue);


            // formatting string
            Integer starCount = percentage.intValue();
            String stars = new String(new char[starCount]).replace("\0", "*");
            outPut.format("%d : %d: %.2f: %s%n", faceValue, bin.getNumberOfOccurrences(), percentage, stars);
        }
        return outPut.toString();
    }

    public void printResults() {
        System.out.println(this.toString());
    }


}
