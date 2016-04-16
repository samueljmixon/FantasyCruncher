
package cruncher;

public class Player
{
	private String myName;
	private int myPosition;
	private Stats myStats;
	
	public Player(String aName, int aPosition)
	{
		myName = aName;
		myPosition = aPosition;
		myStats = new Stats();
	}
	
	public void addStat(int weekCode, int statCode, int aStat)
	{
		myStats.setStat(weekCode, statCode, aStat);
	}
	
	public String getName()
	{
		return (myName);
	}
	
	public int getPosition()
	{
		return (myPosition);
	}
	
	public Stats getStats()
	{
		return (myStats);
	}
	
	public int getStat(int weekCode, int statCode)
	{
		return (myStats.getStat(weekCode, statCode));
	}
	
	public String toString()
	{
		String toReturn = myName + ", ";
		switch (myPosition)
		{
			case QB :
				toReturn += "QB";
				break;
			case RB :
				toReturn += "RB";
				break;
		}
		return (toReturn);
	}
	
	public static final int QB = 0;
	public static final int RB = 1;
}
