package RunnerStuff;
import RunnerStuff.CSVWorldUtilities;

import java.util.ArrayList;
import java.util.List;
/*
 * Miriam Monroe and Ramisha Sarwar
 */
public class Region 
{
	private ArrayList<Country> regionsCountries = new ArrayList<Country>();
	private String regionName = "";
	
	public Region(/*ArrayList<Country> regionsCountries,*/ String regionName)
	{
		//this.regionsCountries = regionsCountries;
		this.regionName = regionName;
	}
	
	//Returns the list of countries in the region.
	public ArrayList<Country> getRegionsCountries()
	{
		return this.regionsCountries;
	}
	
	
	//Returns name of the region.	
	public String getRegionName()
	{
		return this.regionName;
	}

	
	//Adds countries to the region class in the regionsCountries ArrayList.
	public void addCountries(CSVWorldUtilities africaData)
	{
		int countryColumn = 0;
		int infoColumn = 6;
		
		List<String> searchedCountries = africaData.searchRegion(this.regionName);
		List<String> countryList  = africaData.getDataString(countryColumn);
		List<String> infoList = africaData.getDataString(infoColumn);
		
		System.out.println(infoList);
		
		for(int i = 0; i < searchedCountries.size(); i++)
		{
			Country x = new Country(this.regionName, searchedCountries.get(i));
			
			regionsCountries.add(x);
		}
		
		for(int j = 0; j < countryList.size()-2; j++)
		{
			for(int k = 0; k < regionsCountries.size(); k++)
			{
				if(countryList.get(j).equals(regionsCountries.get(k).getCountryName()))
				{
						regionsCountries.get(k).updateInfo(infoList.get(j));
						System.out.println(infoList.get(j));
				}
			}
		}
		
	}
	
	
	// A testing function used to print the names of all the countries from the Region's country array.
	public void printNamesOfCountries()
	{
		for(int i = 0; i < this.getRegionsCountries().size(); i++)
		{	
			System.out.print(this.getRegionsCountries().get(i).getCountryName() + "  ");
		}
		System.out.println();
		
	}
	
	//P
	public void printInfoOfCountries()
	{
		for(int i = 0; i < this.getRegionsCountries().size(); i++)
		{	
			System.out.print(this.getRegionsCountries().get(i).getCountryInfo() + "  ");
		}
		System.out.println();
		
	}
	
	
	}
