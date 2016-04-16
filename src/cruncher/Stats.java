
package cruncher;

public class Stats
{
	private int[][] myNums;
	
	public Stats()
	{
		myNums = new int[17][25];
	}
	
	public int[] getStatsForWeek(int weekCode)
	{
		return (myNums[weekCode]);
	}
	
	public int getStat(int weekCode, int statCode)
	{
		return (myNums[weekCode][statCode]);
	}

	public void setStat(int weekCode, int statCode, int aStat)
	{
		myNums[weekCode][statCode] = aStat;
	}

	// weeks
	public static final int WEEK_1 = 0;
	public static final int WEEK_2 = 1;
	public static final int WEEK_3 = 2;
	public static final int WEEK_4 = 3;
	public static final int WEEK_5 = 4;
	public static final int WEEK_6 = 5;
	public static final int WEEK_7 = 6;
	public static final int WEEK_8 = 7;
	public static final int WEEK_9 = 8;
	public static final int WEEK_10 = 9;
	public static final int WEEK_11 = 10;
	public static final int WEEK_12 = 11;
	public static final int WEEK_13 = 12;
	public static final int WEEK_14 = 13;
	public static final int WEEK_15 = 14;
	public static final int WEEK_16 = 15;
	public static final int WEEK_17 = 16;

	// passing
	public static final int PASSING_YARDS = 0;
	public static final int COMPLETIONS = 1;
	public static final int PASSING_ATTEMPTS = 2;
	public static final int TD_PASSES = 3;
	public static final int TIMES_SACKED = 4;
	public static final int INTERCEPTIONS_THROWN = 5;
	public static final int TPC_PASSES = 6;

	// rushing
	public static final int RUSHING_YARDS = 7;
	public static final int RUSHING_ATTEMPTS = 8;
	public static final int TD_RUSHES = 9;
	public static final int TPC_RUSHES = 10;

	// receiving
	public static final int RECEIVING_YARDS = 8;
	public static final int RECEPTIONS = 9;
	public static final int TD_RECEPTIONS = 10;
	public static final int TPC_RECEPTIONS = 11;
	public static final int TARGETS = 12;

	// miscellaneous offense
	public static final int KICKOFF_RETURN_YARDS_OFF = 13;
	public static final int PUNT_RETURN_YARDS_OFF = 14;
	public static final int KICKOFF_RETURN_TD_OFF = 15;
	public static final int PUNT_RETURN_TD_OFF = 16;
	public static final int FUMBLE_RECOVERY_TD_OFF = 17;
	public static final int FUMBLES = 18;
	public static final int FUMBLES_LOST = 19;
}
