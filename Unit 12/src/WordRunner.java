//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		String[] list = new String[size];
		for (int i = 0; i < size; i++) {
			String testing = file.nextLine();
			list[i] = testing;
		}
		
		for (int i = 0; i < list.length; i++) {
				int spot = i;
				Word test = new Word(list[spot]);
			for (int j = i; j < list.length; j++) {
				test = new Word(list[spot]);
				Word test2 = new Word(list[j]);
				if( test.compareTo(test2)> 0) {
					spot = j;
				}
				else if (test.compareTo(test2) == 0) {
					if(test.toString().charAt(0) > test2.toString().charAt(0)) {
						spot = j;
					}
				}
			}
			String save = list[i];
			list[i] = test.toString();
			list[spot] = save;
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	


	}
}
