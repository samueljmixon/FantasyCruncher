
package integration;

import cruncher.*;

public class CruncherDriver
{
	public static void main(String[] args)
	{
		Team sam = new Team("Round Down for What");
		
		Player foles = new Player("Nick Foles", Player.QB);
		foles.addStat(Stats.WEEK_1, Stats.TD_PASSES, 2);
		foles.addStat(Stats.WEEK_1, Stats.EACH_PASSING_YARD, 254);
		foles.addStat(Stats.WEEK_1, Stats.EVERY_N_PASSING_YARDS, 254);
		foles.addStat(Stats.WEEK_2, Stats.TD_PASSES, 1);
		foles.addStat(Stats.WEEK_2, Stats.EACH_PASSING_YARD, 308);
		foles.addStat(Stats.WEEK_2, Stats.EVERY_N_PASSING_YARDS, 308);
		Player mccoy = new Player("LeSean McCoy", Player.RB);
		mccoy.addStat(Stats.WEEK_1, Stats.TD_RUSHES, 1);
		mccoy.addStat(Stats.WEEK_1, Stats.EACH_RUSHING_YARD, 109);
		mccoy.addStat(Stats.WEEK_1, Stats.EVERY_N_RUSHING_YARDS, 109);
		Player lynch = new Player("Marshawn Lynch", Player.RB);
		lynch.addStat(Stats.WEEK_2, Stats.TD_RUSHES, 3);
		lynch.addStat(Stats.WEEK_2, Stats.EACH_RUSHING_YARD, 123);
		lynch.addStat(Stats.WEEK_2, Stats.EVERY_N_RUSHING_YARDS, 123);
		
		sam.addPlayer(foles, Stats.WEEK_1);
		sam.addPlayer(mccoy, Stats.WEEK_1);
		sam.addPlayer(foles, Stats.WEEK_2);
		sam.addPlayer(lynch, Stats.WEEK_2);
		
		System.out.println(sam);

		ScoringConfiguration custom = new ScoringConfiguration();
		custom.addScoringValue(Stats.EACH_PASSING_YARD, 0.04);
		custom.addScoringValue(Stats.EACH_RUSHING_YARD, 0.1);
		custom.addScoringValue(Stats.TD_PASSES, 4.0);
		custom.addScoringValue(Stats.TD_RUSHES, 6.0);
		
		ScoringConfiguration standard = new ScoringConfiguration();
		standard.addScoringValue(Stats.EVERY_N_PASSING_YARDS, 1.0);
		standard.addScoringValue(Stats.EVERY_N_RUSHING_YARDS, 1.0);
		standard.addScoringValue(Stats.TD_PASSES, 4.0);
		standard.addScoringValue(Stats.TD_RUSHES, 6.0);
		standard.addScoringValue(ScoringConfiguration.PASSING_YARDS_N, 25);
		standard.addScoringValue(ScoringConfiguration.RUSHING_YARDS_N, 10);
		
		System.out.println("Foles: " + custom.computeScore(foles,
				Stats.WEEK_1));
		System.out.println("McCoy: " + custom.computeScore(mccoy,
				Stats.WEEK_1));
		System.out.println("Foles: " + custom.computeScore(foles,
				Stats.WEEK_2));
		System.out.println("Lynch: " + custom.computeScore(lynch,
				Stats.WEEK_2));
		
		System.out.println();
		
		System.out.println("Foles: " + standard.computeScore(foles,
				Stats.WEEK_1));
		System.out.println("McCoy: " + standard.computeScore(mccoy,
				Stats.WEEK_1));
		System.out.println("Foles: " + standard.computeScore(foles,
				Stats.WEEK_2));
		System.out.println("Lynch: " + standard.computeScore(lynch,
				Stats.WEEK_2));
	}
}
