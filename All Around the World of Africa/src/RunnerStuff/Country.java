package RunnerStuff;

import java.util.ArrayList;

public class Country
{
	ArrayList<Integer> coordinates = new ArrayList<Integer>();
	String region = "";
	String countryName = "";
	
	public Country(String region, String countryName)
	{
		this.region = region;
		this.countryName = countryName;
	}
	
	public String getCountryName()
	{
		return this.countryName;
	}
	
	public String getRegion()
	{
		return this.region;
	}
	
	public ArrayList<Integer> getCoordinates()
	{
		return this.coordinates;
	}
}
