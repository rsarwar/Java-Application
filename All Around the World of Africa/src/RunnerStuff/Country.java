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
	
	public Country(String region, String countryName)
	{
		this.region = region;
		this.countryName = countryName;
	}
	
	//Returns name of the country.
	
	public String getCountryName()
	{
		return this.countryName;
	}
	
	//Returns the region the country is in.
	
	public String getRegion()
	{
		return this.region;
	}
	
	//Unused method.
	
	public ArrayList<Integer> getCoordinates()
	{
		return this.coordinates;
	}
	
	//Returns info of the country.
	
	public String getCountryInfo()
	{
		return this.countryInfo;
	}
	
	//Takes in a parameter of a String newInfo to update the coutnryInfo variable.
	
	public void updateInfo(String newInfo)
	{
		this.countryInfo = newInfo;
	}
	

}
