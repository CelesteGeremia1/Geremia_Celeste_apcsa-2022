//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{	
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter the first x point :: ");
		int x1 = keyboard.nextInt();
		
		out.print("Enter the first y point :: ");
		int y1 = keyboard.nextInt();
		
		out.print("Enter the second x point :: ");
		int x2 = keyboard.nextInt();
		
		out.print("Enter the second y point :: ");
		int y2 = keyboard.nextInt();
		
		Distance test = new Distance();
		test.setCoordinates(x1,  y1,  x2,  y2);
		test.calcDistance();
		test.print();
		//add test cases	
			
	}
}