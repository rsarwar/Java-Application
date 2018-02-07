package TourGuide;

//https://www.youtube.com/watch?v=rYRpiTyZ09k
import java.util.Scanner;
import java.util.Random;

/**Kaitlyn Cao
	 * January 2018  
	 **/
	 
	//http://pitt.libguides.com/c.php?g=12378&p=65814 USEFUL!! 
public class TourRunner {
	
	public String name = "";
	int emotion = 0;
	
		public static void main(String[] args)
		{
			System.out.println("Welcome to Africa! I'm Leyla and I'll be your tour guide :) 			What's your name?");
			
			in = new Scanner(System.in);

			String name = in.next();
			System.out.println("Nice to meet you " + name + "!");
			System.out.println("Did you know that Africa is broken down into 5 regions?");
			
			String statement = in.nextLine();
			statement = in.nextLine();


			
			if(statement.toLowerCase().equals("yes"))
			{
				System.out.println("Nice! What region would you like to talk about?");
				statement = in.nextLine();
				
				
				if(statement.toLowerCase().equals("north"))
				{
					NorthRegion chatbot1 = new NorthRegion();
					while(!statement.equals("Bye"))
					{
						System.out.println(chatbot1.greetUser());
						statement = in.nextLine();
						System.out.print(chatbot1.getResponse(statement));
						statement=in.nextLine();
					}
			
					
					
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
					SouthRegion chatbot5 = new SouthRegion();
					System.out.println(chatbot5.greetUser());
				}			
			}
			
			
			if(statement.toLowerCase().equals("no"))
			{ 
				System.out.println("These are the regions Africa is broken into: ");
				for(String str: regions)
				{
					System.out.println(str);
				}
				System.out.println("Where would you like to go?");
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
			 //getResponse(statement);	

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
		 
		public String getResponse(String statement)
		{
			String response = "";
			if(statement.length() == 0)
			{
				response = "C'mon talk to me :(";
			}
			else if (findKeyword(statement, "music") >= 0)
			{
				response = "Music is timeless :)";
				emotion++;
			}
			
			return response;
		}
		
		private String getRandomResponse()
		{
			Random r = new Random();
			if(emotion == 0)
			{
				return neutralResponses[r.nextInt(neutralResponses.length)];
			}
			return happyResponses[r.nextInt(happyResponses.length)];

		}
		
		private String[] neutralResponses = {"Huh?", "Same", "Wat ._."};
		private String[] happyResponses = {};
		/**
		 * Search for one word in phrase. The search is not case
		 * sensitive. This method will check that the given goal
		 * is not a substring of a longer string (so, for
		 * example, "I know" does not contain "no").
		 *
		 * @param statement
		 *            the string to search
		 * @param goal
		 *            the string to search for
		 * @param startPos
		 *            the character of the string to begin the
		 *            search at
		 * @return the index of the first occurrence of goal in
		 *         statement or -1 if it's not found
		 */
		private int findKeyword(String statement, String goal,
				int startPos)
		{
			String phrase = statement.trim().toLowerCase();
			goal = goal.toLowerCase();

			// The only change to incorporate the startPos is in
			// the line below
			int psn = phrase.indexOf(goal, startPos);

			// Refinement--make sure the goal isn't part of a
			// word 
			while (psn >= 0) 
			{
				// Find the string of length 1 before and after
				// the word
				String before = " ", after = " ";
				if (psn > 0)
				{
					before = phrase.substring(psn - 1, psn);
				}
				if (psn + goal.length() < phrase.length())
				{
					after = phrase.substring(
							psn + goal.length(),
							psn + goal.length() + 1);
				}

				// If before and after aren't letters, we've
				// found the word
				if (((before.compareTo("a") < 0) || (before
						.compareTo("z") > 0)) // before is not a
												// letter
						&& ((after.compareTo("a") < 0) || (after
								.compareTo("z") > 0)))
				{
					return psn;
				}

				// The last position didn't work, so let's find
				// the next, if there is one.
				psn = phrase.indexOf(goal, psn + 1);

			}

			return -1;
		}
		
		/**
		 * Search for one word in phrase.  The search is not case sensitive.
		 * This method will check that the given goal is not a substring of a longer string
		 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
		 * @param statement the string to search
		 * @param goal the string to search for
		 * @return the index of the first occurrence of goal in statement or -1 if it's not found
		 */
		private int findKeyword(String statement, String goal)
		{
			return findKeyword (statement, goal, 0);
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


