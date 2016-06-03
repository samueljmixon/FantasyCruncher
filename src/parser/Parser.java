
package parser;

import java.io.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

public class Parser
{
	String text;
	
	public Parser(String homepage) throws IOException
	{
		Document doc = Jsoup.connect(homepage).get(); 
		text = doc.body().text();
	}
	
	public void parse() throws IOException
	{
		PrintWriter writer = new PrintWriter("file.txt", "UTF-8");
		writer.println(text);
		writer.close();
	}
}
