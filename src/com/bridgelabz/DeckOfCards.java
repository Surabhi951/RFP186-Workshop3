package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.initializeCards();
    }

    void initializeCards(){
        System.out.println("initializing cards");
        int cardIndex = 0;
        for(int i = 0; i < Card.suitArray.length; i++){
            for(int j = 0; j < Card.rankArray.length; j++){
                Card card = new Card(Card.suitArray[i],Card.rankArray[j]);
                Card.cardArray[cardIndex++] = card;
            }
        }
        printCards(Card.cardArray);
    }


    void printCards(Card[] cards){
        System.out.println("Cards are:");
        for(Card card : cards){
            System.out.println(card.getSuit() + "-" + card.getRank() + ",");
        }
    }
}
