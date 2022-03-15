//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int)(Math.random() * 10 + 1);
			
		}
		
		shiftEm(array);
		return array;
	}
	public static void shiftEm(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7 && i > 0) {
				for (int j = 0; j < array.length; j++) {
					int temp = 0;
					if (array[j] != 7 && j < i) {
						temp = array[j];
						array[j] = array[i];
						array[i] = temp;
                        j = i;
					}
				}
			}
		}
		
	}
}