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
public class CSVRegionUtilities implements CSVUtilities
{
	ArrayList<String> CSVUserData = new ArrayList<String>();
	int numColumns = 2;
	int numRows = 0;
	
	//Loads data from the CSV file and puts it in an ArrayList<String> called CSVUserData.
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
							//numColumns = attributes.length;
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
	
	//Testing method used to print all the data from the CSVUserData.
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
	
	//Returns an 
	public List<String> getDataString(int column)
	{
		ArrayList<String> x = new ArrayList<String>();
		int i = column+numColumns;
		while(i < numColumns*numRows)
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
	
	public String getInfoForRegion(String region)
	{
		int regionColumn = 0;
		int infoColumn = 1;
		
		List<String> a = this.getDataString(regionColumn);
		List<String> b = this.getDataString(infoColumn);
		//ArrayList<String> countries = new ArrayList<String>();
		
		for(int j = 0; j < a.size(); j++)
		{
			System.out.println(a.get(j));
			System.out.println(b.get(j));
			if(a.get(j).equals(region))
			{
				
				return b.get(j);			
			}
		}	
		return "That is not a region.";
		 
	}

	
}