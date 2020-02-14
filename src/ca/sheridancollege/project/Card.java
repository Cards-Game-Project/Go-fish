/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models playing card Objects. Cards have 
 * ranks and suits (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * @author dancye, 2018
 * @modifier Little Tiger,2020
 */
public abstract class Card 
{
	public enum Ranks{ACE,KING,QUEEN,JACK,TEN,NIEN,EIGHT,SEVEN,SIX,FIVE,FOUR,THREE,TWO};
	public enum Suits{HEART,SPADE,DIAMOND,CLUB};
	private Ranks rank;
    private Suits suit;

    public Card() {}
    
    public Card(Ranks rank, Suits suit)
    {
       this.rank =rank;
       this.suit= suit;
    }

    public Ranks getRank() {
		return rank;
	}
    
    public Suits getSuit() {
		return suit;
	}
    
    @Override
    public abstract String toString();

}
