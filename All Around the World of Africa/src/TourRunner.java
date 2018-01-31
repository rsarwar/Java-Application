

	import java.util.Scanner;
	/**Kaitlyn Cao
	 * January 2018
	 * */
	
	//http://pitt.libguides.com/c.php?g=12378&p=65814 USEFUL!! 
public class TourRunner {
		
		public static void main(String[] args)
		{
			System.out.println("Welcome to Africa! I'm Leyla and I'll be your tour guide :) What's your name? ");
			
			in = new Scanner(System.in);
			
			String statement = in.nextLine();
			System.out.println("Nice to meet you " + statement + "!");
			System.out.println("Did you know that Africa is broken down into 5 regions?");
			statement = in.nextLine();

			if(statement.equals("yes"))
			{
				System.out.println("Nice! What region would you like to talk about?");
			}
			if(statement.equals("no"))
			{ 
				for(String str: regions)
				{
					System.out.println(str);
				}
			}
			
			NorthRegion chatbot1 = new NorthRegion();
			EastRegion chatbot2 = new EastRegion();
			CentralRegion chatbot3 = new CentralRegion();
			WestRegion chatbot4 = new WestRegion();
			SouthRegion  chatbot5 = new SouthRegion();

			/*
			public String getResponse(String statement)
			{
				
			}			 
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
		 static String[] eastC = {"Burundi", "Comoros", "Djibouti", "Eritrea", "Ethiopia", "Kenya", "Madagascar", "Malawi", "Mauritius", "Réunion"};
		 static String[] centralC = {};
		 static String[] westC = {}; 
		 static String[] southC = {};
		 static String[] countries = {"Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde", "Cameroon", "Central African Republic (CAR)", "Chad", "Comoros", "Democratic Republic of Congo", "Republic of Congo", "Cote d'Ivoire", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "Sao Tome and Pricipe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Swaziland", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe"};
		private static Scanner in;
	}


