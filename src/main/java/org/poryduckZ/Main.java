package org.poryduckZ;

import org.poryduckZ.engine.BoardFactory;
import org.poryduckZ.engine.GameEngine;

public class Main {
    public static void main(String[] args) {
        var board = BoardFactory.createStandardBoard();
        var gameEngine = new GameEngine(board);
        gameEngine.start();
    }
}