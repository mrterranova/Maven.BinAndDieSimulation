package com.github.git_leon.dicerollsimulator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private final Integer numberOfFaces;
    private Integer currentFaceValue;

    public Die() {
        this(6);
    }

    public Die(Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public void roll() {
//        Random rn = new Random();
//        this.currentFaceValue = rn.nextInt(6) + 1;
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
