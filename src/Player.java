import java.util.*;

/*-----------------------------------------------------------------------------------------------	
|	Player Class:   											
|  	Contains information and behaviours of a Player Object												
-------------------------------------------------------------------------------------------------*/

public abstract class Player {
	private int score;
	private List<Meeple> currentMeeples;
	
	//Any changes to a Players score has to go through this setter
	public void altScore(int score){
		this.score = score; 
	}

	public int  getScore(){
		return score;
	}
}