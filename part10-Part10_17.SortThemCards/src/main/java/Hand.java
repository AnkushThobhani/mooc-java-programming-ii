/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = cards.iterator();
        
        iterator.forEachRemaining(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    @Override
    public int compareTo(Hand otherHand) {
        int thisValue = this.cards.stream()     //these get the sums
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        int otherValue = otherHand.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        
        return thisValue - otherValue;
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
