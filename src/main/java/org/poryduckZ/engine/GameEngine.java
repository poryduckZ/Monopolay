package org.poryduckZ.engine;

import org.poryduckZ.model.*;
import org.poryduckZ.ui.BoardRenderer;

import javax.swing.*;
import java.util.List;

public class GameEngine {
    private final Board board;
    private final List<Card> chanceDeck;
    private final List<Card> communityChestDeck;
    private final Dice dice;
    private final Player[] players;
    private int currentPlayerIndex = 0;

    public GameEngine(Board board, Dice dice, Player[] players) {
        this.board = board;
        this.dice = dice;
        this.players = players;
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

    private void movePlayer(Player player, int steps) {
        int oldPosition = player.getPosition();
        int newPosition = (oldPosition + steps) % board.size();

        if (oldPosition + steps >= board.size()) {
            player.addMoney(200);
            System.out.println(player.getName() + " passed GO and collected $200");
        }

        player.setPosition(newPosition);
        BoardSpace landedSpace = board.getSpace(newPosition);
        System.out.println(player.getName() + " landed on " + landedSpace.name());

        handleSpace(player, landedSpace);
    }

    public void nextTurn() {
        Player current = players[currentPlayerIndex];

        if (current.isInJail()) {
            handleJailTurn(current);
        } else {
            takeNormalTurn(current);
        }

        if (!dice.isDouble() || current.isInJail()) {
            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
        }
    }

    private void takeNormalTurn(Player player) {
        dice.roll();
        System.out.println(player.getName() + " rolled " + dice.getDie1() + " and " + dice.getDie2());

        if (dice.isDouble()) {
            System.out.println(player.getName() + " rolled doubles!");
            if (dice.getDoublesCount() == 3) {
                System.out.println(player.getName() + " rolled 3 doubles in a row and is sent to jail!");
                player.sendToJail(10);
                dice.resetDoublesCount();
                return;
            }
        }

        movePlayer(player, dice.getTotal());
    }

    private void handleJailTurn(Player player) {
        System.out.println(player.getName() + " is in jail.");

        dice.roll();
        System.out.println(player.getName() + " rolled " + dice.getDie1() + " and " + dice.getDie2());

        if (dice.isDouble()) {
            System.out.println(player.getName() + " rolled doubles and gets out of jail!");
            player.releaseFromJail();
            movePlayer(player, dice.getTotal());
            return;
        }

        player.incrementJailTurns();
        if (player.getJailTurns() >= 3) {
            System.out.println(player.getName() + " paid $50 to get out of jail.");
            player.subtractMoney(50);
            player.releaseFromJail();
            movePlayer(player, dice.getTotal());
        } else {
            System.out.println(player.getName() + " stays in jail this turn.");
        }
    }

    private void handleSpace(Player player, BoardSpace space) {
        // TODO: complete this
    }

    // TODO: make this look more like monopoly board
    private void renderBoard() {
        JFrame frame = new JFrame("Monopoly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BoardRenderer(board));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    public void start() {
        renderBoard();
    }
}
