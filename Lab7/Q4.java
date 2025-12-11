package DS.Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q4 {

    private static final String[] COLORS = {"Red", "Green", "Blue", "Yellow"};
    private static final int[] VALUES = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    private static class Card {
        final String color;
        final int value;

        Card(String color, int value) {
            this.color = color;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Queue<Card> deck = buildShuffledDeck();

        Queue<Card> player1 = new LinkedList<>();
        Queue<Card> player2 = new LinkedList<>();

        dealCards(deck, player1, player2, 5);

        System.out.println("Player 1 hand: " + formatQueue(player1));
        System.out.println("Player 2 hand: " + formatQueue(player2));

        int score1 = 0;
        int score2 = 0;

        for (int round = 1; round <= 5; round++) {
            Card c1 = player1.poll();
            Card c2 = player2.poll();
            int cmp = compareCards(c1, c2);

            if (cmp > 0) {
                score1++;
                System.out.printf("Round %d: %s beats %s%n", round, cardToString(c1), cardToString(c2));
            } else if (cmp < 0) {
                score2++;
                System.out.printf("Round %d: %s beats %s%n", round, cardToString(c2), cardToString(c1));
            } else {
                System.out.printf("Round %d: %s ties %s%n", round, cardToString(c1), cardToString(c2));
            }
        }

        System.out.printf("Final Score -> Player 1: %d | Player 2: %d%n", score1, score2);
        if (score1 > score2) {
            System.out.println("Winner: Player 1");
        } else if (score2 > score1) {
            System.out.println("Winner: Player 2");
        } else {
            System.out.println("Result: Draw");
        }
    }

    private static Queue<Card> buildShuffledDeck() {
        List<Card> cards = new ArrayList<>();
        for (String color : COLORS) {
            for (int value : VALUES) {
                cards.add(new Card(color, value));
            }
        }
        Collections.shuffle(cards);
        return new LinkedList<>(cards);
    }

    private static void dealCards(Queue<Card> deck, Queue<Card> p1, Queue<Card> p2, int n) {
        for (int i = 0; i < n; i++) {
            p1.add(deck.poll());
            p2.add(deck.poll());
        }
    }

    private static int compareCards(Card a, Card b) {
        if (a.value != b.value) {
            return Integer.compare(a.value, b.value);
        }
        return Integer.compare(colorPriority(a.color), colorPriority(b.color));
    }

    private static int colorPriority(String color) {
        return switch (color) {
            case "Red" -> 4;
            case "Green" -> 3;
            case "Blue" -> 2;
            default -> 1; // Yellow
        };
    }

    private static String formatQueue(Queue<Card> q) {
        return q.stream().map(Q4::cardToString).toList().toString();
    }

    private static String cardToString(Card c) {
        return c.color + "-" + c.value;
    }
}
