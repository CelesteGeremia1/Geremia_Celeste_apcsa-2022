//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees( long number )
	{
		int count = 0;
		int howMuch = 0;
		long numberChange = number;
		while (numberChange != 0) {
			numberChange = numberChange/10;
			howMuch++;
		}
		for (int i = 0; i < howMuch; i++) {
			
			if ((number % 10 == 3) && !(number < 10)) {
				
				count++;
				number = number/10;
			}
			else { 
				number = number/10;
			}
			

		}
		
		return count;
	}
}