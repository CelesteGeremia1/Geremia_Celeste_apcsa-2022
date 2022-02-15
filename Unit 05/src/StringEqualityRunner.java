//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{	
		String one = "ten";
		String two = "place";
		StringEquality test = new StringEquality();
		test.setWords(one, two);
		test.checkEquality();
		System.out.println(test.toString());
		
	}
}