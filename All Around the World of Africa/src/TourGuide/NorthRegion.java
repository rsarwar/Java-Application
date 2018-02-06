package TourGuide;
/**Kaitlyn Cao
 * January 2018 
 **/
import java.util.Random;
import java.util.Scanner;

public class NorthRegion {
	int emotion = 0;	
	private Scanner input;
	public String greetUser()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the North region of Africa! I see you've met Leyla :D I'm Brendon :)");
		System.out.println("There are 7 different countries that can be found in this region.");
		for(String str: northC)
		{
			System.out.println(str);
		}		
		return "Which country intrigues?";

	}
	
	public String getResponse(String statement) {

		String response = "";
		Random r = new Random();
		if(statement.length() == 0)
		{
			response = "C'mon talk to me :'(";
		}
		else if(findKeyword(statement,"no") >= 0)
		{
			return facts[r.nextInt(facts.length)];
		}
		return response;
	}
	
	public String determineCountry(String statement)
	{	
		String response = "";
		statement = statement.trim();
		if(findKeyword(statement, "Algeria") >= 0)
		{
			NCountries chatbot6 = new NCountries();
			System.out.println(chatbot6.greetUser());
		}
		
		if(findKeyword(statement, "Egypt") >= 0)
		{
			response = "";
		}
		if(findKeyword(statement, "Libya") >= 0)
		{
			response = "";
		}
		if(findKeyword(statement, "Morocco") >= 0)
		{
			response = "";
		}
		//if(findKeyword(statement1, "Sudan") >= 0)
		{
			response = "";
		}
		//if(findKeyword(statement1, "Tunisia") >= 0)
		{
			response = "";
		}
		//if(findKeyword(statement1, "Western Sahara") >= 0)
		{
			response = "";
		}		
		return response;
	} 
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
	

	static String[] facts = {"North Africa is an economically prosperous area.", "This subregion generates one-third of Africa's total GDP"};
	static String[] northC = {"Algeria", "Egypt", "Libya", "Morocco", "Sudan", "Tunisia", "Western Sahara"};

	NCountries chatbot1 = new NCountries();
}
