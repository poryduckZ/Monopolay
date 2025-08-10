package org.poryduckZ.engine;

import org.poryduckZ.ui.BoardRenderer;

import javax.swing.*;

public class GameEngine {
    // TODO: make this look more like monopoly board
    public static void start() {
        var board = BoardFactory.createStandardBoard();

        JFrame frame = new JFrame("Monopoly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BoardRenderer(board));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
