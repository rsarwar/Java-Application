package RunnerStuff;

import java.util.ArrayList;
/*
 * Miriam Monroe and Ramisha Sarwar
 */
public class Country
{
	private ArrayList<Integer> coordinates = new ArrayList<Integer>();
	private String region = "";
	private String countryName = "";
	private String countryInfo = "";
	
	public Country(String region, String countryName, String countryInfo )
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
	
	public String getCountryInfo()
	{
		return this.countryInfo;
	}
	

}
