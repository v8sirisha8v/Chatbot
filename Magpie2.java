public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk, do you have a pet?";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
		if (!(statement.length() > 0))
		{
		  response = "... Please respond";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Aww ... that's too bad. Since this a pet chatbot, I don't have any questions for you. Bye!";
		}
    else if (statement.indexOf("yes") >= 0)
    {
      response = "What type of pet do you have?";
    }

    else if (statement.indexOf("dog") >= 0)
    {
      response = "That's every person's dream! Is the dog a girl or a boy?";
    }

    else if (statement.indexOf("dog") >= 0)
    {
      response = "That's every person's dream! Is the dog a girl or a boy?";
    }

    else if (statement.indexOf("cow") >= 0)
    {
      response = "That's a legen-dairy pet! Do you have a farm or do you keep you're cow in you're house?";
    }

    else if (statement.indexOf("farm") >= 0)
    {
      response = "Awesome, that's cool that you have a farm! How big is you're cow(big medium, small)?";
    }

    else if (statement.indexOf("house") >= 0)
    {
      response = "You'll probably need a little bit more room for him! How big is you're cow(big medium, small)?";
    }


    else if (statement.indexOf("chicken") >= 0)
    {
      response = "That's egg-cellent! Do you have chicks or adult chickens?";
    }

    else if (statement.indexOf("chicks") >= 0)
    {
      response = "Aww, they must be so cute! How big are they (big medium, small)?";
    }

    else if (statement.indexOf("adult chickens") >= 0)
    {
      response = "Cool! Hopefully they don't keep waking you up in the morning! How big are they (big medium, small)?";
    }

    else if (statement.indexOf("snake") >= 0)
    {
      response = "That's cool, almost kind of scaly! Does you're snake eat rodents or insects?";
    }

    else if (statement.indexOf("rodent") >= 0)
    {
      response = "Dang, that's seems pretty difficult to do! How big is you're snake (big, medium, small)?";
    }

    else if (statement.indexOf("insect") >= 0)
    {
      response = "Phew, a lot more easier than feeding rodents. How big is you're snake (big, medium, small)?";
    }

    else if (statement.indexOf("lizard") >= 0)
    {
      response = "That's kind of a boring pet not gonna lie. Anyways, do you have a cage or a terrarium for you're lizard?";
    }

     else if (statement.indexOf("pig") >= 0)
    {
      response = "Whoa, that's kind of a pig deal! Do you're pigs stay inside or outside?";
    }

    else if (statement.indexOf("inside") >= 0)
    {
      response = "Coolio, just make sure they have a rooting area outside as well! How big is you're pig (big, medium, small)?";
    }

    else if (statement.indexOf("outside") >= 0)
    {
      response = "Good job, they'll have plenty of space!How big is you're pig (big, medium, small)?";
    }

    else if (statement.indexOf("cage") >= 0)
    {
      response = "Nice! Chameleons usually enjoy wired cages, so maybe you have a chameleon. How big is you're lizard (big, medium, small)?";
    }

    else if (statement.indexOf("terrarium") >= 0)
    {
      response = "Nice! Geckos usually enjoy terrarium's, so maybe you have a gecko. How big is you're lizard (big, medium, small)?";
    }

    else if (statement.indexOf("boy") >=0|| statement.indexOf("girl") >=0)
    {
      response = "Cool! I wish I had a dog. How big is you're dog (big, medium, small)?";
    }

    else if (statement.indexOf("cat") >= 0 )
    {
      response = "That's cool, I heard that they're pretty easy to take care of, which does it like to do more, sleep or eat ";
    }
    
    else if (statement.indexOf("sleep")>=0)
    {
      response = "Oh that seems relaxing ... sleeping all day, I was also wondering, what is the size of your cat. (is it big, small, or medium)";
    }
    

    else if (statement.indexOf("eat")>=0)
    {
      response = "I can relate, I'm always hungry, I was also wondering, what is the size of your cat. (is it big, small, or medium)";
    }
    
    else if (statement.indexOf("fish")>=0)
    {
      response = "I heard that they're hard to take care of, good luck! Do you have an aquarium or a bowl?";
    }
    
    else if (statement.indexOf("aquarium")>=0)
    {
      response = "Wow, it must be beautiful! What's the size of you're fish (big, medium, small)?";
    } 

    else if (statement.indexOf("bowl")>=0)
    {
      response = "Get a bigger space for you're fish, you're fish deserves better >:( What's the size of you're fish (big, medium, small)?";
    } 

    else if (statement.indexOf("bird")>=0)
    {
      response = "Do you feed them with more seeds or vegetables?";
    }

    else if (statement.indexOf("vegetables")>=0)
    {
      response = "Good job, keep them healthy! What's the size of you're bird (big, medium, small)";
    }

    else if (statement.indexOf("seeds")>=0)
    {
      response = "Give them some more vegetables, all seed diets can be high in fat! What's the size of you're bird (big, medium, small)?";
    }
		
    
		else if(statement.indexOf("big") >= 0)
		{
		  response = "Wow! It must require a lot of care!";
		}
		else if(statement.indexOf("small") >= 0)
		{
		  response = "Coolio, that's adorable, how many years old are they?";
		}
    else if(statement.indexOf("medium") >= 0)
		{
		  response = "Must be fun to take care of, how many years old are they?";
		}
    else if (statement.indexOf("1") >= 0)
    {
      response = "Aw, they're so young!";
    }
     else if (statement.indexOf("2") >= 0)
    {
      response = "Aw, they're so young!";
    }
     else if (statement.indexOf("3") >= 0)
    {
      response = "Aw, they're so young!";
    }
     else if (statement.indexOf("4") >= 0)
    {
      response = "Aw, they're so young!";
    }
     else if (statement.indexOf("5") >= 0)
    {
      response = "Aw, they're so young!";
    }
     else if (statement.indexOf("6") >= 0)
    {
      response = "Wow! Amazing";
    }
     else if (statement.indexOf("7") >= 0)
    {
      response = "wow! Amazing";
    }
     else if (statement.indexOf("8") >= 0)
    {
      response = "Wow, they're getting old!";
    }
     else if (statement.indexOf("9") >= 0)
    {
      response = "Wow, they're getting old!";
    }
     else if (statement.indexOf("10") >= 0)
    {
      response = "Wow, they're getting old!";
    }
   //add more responces before saying goobye to the user  
	
		else
		{
			response = getRandomResponse();
		}
		return response;
		
		
		
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 8;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if(whichResponse == 4)
		{
		  response = "Wow";
		}
		else if(whichResponse == 5)
		{
		  response = "Huh, really?";
		}
    else if(whichResponse == 6)
		{
		  response = "You're lying, right?";
		}
    else if(whichResponse == 7)
		{
		  response = "Tell me more...";
		}

		return response;
	}
}