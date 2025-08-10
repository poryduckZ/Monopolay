package org.poryduckZ;

import org.poryduckZ.engine.BoardFactory;
import org.poryduckZ.engine.GameEngine;
import org.poryduckZ.model.Dice;
import org.poryduckZ.model.Player;

public class Main {
    public static void main(String[] args) {
        var gameEngine = new GameEngine(BoardFactory.createStandardBoard(), new Dice(), new Player[] {});
        gameEngine.start();
    }
}