/*-----------------------------------------------------------------------------------------------	
|	GameInfo Class:   											
|  	Contains constant information about the Business Objects accessible publicly
|	(Feel free to add more, or modify existing constants)		  										
-------------------------------------------------------------------------------------------------*/

public class GameInfo {
	
	//Sides of a Tile... 
	public static int UP = 0, RIGHT = 1, DOWN = 2, LEFT = 3;
	
	//Types of Regions...
	public static int ROAD = 1, CITY = 2, FIELD = 3, CHURCH = 4;
	
	//Total tiles
	public static int MAX_TILES = 77;
	
	//Shift coordinates to visit children of root(x,y)
	public static int[] SHIFT = {1, 0,  -1, 0,  0, 1,  0,-1};
}

