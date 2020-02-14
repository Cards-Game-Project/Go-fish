/**
 * 
 */
package ca.sheridancollege.project;

/**
 * @author Administrator
 *
 */
public class StandardPack extends Card {

	public StandardPack() {}
	
	public StandardPack(Ranks rank, Suits suit) {
		super(rank,suit);
	}
	
	public String toString(){
		return this.getRank().name()+this.getSuit().name();
	};
}
