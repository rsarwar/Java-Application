package RunnerStuff;

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
	
	public ArrayList<Country> getRegionsCountries()
	{
		return this.regionsCountries;
	}
	
	public String getRegionName()
	{
		return this.regionName;
	}

	
	public void addCountries(CSVWorldUtilities countryData)
	{
		//Junk is a placeholder for the names of the countries returned from searchRegion.
		
		List<String> junk = countryData.searchRegion(this.regionName);
		
		for(int i = 0; i < junk.size(); i++)
		{
			Country x = new Country(this.regionName, junk.get(i));
			regionsCountries.add(x);
		}
		
		
	}
	
	public void printNamesOfCountries()
	{
		for(int i = 0; i < this.getRegionsCountries().size(); i++)
		{	
			System.out.print(this.getRegionsCountries().get(i).getCountryName() + "  ");
		}
		System.out.println();
		
	}
}
