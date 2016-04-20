
package parser;

import java.io.*;
import java.net.*;
import java.util.*;

public class Parser
{

	public Parser()
	{
	}

	public ArrayList<String> readFile(URL aURL) throws IOException
	{
		String line = null;
		ArrayList<String> records = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(aURL.openStream()));
		while ((line = bufferedReader.readLine()) != null)
		{
			records.add(line);
		}
		bufferedReader.close();
		return (records);
	}
}
