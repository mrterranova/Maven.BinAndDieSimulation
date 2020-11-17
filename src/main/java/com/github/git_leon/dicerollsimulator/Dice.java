package com.github.git_leon.dicerollsimulator;

public class Dice {
    private final Die[] diceArray;

    /**
     * @param numberOfDie - number of die-objects to be contained
     */
    public Dice(Integer numberOfDie) {
        this(numberOfDie, 6);
    }

    /**
     * @param numberOfDie - number of die-objects to be contained
     * @param numberOfFaces - number of faces on a single die-object
     */
    public Dice(Integer numberOfDie, Integer numberOfFaces) {
        this.diceArray = new Die[ numberOfDie ];
        for (int i=0; i< diceArray.length; i++){
            Die die = new Die(numberOfFaces);
            diceArray[i] = die;
        }
    }

    /**
     * Create a random number from 1 to 6 for each dice you roll
     * sum all of the random numbers up and that equals total for that roll
     */
    public Integer rollAndSum() {
       Integer sum = 0;
        for (int i = 0; i < diceArray.length; i++){
           Die die = diceArray[i];
           die.roll();
           sum += die.getCurrentFaceValue();
       }
        return sum;
    }

    /**
     * @return the absolute minimum value that can be rolled by this set of die
     */
    public Integer getRollMin() {
        return diceArray.length;
    }

    /**
     * @return the absolute maximum value that can be rolled by this set of die
     */
    public Integer getRollMax() {
        int maxFaceValue = diceArray[0].getNumberOfFaces();
        return getRollMin() * maxFaceValue;
    }
}
