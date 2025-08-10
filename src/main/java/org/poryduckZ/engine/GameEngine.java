package org.poryduckZ.engine;

import org.poryduckZ.model.Board;
import org.poryduckZ.model.Card;
import org.poryduckZ.ui.BoardRenderer;

import javax.swing.*;
import java.util.List;

public class GameEngine {
    private final Board board;
    private final List<Card> chanceDeck;
    private final List<Card> communityChestDeck;
    private final boolean gameOver = false;

    public GameEngine(Board board) {
        this.board = board;
        this.chanceDeck = CardFactory.createChanceDeck();
        this.communityChestDeck = CardFactory.createCommunityChestDeck();
    }

    public Card drawChanceCard() {
        Card card = chanceDeck.removeFirst();
        chanceDeck.add(card);
        return card;
    }

    public Card drawCommunityChestCard() {
        Card card = communityChestDeck.removeFirst();
        communityChestDeck.add(card);
        return card;
    }

    // TODO: make this look more like monopoly board
    public void start() {
        JFrame frame = new JFrame("Monopoly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BoardRenderer(board));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
