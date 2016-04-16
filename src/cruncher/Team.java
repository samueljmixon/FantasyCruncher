
package cruncher;

public class Team
{
	private String myName;
	private Player[][] myPlayers;
	
	public Team(String aName)
	{
		myName = aName;
		myPlayers = new Player[17][16];
	}
	
	public String getName()
	{
		return (myName);
	}
	
	public Player[][] getPlayers()
	{
		return (myPlayers);
	}
}
