
package integration;

import cruncher.*;

public class CruncherDriver
{
	public static void main(String[] args)
	{
		Team sam = new Team("Round Down for What");
		Team garrett = new Team("Windy City Wolf Pack");
		
		Player foles = new Player("Nick Foles", Player.QB);
		foles.addStat(Stats.WEEK_1, Stats.TD_PASSES, 2);
		Player mccoy = new Player("LeSean McCoy", Player.RB);
		mccoy.addStat(Stats.WEEK_1, Stats.TD_RUSHES, 1);
		Player luck = new Player("Andrew Luck", Player.QB);
		luck.addStat(Stats.WEEK_1, Stats.TD_PASSES, 1);
		Player bradshaw = new Player("Ahmad Bradshaw", Player.RB);
		bradshaw.addStat(Stats.WEEK_1, Stats.TD_RUSHES, 1);
		
		sam.addPlayer(foles, Stats.WEEK_1);
		sam.addPlayer(mccoy, Stats.WEEK_1);
		garrett.addPlayer(luck, Stats.WEEK_1);
		garrett.addPlayer(bradshaw, Stats.WEEK_1);
		
		System.out.println(sam);
		System.out.println(garrett);
	}
}
