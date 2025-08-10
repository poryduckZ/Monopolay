package org.poryduckZ.model;

public record Card(String description, CardAction action) {
    public enum CardActionType {
        MOVE_TO,
        MOVE_RELATIVE,
        PAY_MONEY,
        RECEIVE_MONEY,
        GET_OUT_OF_JAIL,
        GO_TO_JAIL
    }

    public record CardAction(CardActionType type, int value) {}
}
