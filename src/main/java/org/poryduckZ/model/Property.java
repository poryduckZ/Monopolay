package org.poryduckZ.model;

public record Property(String name, int price, int baseRent, String colorGroup) implements BoardSpace  {
}
