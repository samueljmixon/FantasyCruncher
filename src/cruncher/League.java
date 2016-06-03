
package cruncher;

public class League
{
	String myName;
	Team[] myTeams;
	ScoringConfiguration mySC;
	int teamCount;
	
	public League(String aName, int aSize)
	{
		myName = aName;
		myTeams = new Team[aSize];
		teamCount = 0;
	}
	
	public void setScoringConfiguration(ScoringConfiguration aSC)
	{
		mySC = aSC;
	}
	
	public void addTeam(Team aTeam)
	{
		myTeams[teamCount] = aTeam;
		teamCount++;
	}
}
