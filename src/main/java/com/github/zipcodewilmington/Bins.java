package com.github.zipcodewilmington;

public class Bins {
    private final Bin[] bins;

    /**
     * Note to self could refactor to make hashmap private by creating a method that returns the keys and one that
     * returns the values
     */
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
