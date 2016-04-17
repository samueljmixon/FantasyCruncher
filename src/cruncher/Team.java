
package cruncher;

/**
 * The Team class stores data about a fantasy football team, including name
 * and roster over each of the weeks of the season.
 * 
 * @author sjmixon@g.clemson.edu
 * @version 17 April 2015
 */
public class Team
{
	private String myName;
	private Player[][] myPlayers;
	private int[] rosterCount;

	public Team(String aName)
	{
		myName = aName;
		myPlayers = new Player[Stats.SEASON_LENGTH][ROSTER_SIZE];
		rosterCount = new int[Stats.SEASON_LENGTH];
	}

	public void addPlayer(Player aPlayer, int weekCode)
	{
		myPlayers[weekCode][rosterCount[weekCode]] = aPlayer;
		rosterCount[weekCode]++;
	}

	public String getName()
	{
		return (myName);
	}

	public Player[][] getPlayers()
	{
		return (myPlayers);
	}

	public String toString()
	{
		String toReturn = myName + "\n";
		int i = 1;
		for (Player[] pa : myPlayers)
		{
			if (pa[0] != null)
			{
				toReturn += "\tWeek " + i++ + "\n";
				for (Player p : pa)
				{
					if (p != null)
					{
						toReturn += "\t\t" + p.toString() + "\n";
					}
				}
			}
		}
		return (toReturn);
	}

	public static final int ROSTER_SIZE = 16;
}
