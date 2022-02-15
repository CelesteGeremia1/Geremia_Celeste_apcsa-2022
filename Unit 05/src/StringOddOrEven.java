//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		
		
	}

	public StringOddOrEven(String s)
	{
		
	}

	public void setString(String s)
	{
		word = s; 
	}

 	public boolean isEven()
 	{
 		int stringLength = word.length();
		if (stringLength%2 == 0) {
		System.out.println(word + " is even");
		return true;
		}
		
		System.out.println(word + " is odd");
		return false;
		
 		
	}

 	public String toString()
 	{
 		String output="is";
 		if (isEven() == true) {
			 output = "is Even";
		}
 		else if (isEven()== false) {
			 output = "is Odd";
		}
		
 		return output;
	}
}