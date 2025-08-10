package org.poryduckZ.model;

public class Player {
    private final String name;
    private int position;
    private int money;
    private boolean inJail;
    private int jailTurns;
    private boolean getOutOfJailFree;

    public Player(String name, int startingMoney) {
        this.name = name;
        this.money = startingMoney;
        this.position = 0;
        this.inJail = false;
        this.jailTurns = 0;
        this.getOutOfJailFree = false;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int amount) {
        this.money += amount;
    }

    public void subtractMoney(int amount) {
        this.money -= amount;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void sendToJail(int jailPosition) {
        this.position = jailPosition;
        this.inJail = true;
        this.jailTurns = 0;
    }

    public void releaseFromJail() {
        this.inJail = false;
        this.jailTurns = 0;
    }

    public int getJailTurns() {
        return jailTurns;
    }

    public void incrementJailTurns() {
        this.jailTurns++;
    }

    public boolean hasGetOutOfJailFree() {
        return getOutOfJailFree;
    }

    public void setGetOutOfJailFree(boolean value) {
        this.getOutOfJailFree = value;
    }
}
