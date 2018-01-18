import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.text.*;

public class CSVUtilities
{
	ArrayList<String> CSVWorldData = new ArrayList<String>();
	ArrayList<String> CSVUserData = new ArrayList<String>();
	int numColumns = 0;
	int numRows = 0;
	String username = "";
	String password = ""; 
	
	
	public void CSVUserUtilities(File csv)
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
	
	public void CSVWorldUtilities(File csv)
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
		
        
        sb.append(this.username);
        sb.append(',');
        sb.append(this.password);
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
				System.out.print(this.CSVWorldData.get(a) + "  ");
				a++;
			}
			System.out.println();
			
		}
	}

	
}