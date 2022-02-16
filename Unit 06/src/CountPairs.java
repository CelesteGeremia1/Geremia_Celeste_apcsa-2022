//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i+1 <str.length()) {
				if(str.substring(i,i+1).equals(str.substring(i+1,i+2))) {
				count++;
			}
			}
			else if (i+1 >str.length()){
				if (str.substring(i-2,i-1).equals(str.substring(i-1,i))) {
					count++;
				}
			}

		}
		return count;
	}
}