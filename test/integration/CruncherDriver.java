
package integration;

import cruncher.*;

public class CruncherDriver
{
	public static void main(String[] args)
	{
		Team sam = new Team("Round Down for What");
		
		Player foles = new Player("Nick Foles", Player.QB);
		foles.addStat(Stats.WEEK_1, Stats.TD_PASSES, 2);
		Player mccoy = new Player("LeSean McCoy", Player.RB);
		mccoy.addStat(Stats.WEEK_1, Stats.TD_RUSHES, 1);
		
		sam.addPlayer(foles, Stats.WEEK_1);
		sam.addPlayer(mccoy, Stats.WEEK_1);
		
		System.out.println(sam);
		
		double[] array =
		{
			0.04,
			4.0,
			-2.0,
			2.0,
			0.1,
			6.0,
			2.0,
			0.1,
			6.0,
			2.0,
			6.0,
			6.0,
			6.0,
			-2.0,
			1.0,
			-1.0,
			3.0,
			4.0,
			5.0,
			6.0,
			6.0,
			6.0,
			6.0,
			2.0,
			1.0,
			6.0,
			2.0,
			2.0,
			1.0,
			2.0,
			0.0,
			0.0
		};
		
		ScoringConfiguration standard = new ScoringConfiguration(array);
		
		System.out.println("Foles: " + standard.computeScore(foles, Stats.WEEK_1));
		System.out.println("McCoy: " + standard.computeScore(mccoy, Stats.WEEK_1));
	}
}
