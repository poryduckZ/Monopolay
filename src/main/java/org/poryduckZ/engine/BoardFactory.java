package org.poryduckZ.engine;

import org.poryduckZ.model.*;

import java.util.List;

public class BoardFactory {

    public static Board createStandardBoard() {
        List<BoardSpace> spaces = List.of(
                new GoSpace("GO"),
                new Property("Mediterranean Avenue", 60, 2, "Brown"),
                new CardSpace(CardSpace.CardType.COMMUNITY_CHEST),
                new Property("Baltic Avenue", 60, 4, "Brown"),
                new TaxSpace("Income Tax", 200),
                new RailwaySpace("Reading Railroad", 200, 25),
                new Property("Oriental Avenue", 100, 6, "Light Blue"),
                new CardSpace(CardSpace.CardType.CHANCE),
                new Property("Vermont Avenue", 100, 6, "Light Blue"),
                new Property("Connecticut Avenue", 120, 8, "Light Blue"),
                new JailSpace("Jail / Just Visiting"),
                new Property("St. Charles Place", 140, 10, "Pink"),
                new UtilitySpace("Electric Company", 150),
                new Property("States Avenue", 140, 10, "Pink"),
                new Property("Virginia Avenue", 160, 12, "Pink"),
                new RailwaySpace("Pennsylvania Railroad", 200, 25),
                new Property("St. James Place", 180, 14, "Orange"),
                new CardSpace(CardSpace.CardType.COMMUNITY_CHEST),
                new Property("Tennessee Avenue", 180, 14, "Orange"),
                new Property("New York Avenue", 200, 16, "Orange"),
                new FreeParkingSpace("Free Parking"),
                new Property("Kentucky Avenue", 220, 18, "Red"),
                new CardSpace(CardSpace.CardType.CHANCE),
                new Property("Indiana Avenue", 220, 18, "Red"),
                new Property("Illinois Avenue", 240, 20, "Red"),
                new RailwaySpace("B&O Railroad", 200, 25),
                new Property("Atlantic Avenue", 260, 22, "Yellow"),
                new Property("Ventnor Avenue", 260, 22, "Yellow"),
                new UtilitySpace("Water Works", 150),
                new Property("Marvin Gardens", 280, 24, "Yellow"),
                new JailSpace("Go To Jail"),
                new Property("Pacific Avenue", 300, 26, "Green"),
                new Property("North Carolina Avenue", 300, 26, "Green"),
                new CardSpace(CardSpace.CardType.COMMUNITY_CHEST),
                new Property("Pennsylvania Avenue", 320, 28, "Green"),
                new RailwaySpace("Short Line", 200, 25),
                new CardSpace(CardSpace.CardType.CHANCE),
                new Property("Park Place", 350, 35, "Dark Blue"),
                new TaxSpace("Luxury Tax", 100),
                new Property("Boardwalk", 400, 50, "Dark Blue")
        );

        return new Board(spaces);
    }
}
