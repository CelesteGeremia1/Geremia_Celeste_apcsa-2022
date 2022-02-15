//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		BiggestDouble test = new BiggestDouble(14.51, 6.17, 71.8, 1.0);
		System.out.println(test);
		System.out.println("biggest = " + test.getBiggest() + "\n");
		BiggestDouble other = new BiggestDouble(41.15, 816.7, 17.8, 19.0);
		System.out.println(other);
		System.out.println("biggest = " + other.getBiggest() + "\n");
		BiggestDouble moment = new BiggestDouble(884.5, 16.7, 7.8, 9.0);
		System.out.println(moment);
		System.out.println("biggest = " + moment.getBiggest() + "\n");
		//add more test cases
				
	}
}