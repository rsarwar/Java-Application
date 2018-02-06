package RunnerStuff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVUserUtilities implements CSVUtilities
{
	ArrayList<String> CSVUserData = new ArrayList<String>();
	int numColumns = 0;
	int numRows = 0;
	String username = "";
	String password = ""; 
	
	
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
								CSVUserData.add(attributes[x]);
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
	
	public boolean checkUserPass()
	{
		int passColumn = 2;
		
		List<String> userPasses = this.getDataString(passColumn);
		for(int i = 0; i < userPasses.size(); i++)
		{
			if(userPasses.get(i) == this.password)
			{
				return true;
			}
		}
		return false;
	}
	
	public void writeCSV(File file)
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
		
        for(int i = 0; i < CSVUserData.size(); i++)
        {
        	sb.append(CSVUserData.get(i));
        	sb.append(',');
        	if(i%2 == 0 ) 
        	{
        		sb.append('\n');
        	}
        }
        
        sb.append(this.username);
        sb.append(',');
        sb.append(this.password);
        sb.append('\n');
        
        
        
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
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
				if(a < CSVUserData.size())
				{
					System.out.print(this.CSVUserData.get(a) + "  ");					
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
			String y = CSVUserData.get(i);
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
			int y = Integer.parseInt(CSVUserData.get(i));
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
			double y = Double.parseDouble(CSVUserData.get(i));
			x.add(y);
			i = i+numColumns;
		}
		return x;
	}

	
}