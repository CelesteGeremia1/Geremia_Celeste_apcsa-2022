//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int k = 0;
		for (String word : sentence.split(" ")) {
			k++;
		}
		wordRay = new String[k];
		k = 0;
		for (String word : sentence.split(" ")) {
		
			wordRay[k] = word;
			k++;
		}
		sort();
	}

	public void sort()
	{
		for (int i = 0; i < wordRay.length; i++) {
			for  (int j = 0; j < wordRay.length -1; j++) {
				if (wordRay[j].charAt(0) > wordRay[j+1].charAt(0)) {
				String save = wordRay[j];
				wordRay[j] = wordRay[j+1];
				wordRay[j+1] = save;
				}
				if (wordRay[j].charAt(0) < wordRay[j+1].charAt(0)) {
					
				}
				else if (wordRay[j].charAt(0) == wordRay[j+1].charAt(0)) {
					for (int p = 0; p < wordRay[j].length() && p < wordRay[j+1].length(); p++) {
						if (wordRay[j].charAt(p) > wordRay[j+1].charAt(p)) {
							String save = wordRay[j];
							wordRay[j] = wordRay[j+1];
							wordRay[j+1] = save;
							p = wordRay[j].length();
							}
					}
				}
			}
		}
		
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < wordRay.length; i++) {
			output = output + wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}