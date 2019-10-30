package com.github.git_leon.dicerollsimulator;

import java.util.HashMap;
import java.util.Map;

public class Bins {
    private final Map<Integer, Integer> bins;

    public Bins() {
        this(1, 12);
    }

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        Integer numberOfBins = maxFaceValue - minFaceValue;
        this.bins = new HashMap<>();
        for (int currentIndex = 0; currentIndex < numberOfBins; currentIndex++) {
            Integer currentValue = minFaceValue + currentIndex;
            Integer numberOfOccurrences = 0;
            bins.put(currentValue, numberOfOccurrences);
        }
    }

    public void incrementBin(Integer faceValueToIncrement) {
        Integer numberOfOccurrences = getBin(faceValueToIncrement);
        bins.put(faceValueToIncrement, numberOfOccurrences);
    }

    public Integer getBin(Integer faceValueToIncrement) {
        return bins.get(faceValueToIncrement);
    }

    public Integer[] getBins() {
        return bins.keySet().toArray(new Integer[0]);
    }
}
