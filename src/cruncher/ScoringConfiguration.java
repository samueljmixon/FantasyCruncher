
package cruncher;

/**
 * The ScoringConfiguration class stores data about a League's scoring scheme,
 * essentially how much certain fantasy football Stats are worth.
 * 
 * @author sjmixon@g.clemson.edu
 * @version 17 April 2016
 */
public class ScoringConfiguration
{
	private double[] myMultipliers;

	public ScoringConfiguration()
	{
		myMultipliers = new double[Stats.BASIC_STATS + (2 * Stats.VAR_STATS)];
	}

	public void addScoringValue(int statCode, double value)
	{
		myMultipliers[statCode] = value;
	}

	public double computeScore(Player aPlayer, int weekCode)
	{
		double toReturn = 0;

		// calculate additions for basic stats
		for (int i = 0; i < Stats.BASIC_STATS; i++)
		{
			toReturn += myMultipliers[i] * aPlayer.getStat(weekCode, i);
		}

		// calculate additions for variable worth stats
		for (int i = Stats.BASIC_STATS;
				i < Stats.BASIC_STATS + Stats.VAR_STATS; i++)
		{
			int threshold = (int) myMultipliers[i + Stats.VAR_STATS];
			if (threshold > 0)
			{
				toReturn += myMultipliers[i] *
						(aPlayer.getStat(weekCode, i) / threshold);
			}
		}

		return (toReturn);
	}

	// N values for variable-worth stats
	public static final int PASSING_YARDS_N = 135;
	public static final int COMPLETIONS_N = 136;
	public static final int INCOMPLETIONS_N = 137;
	public static final int RUSHING_YARDS_N = 138;
	public static final int RUSHING_ATTEMPTS_N = 139;
	public static final int RECEIVING_YARDS_N = 140;
	public static final int RECEPTIONS_N = 141;
	public static final int KICKOFF_RETURN_YARDS_N = 142;
	public static final int PUNT_RETURN_YARDS_N = 143;
	public static final int SACKS_N = 144;
	public static final int TOTAL_TACKLES_N = 145;
}
