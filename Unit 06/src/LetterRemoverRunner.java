//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String s = "how are you today";
		System.out.println("Set Sentence: " + s);
		char rem = 'a';
		System.out.println("Remover is: " + rem);
		//add test cases		
		LetterRemover test = new LetterRemover();
		test.setRemover(s, rem);
		System.out.println(test.toString());
		
	}
}