package com.blackfez.cards;

public class Faces {
	
	public enum Face {
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING
	}
	
	public static Integer getValue( Face face ) {
		switch( face ) {
		case ACE:
			return 1;
		case TWO:
			return 2;
		case THREE:
			return 3;
		case FOUR:
			return 4;
		case FIVE:
			return 5;
		case SIX:
			return 6;
		case SEVEN:
			return 7;
		case EIGHT:
			return 8;
		case NINE:
			return 9;
		case TEN:
		case JACK:
		case QUEEN:
		case KING:
			return 10;
		default:
			return null;
		}
	}
	
	public static Boolean isFaceCard( Face face ) {
		switch( face ) {
		case JACK:
		case QUEEN:
		case KING:
		case ACE:
			return true;
		default:
			return false;
		}
	}

}
