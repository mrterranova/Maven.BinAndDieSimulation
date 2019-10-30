package com.github.git_leon.dicerollsimulator;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    private final List<Die> dice;

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
        this.dice = new ArrayList<>(); // create new list

        // populate array with new die objects
        for (int currentIndex = 0; currentIndex < numberOfDie; currentIndex++) {// for every index
            Die die = new Die(numberOfFaces);// create a new die
            dice.add(die); // place the die into the list
        }
    }

    /**
     * Create a random number from 1 to 6 for each dice you roll
     * sum all of the random numbers up and that equals total for that roll
     */
    public Integer rollAndSum() {
        Integer total = 0;

        // for each of the die in the array
        for (int currentIndex = 0; currentIndex < dice.size(); currentIndex++) { // for every index
            Die currentElement = dice.get(currentIndex); // get current element
            currentElement.roll(); // roll die
            int theValueRolled = currentElement.getCurrentFaceValue(); // look at face of die
            total += theValueRolled; // add based on the value rolled
        }
        return total;
    }

    /**
     * @return the absolute minimum value that can be rolled by this set of die
     */
    public Integer getRollMin() {
        Integer numberOfDie = dice.size();
        Integer minimumValueToBeRolled = numberOfDie;
        return minimumValueToBeRolled;
    }

    /**
     * @return the absolute maximum value that can be rolled by this set of die
     */
    public Integer getRollMax() {
        Die oneOfTheDie = dice.get(0); // look at one of the die
        Integer numberOfFaces = oneOfTheDie.getNumberOfFaces(); // count number of faces
        Integer numberOfDie = dice.size(); // count number of die
        Integer maximumValueToBeRolled = numberOfFaces * numberOfDie;
        return maximumValueToBeRolled;
    }
}
