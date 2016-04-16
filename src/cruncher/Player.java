
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
	
	public int[] getStatsForWeek(int weekCode)
	{
		return (myStats.getStatsForWeek(weekCode));
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
			case WR :
				toReturn += "WR";
				break;
			case TE :
				toReturn += "TE";
				break;
			case DST :
				toReturn += "DST";
				break;
			case K :
				toReturn += "K";
				break;
			case IDP :
				toReturn += "IDP";
				break;
			case HC :
				toReturn += "HC";
				break;
		}
		return (toReturn);
	}
	
	public static final int QB = 0;
	public static final int RB = 1;
	public static final int WR = 2;
	public static final int TE = 3;
	public static final int DST = 4;
	public static final int K = 5;
	public static final int IDP = 6;
	public static final int HC = 7;
}
