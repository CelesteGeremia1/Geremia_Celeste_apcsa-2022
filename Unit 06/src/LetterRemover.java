//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		removeLetters();
		toString();
		
	}
	public LetterRemover(String s, char rem)
	{
		
		
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=" ";
		sentence = "how are you today";
		for (int i = 0; i < sentence.length(); i++) {
			if (!(sentence.charAt(i) == lookFor)) {
				cleaned = cleaned + sentence.substring(i, i+1);
			}
			
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " makes " + removeLetters();
	}
}