
package cruncher;

public class Stats
{
	private int[][] myNums;
	
	public Stats()
	{
		myNums = new int[17][32];
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
	public static final int TD_PASSES = 1;
	public static final int INTERCEPTIONS_THROWN = 2;
	public static final int TPC_PASSES = 3;

	// rushing
	public static final int RUSHING_YARDS = 4;
	public static final int TD_RUSHES = 5;
	public static final int TPC_RUSHES = 6;

	// receiving
	public static final int RECEIVING_YARDS = 7;
	public static final int TD_RECEPTIONS = 8;
	public static final int TPC_RECEPTIONS = 9;

	// miscellaneous offense
	public static final int KICKOFF_RETURN_TD_OFF = 10;
	public static final int PUNT_RETURN_TD_OFF = 11;
	public static final int FUMBLE_RECOVERY_TD_OFF = 12;
	public static final int FUMBLES_LOST = 13;
	
	// kicking
	public static final int PAT_MADE = 14;
	public static final int FG_MISSED = 15;
	public static final int FG_0 = 16;
	public static final int FG_40 = 17;
	public static final int FG_50 = 18;
	
	// team defense / special teams
	public static final int KICKOFF_RETURN_TD_DST = 19;
	public static final int PUNT_RETURN_TD_DST = 20;
	public static final int INTERCEPTION_RETURN_TD_DST = 21;
	public static final int FUMBLE_RECOVERY_TD_DST = 22;
	public static final int PAT_RETURN = 23;
	public static final int PAT_SAFETY = 24;
	public static final int BLOCKED_KICK_TD_DST = 25;
	public static final int INTERCEPTIONS = 26;
	public static final int FUMBLES_RECOVERED = 27;
	public static final int BLOCKED_KICKS = 28;
	public static final int SAFETIES = 29;
	public static final int POINTS_ALLOWED = 30;
	public static final int YARDS_ALLOWED = 31;
}
