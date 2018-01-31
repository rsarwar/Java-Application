import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWorldUtilities
{
	ArrayList<String> CSVWorldData = new ArrayList<String>();
	int numColumns = 0;
	int numRows = 0;
	
	public CSVWorldUtilities(File csv)
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
								CSVWorldData.add(attributes[x]);
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
				System.out.print(this.CSVWorldData.get(a) + "  ");
				a++;
			}
			System.out.println();
			
		}
	}
	
	public List<String> getDataString(int column)
	{
		ArrayList<String> x = new ArrayList<String>();
		int i = column+numColumns;
		while(i < numColumns*numRows)
		{	
			String y = CSVWorldData.get(i);
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
			int y = Integer.parseInt(CSVWorldData.get(i));
			x.add(y);
			i = i+numColumns;
		}
		return x;
	}
	
	public List<Double> getDataDouble(int column)
	{
		ArrayList<Double> x = new ArrayList<Double>();
		int i = column+numColumns;
		while(i < numColumns*numRows)
		{	
			double y = Double.parseDouble(CSVWorldData.get(i));
			x.add(y);
			i = i+numColumns;
		}
		return x;
	}
	
	public List<String> searchRegion(String region)
	{
		int countryColumn = 1;
		int regionColumn = 2;
		
		List<String> a = this.getDataString(countryColumn);
		List<String> b = this.getDataString(regionColumn);
		ArrayList<String> countries = new ArrayList<String>();
		
		for(String x : a)
		{
			if()
		}
		
		
		int i = countryColumn+numColumns;
		while(i < numColumns*numRows)
		{	
			String y = CSVWorldData.get(i);
			int z = 
			if(y.equals(region))
			{
				countries.add(y);
			}
			
			i = i+numColumns;
		}
		return countries;
		 
	}

	
}