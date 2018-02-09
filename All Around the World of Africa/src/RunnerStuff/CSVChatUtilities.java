package RunnerStuff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/*
 * Miriam Monroe and Ramisha Sarwar
 */
public class CSVChatUtilities implements CSVUtilities
{
	ArrayList<String> CSVChatData = new ArrayList<String>();
	int numColumns = 0;
	int numRows = 0;
	
	
	public void CSVUtilities(File csv)
	{
			FileReader reader = null;
			BufferedReader filein = null;
			try
			{
				reader = new FileReader(csv);
				filein = new BufferedReader(reader);
				try
				{
					String line = filein.readLine();
					
						while (line != null)
						{ 						
							String[] attributes = line.split(",");
							numColumns = attributes.length;
							for(int x = 0; x < numColumns; x++ )
							{
								CSVChatData.add(attributes[x]);
							}
							numRows++;
							line = filein.readLine(); 
						}
				}
				
				catch (IOException ioe)
				{
		            ioe.printStackTrace();
		        }	
			}

		catch (FileNotFoundException fnfe)
		{
			System.out.println("ERROR: File not found!");
		}

	} 
	
	public void writeCSV(File file, String dataString)
	{
		PrintWriter pw = null;
		try
		{
			pw = new PrintWriter(file);
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e);
		}
		StringBuilder sb = new StringBuilder();
		
        for(int i = 0; i < CSVChatData.size(); i++)
        {
        	sb.append(CSVChatData.get(i));
        	sb.append(',');
        	if(i%2 == 0 ) 
        	{
        		sb.append('\n');
        	}
        }
        
        sb.append(dataString);
        sb.append('\n');
        
        
        
        pw.write(sb.toString());
        pw.close();
        //System.out.println("done!");
	}
	
	public void printData()
	{
		int y = this.numColumns;
		int z = this.numRows;
		int a = 0;
		int b = y * z;
		while(a < b)
		{
			for(int i = 0; i < y; i++)
			{	
				if(a < CSVChatData.size())
				{
					System.out.print(this.CSVChatData.get(a) + "  ");					
				}
				a++;
			}
			System.out.println();
			
		}
	}
	
	public List<String> getDataString(int column)
	{
		ArrayList<String> x = new ArrayList<String>();
		int i = column+numColumns;
		while(i < numColumns*numRows-1)
		{	
			String y = CSVChatData.get(i);
			x.add(y);
			i = i+numColumns;
		}
		return x;
		 
	}

	public List<Integer> getDataInt(int column)
	{
		ArrayList<Integer> x = new ArrayList<Integer>();
		int i = column+numColumns;
		while(i < numColumns*numRows)
		{	
			int y = Integer.parseInt(CSVChatData.get(i));
			x.add(y);
			i = i+numColumns;
		}
		return x;
	}
	
	@Override
	public List<Double> getDataDouble(int column)
	{
		ArrayList<Double> x = new ArrayList<Double>();
		int i = column+numColumns;
		while(i < numColumns*numRows)
		{	
			double y = Double.parseDouble(CSVChatData.get(i));
			x.add(y);
			i = i+numColumns;
		}
		return x;
	}

	
}