package org.poryduckZ.model;

public record CardSpace(CardType cardType) implements BoardSpace {
    public enum CardType {
        COMMUNITY_CHEST,
        CHANCE
    }
}
