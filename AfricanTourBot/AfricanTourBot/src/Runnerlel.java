import java.util.Scanner;
/**Kaitlyn Cao
 * January 2018
 * */
public class Runner {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Africa! I'm Amira and I'll be your tour guide :) What's your name? ");
		
		Scanner in =  new Scanner(System.in);
		
		String statement = in.nextLine();
		System.out.println("Nice to meet you " + statement + " !");
		System.out.println("Did you know that Africa has 54 countries?");
		statement = in.nextLine();

		if(statement.equals("yes"))
		{
			for(String str: countries)
			{
				System.out.println(str);
			}
		}

	}
	
	 static String[] countries = {"Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde", "Cameroon", "Central African Republic (CAR)", "Chad", "Comoros", "Democratic Republic of Congo", "Republic of Congo", "Cote d'Ivoire", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "Sao Tome and Pricipe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Swaziland", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe"};
}
