package com.github.git_leon.dicerollsimulator;

import java.util.ArrayList;
import java.util.List;

public class Bins {
    private final List<Bin> bins;

    public Bins() {
        this(1, 12);
    }

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        Integer numberOfBins = maxFaceValue - minFaceValue;
        this.bins = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < numberOfBins; currentIndex++) {
            Integer currentValue = minFaceValue + currentIndex;
            bins.add(new Bin(currentValue));
        }
    }

    public void incrementBin(Integer faceValueToIncrement) {
        Bin bin = getBin(faceValueToIncrement);
        bin.increment();
    }

    public Bin getBin(Integer faceValueToIncrement) {
        for (int currentIndex = 0; currentIndex < bins.size(); currentIndex++) {
            Bin currentBin = bins.get(currentIndex);
            if(currentBin.getFaceValueToTrack().equals(faceValueToIncrement)) {
                return currentBin;
            }
        }
        return null;
    }

    public Bin[] getBins() {
        return bins.toArray(new Bin[0]);
    }
}
