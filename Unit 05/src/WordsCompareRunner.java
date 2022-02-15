//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare test = new WordsCompare();
	   String one = "apple";
	   String two = "donut";
		//add test cases
	   test.setWords(one, two);
	   test.compare();
	   System.out.println(test.toString());
	}
}