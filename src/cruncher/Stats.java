
package cruncher;

/**
 * The Stats class stores a Player's statistics in each of the 135 fantasy
 * football statistical categories for each of the weeks of the season.
 * 
 * @author sjmixon@g.clemson.edu
 * @version 17 April 2016
 */
public class Stats
{
	private int[][] myNums;

	public Stats()
	{
		myNums = new int[SEASON_LENGTH][BASIC_STATS + VAR_STATS];
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

	// constants
	public static final int SEASON_LENGTH = 17;
	public static final int BASIC_STATS = 124;
	public static final int VAR_STATS = 11;

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
	public static final int EACH_PASSING_YARD = 0;
	public static final int TD_PASSES = 1;
	public static final int TD_PASS_40_BONUS = 2;
	public static final int TD_PASS_50_BONUS = 3;
	public static final int INTERCEPTIONS_THROWN = 4;
	public static final int TPC_PASSES = 5;
	public static final int PASSING_GAME_300_BONUS = 6;
	public static final int PASSING_GAME_400_BONUS = 7;
	public static final int PASSES_ATTEMPTED = 8;
	public static final int TIMES_SACKED = 9;
	public static final int EVERY_N_PASSING_YARDS = 124;
	public static final int EVERY_N_COMPLETIONS = 125;
	public static final int EVERY_N_INCOMPLETIONS = 126;

	// rushing
	public static final int EACH_RUSHING_YARD = 10;
	public static final int TD_RUSHES = 11;
	public static final int TD_RUSH_40_BONUS = 12;
	public static final int TD_RUSH_50_BONUS = 13;
	public static final int TPC_RUSHES = 14;
	public static final int RUSHING_GAME_100_BONUS = 15;
	public static final int RUSHING_GAME_200_BONUS = 16;
	public static final int EVERY_N_RUSHING_YARDS = 127;
	public static final int EVERY_N_RUSHING_ATTEMPTS = 128;

	// receiving
	public static final int EACH_RECEIVING_YARD = 17;
	public static final int TD_RECEPTIONS = 18;
	public static final int TD_RECEPTION_40_BONUS = 19;
	public static final int TD_RECEPTION_50_BONUS = 20;
	public static final int TPC_RECEPTIONS = 21;
	public static final int RECEIVING_GAME_100_BONUS = 22;
	public static final int RECEIVING_GAME_200_BONUS = 23;
	public static final int TARGETS = 24;
	public static final int EVERY_N_RECEIVING_YARDS = 129;
	public static final int EVERY_N_RECEPTIONS = 130;

	// miscellaneous offense
	public static final int KICKOFF_RETURN_TD_OFF = 25;
	public static final int PUNT_RETURN_TD_OFF = 26;
	public static final int FUMBLE_RECOVERY_TD = 27;
	public static final int EACH_FUMBLE = 28;
	public static final int EACH_FUMBLE_LOST = 29;
	public static final int EVERY_N_KICKOFF_RETURN_YARDS = 131;
	public static final int EVERY_N_PUNT_RETURN_YARDS = 132;

	// kicking
	public static final int EACH_PAT_MADE = 30;
	public static final int EACH_PAT_ATTEMPTED = 31;
	public static final int EACH_PAT_MISSED = 32;
	public static final int TOTAL_FG_MADE = 33;
	public static final int TOTAL_FG_ATTEMPTED = 34;
	public static final int TOTAL_FG_MISSED = 35;
	public static final int FG_MADE_0 = 36;
	public static final int FG_MADE_40 = 37;
	public static final int FG_MADE_50 = 38;
	public static final int FG_ATTEMPTED_0 = 39;
	public static final int FG_ATTEMPTED_40 = 40;
	public static final int FG_ATTEMPTED_50 = 41;
	public static final int FG_MISSED_0 = 42;
	public static final int FG_MISSED_40 = 43;
	public static final int FG_MISSED_50 = 44;

	// punting
	public static final int EVERY_PUNT = 45;
	public static final int EVERY_PUNTING_YARD = 46;
	public static final int PUNTS_INSIDE_10 = 47;
	public static final int PUNTS_INSIDE_20 = 48;
	public static final int BLOCKED_PUNTS = 49;
	public static final int PUNTS_RETURNED = 50;
	public static final int EVERY_RETURN_YARD_ALLOWED = 51;
	public static final int TOUCHBACKS = 52;
	public static final int FAIR_CATCHES = 53;
	public static final int PUNT_AVG_0 = 54;
	public static final int PUNT_AVG_34 = 55;
	public static final int PUNT_AVG_36 = 56;
	public static final int PUNT_AVG_38 = 57;
	public static final int PUNT_AVG_40 = 58;
	public static final int PUNT_AVG_42 = 59;
	public static final int PUNT_AVG_44 = 60;

	// individual defensive players
	public static final int INTERCEPTION_RETURN_TD_IDP = 61;
	public static final int FUMBLE_RETURN_TD_IDP = 62;
	public static final int BLOCKED_KICK_TD_IDP = 63;
	public static final int EACH_INTERCEPTION_IDP = 64;
	public static final int EACH_FUMBLE_RECOVERED_IDP = 65;
	public static final int EACH_FUMBLE_FORCED_IDP = 66;
	public static final int EACH_SAFETY_IDP = 67;
	public static final int EVERY_ASSISTED_TACKLE_IDP = 68;
	public static final int EVERY_SOLO_TACKLE_IDP = 69;
	public static final int EACH_STUFF_IDP = 70;
	public static final int PASSES_DEFENDED_IDP = 71;
	public static final int EVERY_N_SACKS = 133;
	public static final int EVERY_N_TOTAL_TACKLES = 134;

	// team defense / special teams
	public static final int EACH_KICKOFF_RETURN_YARD_DST = 72;
	public static final int EACH_PUNT_RETURN_YARD_DST = 73;
	public static final int EACH_SACK_DST = 74;
	public static final int EVERY_TOTAL_TACKLE = 75;
	public static final int INTERCEPTION_RETURN_TD_DST = 76;
	public static final int FUMBLE_RETURN_TD_DST = 77;
	public static final int KICKOFF_RETURN_TD_DST = 78;
	public static final int PUNT_RETURN_TD_DST = 79;
	public static final int BLOCKED_KICK_TD_DST = 80;
	public static final int BLOCKED_KICK_DST = 81;
	public static final int EACH_INTERCEPTION_DST = 82;
	public static final int EACH_FUMBLE_RECOVERED_DST = 83;
	public static final int EACH_FUMBLE_FORCED_DST = 84;
	public static final int EACH_SAFETY_DST = 85;
	public static final int EACH_STUFF_DST = 86;
	public static final int PASSES_DEFENDED_DST = 87;
	public static final int EVERY_POINT_ALLOWED_DST = 88;
	public static final int PA_0_DST = 89;
	public static final int PA_2_DST = 90;
	public static final int PA_7_DST = 91;
	public static final int PA_14_DST = 92;
	public static final int PA_18_DST = 93;
	public static final int PA_22_DST = 94;
	public static final int PA_28_DST = 95;
	public static final int PA_35_DST = 96;
	public static final int PA_46_DST = 97;
	public static final int EVERY_YARD_ALLOWED_DST = 98;
	public static final int YA_0_DST = 99;
	public static final int YA_100_DST = 100;
	public static final int YA_200_DST = 101;
	public static final int YA_300_DST = 102;
	public static final int YA_350_DST = 103;
	public static final int YA_400_DST = 104;
	public static final int YA_450_DST = 105;
	public static final int YA_500_DST = 106;
	public static final int YA_550_DST = 107;

	// head coach
	public static final int TEAM_WIN = 108;
	public static final int TEAM_LOSS = 109;
	public static final int TEAM_TIE = 110;
	public static final int EVERY_POINT_SCORED = 111;
	public static final int WIN_MARGIN_25 = 112;
	public static final int WIN_MARGIN_20 = 113;
	public static final int WIN_MARGIN_15 = 114;
	public static final int WIN_MARGIN_10 = 115;
	public static final int WIN_MARGIN_5 = 116;
	public static final int WIN_MARGIN_1 = 117;
	public static final int LOSS_MARGIN_1 = 118;
	public static final int LOSS_MARGIN_5 = 119;
	public static final int LOSS_MARGIN_10 = 120;
	public static final int LOSS_MARGIN_15 = 121;
	public static final int LOSS_MARGIN_20 = 122;
	public static final int LOSS_MARGIN_25 = 123;
}
