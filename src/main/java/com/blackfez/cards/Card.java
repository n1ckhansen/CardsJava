package com.blackfez.cards;

import com.blackfez.cards.Suits.Suit;
import com.blackfez.cards.Faces.Face;

public class Card {
	
	private Suit suit;
	private Face face;
	
	
	public Card() {
	}
	
	public Card( Face face, Suit suit ) {
		this.setFace(face);
		this.setSuit(suit);
	}
	
	public Face getFace() {
		return this.face;
	}

	public Suit getSuit() {
		return this.suit;
	}
	
	public Integer getValue() {
		return Faces.getValue(this.face);
	}
	
	public Boolean isFaceCard() {
		return Faces.isFaceCard(this.face);
	}
	
	public void setFace( Face face ) {
		this.face = face;
	}

	public void setSuit( Suit suit ) {
		this.suit = suit;
	}
}
