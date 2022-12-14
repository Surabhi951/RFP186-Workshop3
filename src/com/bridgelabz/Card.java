package com.bridgelabz;
public class Card  implements Comparable {
    public static final String[] suitArray = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] rankArray = new String[]{"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
    public static Card[] cardArray = new Card[52];

    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int x = this.rank.hashCode();
        int y = ((Card) o).rank.hashCode();
        return Integer.compare(x, y);
    }
}
