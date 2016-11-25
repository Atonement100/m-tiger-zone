import java.util.List;

/*------------------------------------------------------------------------------
|	Deck Class:
|  	Contains the Common Deck with already shuffled Tiles
------------------------------------------------------------------------------*/

public class Deck {
	private int curr = 0;
	private List<Tile> deck;
	private boolean generated = false;;
	
	//Ability to set up the Deck after server generates it
	public void setStandardDeck(List<Tile> deck){
		this.deck = deck;
		generated = true;
	}
	
	//Generates a shuffled deck for testing
	public void generateDeck(){
		//Implementation here...
		generated = true;
	}
	
	//Returns the current Tile in play
	public Tile getCurrent(){
		if(generated)
			return deck.get(curr);
		throw new RuntimeException("Deck must be generated before using it");
	}
	
	//Goes to the next Tile
	public void next(){
		if(generated)
			curr++;
	}
	
	//Checks for the end of deck
	public boolean isDone(){
		if(generated)
			return curr < deck.size();
		return true;
	}
}