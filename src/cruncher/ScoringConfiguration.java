
package cruncher;

public class ScoringConfiguration
{
	private double[] myMultipliers;
	
	public ScoringConfiguration(double[] someMultipliers)
	{
		myMultipliers = someMultipliers;
	}
	
	public double computeScore(Player aPlayer, int weekCode)
	{
		double toReturn = 0;
		for (int i = 0; i < myMultipliers.length; i++)
		{
			toReturn += myMultipliers[i] * aPlayer.getStat(weekCode, i);
		}
		return (toReturn);
	}
}
