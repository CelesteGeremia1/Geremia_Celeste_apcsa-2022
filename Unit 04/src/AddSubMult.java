//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a > b) {
			double aBig = a - b;
			return aBig;
		}
		if (b > a) {
			double bBig = b -a;
			return bBig;
		}
		return b*a;
	}
	
}