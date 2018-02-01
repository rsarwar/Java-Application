package TourGuide;

//https://www.youtube.com/watch?v=rYRpiTyZ09k
import java.util.Scanner;
	/**Kaitlyn Cao
	 * January 2018
	 * 
	 * */
	
	//http://pitt.libguides.com/c.php?g=12378&p=65814 USEFUL!! 
public class TourRunner {
		
	public String name = "";
		public static void main(String[] args)
		{
			System.out.println("Welcome to Africa! I'm Leyla and I'll be your tour guide :) What's your name? ");
			
			in = new Scanner(System.in);

			String name = in.next();
			String statement = in.nextLine();
			System.out.println("Nice to meet you " + name + "!");
			System.out.println("Did you know that Africa is broken down into 5 regions?");
			
			
			statement = in.nextLine();


			
			if(statement.toLowerCase().equals("yes"))
			{
				System.out.println("Nice! What region would you like to talk about?");
				statement = in.nextLine();
				
				
				if(statement.toLowerCase().equals("north"))
				{
					NorthRegion chatbot1 = new NorthRegion();
					System.out.println(chatbot1.greetUser());
					
					/*
					while(!statement.equals("Bye"))
					{
						System.out.println(chatbot2.);
					}
					*/
				}
				
				if(statement.toLowerCase().equals("east"))
				{
					EastRegion chatbot2 = new EastRegion();
					System.out.println(chatbot2.greetUser());
				}
				
				if(statement.toLowerCase().equals("central"))
				{
					CentralRegion chatbot3 = new CentralRegion();
					System.out.println(chatbot3.greetUser());
				}
				
				if(statement.toLowerCase().equals("west"))
				{
					WestRegion chatbot4 = new WestRegion();
					System.out.println(chatbot4.greetUser());
				}
				
				if(statement.toLowerCase().equals("south"))
				{
					SouthRegion  chatbot5 = new SouthRegion();
					System.out.println(chatbot5.greetUser());
				}			
			}
			
			
			if(statement.equals("no"))
			{ 
				for(String str: regions)
				{
					System.out.println(str);
				}
			}
			
			/*
			if(statement.equals("yes"))
			{
				for(String str: countries)
				{
					System.out.println(str);
				}
			}
			*/
		}
		
		 static String[] regions = {"North", "East", "Central", "West", "South"};
		 static String[] northC = {"Algeria", "Egypt", "Libya", "Morocco", "Sudan", "Tunisia", "Western Sahara"};
		 static String[] eastC = {"Burundi", "Comoros", "Djibouti", "Eritrea", "Ethiopia", "Kenya", "Madagascar", "Malawi", "Mauritius", "Réunion", "Rwanda", "Seychelles", "Somalia", "Somaliland", "Tanzania", "Uganda"};
		 static String[] centralC = {"Cameroon", "Central African Republic", "Chad", "Congo Republic - Brazzaville", "Democratic Republic of Congo", "Equatorial Guinea", "Gabon","" , "São Tomé & Principe"};
		 static String[] westC = {"Benin", "Burkina Faso", "Cape Verde", "Côte D'Ivoire", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Liberia", "Mali", "Mauritania", "Niger", "Nigeria", "Saint Helena", "Senegal", "Sierra Leone", "Togo"};
		 static String[] southC = {"Angola", "Botswana", "Lesotho", "Mozambique", "Namibia", "South Africa", "Swaziland", "Zambia", "Zimbabwe"}; 
		 static String[] countries = {"Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde", "Cameroon", "Central African Republic (CAR)", "Chad", "Comoros", "Democratic Republic of Congo", "Republic of Congo", "Cote d'Ivoire", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "Sao Tome and Pricipe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Swaziland", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe"};
		private static Scanner in;
	}


