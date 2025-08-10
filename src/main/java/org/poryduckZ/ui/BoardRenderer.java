package org.poryduckZ.ui;

import org.poryduckZ.model.Board;
import org.poryduckZ.model.BoardSpace;

import javax.swing.*;
import java.awt.*;

public class BoardRenderer extends JPanel {
    private final Board board;

    public BoardRenderer(Board board) {
        this.board = board;
        int WIDTH = 800;
        int HEIGHT = 800;
        setSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size = board.size();
        int cellSize = 120;
        int x_OFFSET = 5;
        int y_OFFSET = 20;

        for (int i = 0; i < size; i++) {
            BoardSpace space = board.getSpace(i);
            int x = (i % 10) * cellSize;
            int y = (i / 10) * cellSize;

            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(x, y, cellSize, cellSize);

            g.setColor(Color.BLACK);
            g.drawRect(x, y, cellSize, cellSize);
            g.drawString(space.name(), x + x_OFFSET, y + y_OFFSET); // TODO: make string wrap around
        }
    }
}
