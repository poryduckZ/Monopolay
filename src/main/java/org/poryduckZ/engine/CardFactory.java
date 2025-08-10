package org.poryduckZ.engine;

import org.poryduckZ.model.Card;
import org.poryduckZ.model.Card.CardActionType;
import org.poryduckZ.model.Card.CardAction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardFactory {

    public static List<Card> createChanceDeck() {
        List<Card> cards = new ArrayList<>();

        cards.add(new Card(
                "Advance to GO (Collect $200)",
                new CardAction(CardActionType.MOVE_TO, 0)
        ));

        cards.add(new Card(
                "Go to Jail. Go directly to Jail, do not pass GO, do not collect $200",
                new CardAction(CardActionType.GO_TO_JAIL, 10) // Jail position
        ));

        cards.add(new Card(
                "Advance to Illinois Avenue. If you pass GO, collect $200",
                new CardAction(CardActionType.MOVE_TO, 24)
        ));

        cards.add(new Card(
                "Advance to St. Charles Place. If you pass GO, collect $200",
                new CardAction(CardActionType.MOVE_TO, 11)
        ));

        cards.add(new Card(
                "Bank pays you dividend of $50",
                new CardAction(CardActionType.RECEIVE_MONEY, 50)
        ));

        cards.add(new Card(
                "Pay poor tax of $15",
                new CardAction(CardActionType.PAY_MONEY, 15)
        ));

        cards.add(new Card(
                "Your building loan matures. Collect $150",
                new CardAction(CardActionType.RECEIVE_MONEY, 150)
        ));

        cards.add(new Card(
                "Get Out of Jail Free",
                new CardAction(CardActionType.GET_OUT_OF_JAIL, 0)
        ));

        Collections.shuffle(cards);
        return cards;
    }

    public static List<Card> createCommunityChestDeck() {
        List<Card> cards = new ArrayList<>();

        cards.add(new Card(
                "Advance to GO (Collect $200)",
                new CardAction(CardActionType.MOVE_TO, 0)
        ));

        cards.add(new Card(
                "Bank error in your favor. Collect $200",
                new CardAction(CardActionType.RECEIVE_MONEY, 200)
        ));

        cards.add(new Card(
                "Doctor's fees. Pay $50",
                new CardAction(CardActionType.PAY_MONEY, 50)
        ));

        cards.add(new Card(
                "From sale of stock you get $50",
                new CardAction(CardActionType.RECEIVE_MONEY, 50)
        ));

        cards.add(new Card(
                "Go to Jail. Go directly to Jail, do not pass GO, do not collect $200",
                new CardAction(CardActionType.GO_TO_JAIL, 10)
        ));

        cards.add(new Card(
                "Get Out of Jail Free",
                new CardAction(CardActionType.GET_OUT_OF_JAIL, 0)
        ));

        cards.add(new Card(
                "Life insurance matures – Collect $100",
                new CardAction(CardActionType.RECEIVE_MONEY, 100)
        ));

        cards.add(new Card(
                "Pay hospital fees of $100",
                new CardAction(CardActionType.PAY_MONEY, 100)
        ));

        Collections.shuffle(cards);
        return cards;
    }
}
