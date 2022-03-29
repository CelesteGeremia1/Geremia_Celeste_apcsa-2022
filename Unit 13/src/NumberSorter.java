//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown
	 

	private static int getNumDigits(int number)
	{
		int nums = number;
		int i = 0;
		while (nums != 0) {
			nums = nums/10;
			i++;
		}
		return i;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int nums = number;
		for (int k = 0; k < getNumDigits(number) ; k++) {
			//System.out.println(nums%10 + " hey ");
			sorted[k] = nums%10;
			nums = nums/10;
		}
		for (int i = 0; i < getNumDigits(number); i++) {
			for (int p = 0; p < getNumDigits(number); p++) {
				if (sorted[i] < sorted[p]) {
					int save = sorted[p];
					sorted[p] = sorted[i];
					sorted[i] = save;
				}
			}
		}
		return sorted;
	}
}