/*-----------------------------------------------------------------------------------------------
|	City class implements Region.java:
|  	Contains methods specific to City Region Type
-------------------------------------------------------------------------------------------------*/

public class Lake extends Region {
	 
	private boolean complete;
	private int caps;
	private int tileID;
	private boolean crocodile;
    
    public Lake() 
    {
        type = GameInfo.CITY;
        id = -1;
    }
    
    public Lake(int initialCaps, int tID, boolean croc) 
    {
        type = GameInfo.CITY;
        id = -1;
        caps = initialCaps;
        tileID = tID;
        crocodile = croc;
    }
    
    public void addCap(){
    	caps++;
    }

	public String toString(){
		return "C" + super.toString();
	}

	public int getCaps(){
		return caps;
	}
	
	public boolean getCompleted() {

		return complete;
	}
	
	public boolean getCrocodile() {

		return crocodile;
	}

	public Integer getTileID() {
		// TODO Auto-generated method stub
		return tileID;
	}

}