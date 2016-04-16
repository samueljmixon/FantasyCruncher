
package CruncherBasics;

public class Stats
{
	private int[][] myNums;
	
	public Stats()
	{
		myNums = new int[17][20];
	}

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
