package com.github.git_leon.dicerollsimulator;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private Integer numberOfFaces;
    private Integer currentFaceValue;

    public Die() {
        this(6);
    }

    public Die(Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public void roll() {
        ThreadLocalRandom randomNumberGenerator = ThreadLocalRandom.current();
        Integer randomFaceValue = randomNumberGenerator.nextInt(1, numberOfFaces);
        this.currentFaceValue = randomFaceValue;
    }

    public Integer getCurrentFaceValue() {
        return currentFaceValue;
    }

    public Integer getNumberOfFaces() {
        return numberOfFaces;
    }
}
