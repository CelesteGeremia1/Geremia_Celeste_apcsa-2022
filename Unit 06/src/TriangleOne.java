//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		print();
	}

	public TriangleOne(String s)
	{
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		String wordFinish = " ";
		for (int i = 0; i < word.length(); i++) {
			wordFinish = word.substring(0,word.length()-i);
			System.out.println(wordFinish);
		}
	}
}