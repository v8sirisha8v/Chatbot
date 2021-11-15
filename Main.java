import java.util.Scanner;
//the chatbot project is asking if you have a pet
/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class Main
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}

	}

}