package com.github.git_leon.dicerollsimulator;

public class Bins {
    private final Bin[] binArray;

    public Bins() {
        this(2,12);
    }

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        int numberOfBins = (maxFaceValue - minFaceValue)+1;
        Bin[] binArray = new Bin[numberOfBins];
        this.binArray = binArray;
        for(int i=0; i < binArray.length; i++){
            Integer valToTrack = minFaceValue+i;
            binArray[i] = new Bin(valToTrack);

        }
    }

    public void incrementBin(Integer faceValueToIncrement) {
        getBin(faceValueToIncrement).increment();
    }

    public Bin getBin(Integer faceValueToIncrement) {
        for(int i=0; i < binArray.length; i++){
            Bin bin = binArray[i];
            int faceValueSumToTrack = bin.getFaceValueToTrack();
            if(faceValueSumToTrack == faceValueToIncrement){
                return bin;
            }
        }
        return null;
    }

    public Bin[] getBins() {
        return this.binArray;
    }
}
