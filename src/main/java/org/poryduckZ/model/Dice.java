package org.poryduckZ.model;

import java.util.Random;

public class Dice {
    private final Random random = new Random();
    private int die1;
    private int die2;
    private int doublesCount;

    public void roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;

        if (isDouble()) {
            doublesCount++;
        } else {
            doublesCount = 0;
        }
    }

    public int getTotal() {
        return die1 + die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDoublesCount() {
        return doublesCount;
    }

    public void resetDoublesCount() {
        doublesCount = 0;
    }
}
