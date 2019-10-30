package com.github.git_leon.dicerollsimulator;

public class Bins {
    private final Bin[] bins;

    public Bins() {
        this(1, 12);
    }

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        Integer numberOfBins = maxFaceValue - minFaceValue;
        this.bins = new Bin[numberOfBins];
        for (int currentIndex = 0; currentIndex < bins.length; currentIndex++) {
            Integer currentValue = minFaceValue + currentIndex;
            bins[currentIndex] = new Bin(currentValue);
        }
    }

    public void incrementBin(Integer faceValueToIncrement) {
        Bin bin = getBin(faceValueToIncrement);
        bin.increment();
    }

    public Bin getBin(Integer faceValueToIncrement) {
        for (int currentIndex = 0; currentIndex < bins.length; currentIndex++) {
            Bin currentBin = bins[currentIndex];
            if(currentBin.getFaceValueToTrack().equals(faceValueToIncrement)) {
                return currentBin;
            }
        }
        return null;
    }

    public Bin[] getBins() {
        return bins;
    }
}
