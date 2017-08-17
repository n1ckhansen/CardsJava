package com.blackfez.cards;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import com.blackfez.cards.Suits.Suit;
import com.blackfez.cards.Faces.Face;

public class Deck {
	
	private List<Suit> suits;
	private HashMap<Suit,List<Face>> ranges;
	private Stack<Card> cards;
	
	// standard 52 card deck
	public Deck() {
		this.setDefaultSuits();
		this.setDefaultRanges();
		this.createDeck();
	}
	
	protected void createDeck() {
		this.cards = new Stack<Card>();
		for( Suit key : this.ranges.keySet() ) {
			for( Face f : this.ranges.get(key) ) {
				this.cards.push( new Card( f, key ) );
			}
		}
	}
	
	public Card dealCard() {
		return this.cards.pop();
	}
	
	public Card[] dealCards( Integer numberOfCards ) {
		Card[] dealt = new Card[numberOfCards];
		for( int i = 0; i < numberOfCards; i++ ) {
			dealt[ i ] = this.cards.pop();
		}
		return dealt;
	}
	

	public Stack<Card> getCards() {
		return this.cards;
	}
	
	public HashMap<Suit,List<Face>> getRanges() {
		return this.ranges;
	}
	
	public List<Suit> getSuits() {
		return this.suits;
	}
	
	public void setCards( Stack<Card> cards ) {
		this.cards = cards;
	}
	
	private void setDefaultRanges() {
		this.ranges = new HashMap<Suit,List<Face>>();
		for( Suit suit : this.suits ) {
			this.ranges.put(suit, Arrays.asList( Face.values() ) );
		}
	}
	
	private void setDefaultSuits() {
		this.setSuits( Arrays.asList( Suit.values() ) );
	}
	
	public void setRanges( HashMap<Suit,List<Face>> ranges ) {
		this.ranges = ranges;
	}
	
	public void setSuits( List<Suit> suits ) {
		this.suits = suits;
	}
	
	public void shuffleCards() {
		Stack<Card> out = new Stack<Card>();
		while( !this.cards.isEmpty() ) {
			out.push( this.cards.remove( new Random().nextInt( this.cards.size() ) ) );
		}
		this.setCards( out );
	}

}
