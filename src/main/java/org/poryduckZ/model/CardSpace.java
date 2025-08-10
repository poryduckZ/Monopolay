package org.poryduckZ.model;

public record CardSpace(CardType cardType) implements BoardSpace {
    @Override
    public String name() {
        return cardType.toString();
    }

    public enum CardType {
        COMMUNITY_CHEST,
        CHANCE
    }
}
