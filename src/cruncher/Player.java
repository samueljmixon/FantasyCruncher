
package cruncher;

public class Player
{
	private String myName;
	private Position myPosition;
	private Stats myStats;
	
	public Player(String aName, Position aPosition, Stats aStats)
	{
		myName = aName;
		myPosition = aPosition;
		myStats = aStats;
	}
	
	public String getName()
	{
		return (myName);
	}
	
	public Position getPosition()
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
}
