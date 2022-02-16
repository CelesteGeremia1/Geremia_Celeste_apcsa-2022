//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		getFirstChar();
		getLastChar();
		getBackWards();
		toString();
	}

	public Word(String s)
	{
		
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char first;
		first = word.charAt(0);
		return first;
	}

	public char getLastChar()
	{
		char last;
		last = word.charAt(word.length()-1);
		return last;
	}

	public String getBackWards()
	{
		String back="";
		for (int i = word.length()-1; i > 0;) {
			back = word.substring(i-1,i);
			
			i = i -1;
		}
		return back;
	}

 	public String toString()
 	{
 		return word + " backwards is " + getBackWards() + "its last character is " + getLastChar()
 		+ " and it's first character is "+ getFirstChar();
	}

}