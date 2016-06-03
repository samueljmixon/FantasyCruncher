
package parser;

import cruncher.*;
import java.io.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

public class Parser
{
	int myLeagueID;
	int mySeasonID;
	League parsedLeague;
	
	public Parser(int aLeagueID, int aSeasonID)
	{
		myLeagueID = aLeagueID;
		mySeasonID = aSeasonID;
		parsedLeague = new League();
	}
	
	public League parse() throws IOException
	{
		this.parseTeams();
		return (parsedLeague);
	}
	
	private void parseTeams() throws IOException
	{
		Document doc = Jsoup.connect("http://games.espn.go.com/ffl/standings?leagueId=" + myLeagueID + "&seasonId=" + mySeasonID).get(); 
		String text = doc.body().text();
		PrintWriter writer = new PrintWriter("file.txt", "UTF-8");
		writer.println(text);
		writer.close();
	}
}
