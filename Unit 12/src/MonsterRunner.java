//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String s = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int num = keyboard.nextInt();
		//instantiate monster one
		Monster skeleton1  = new Skeleton(s , num);
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		 s = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		 num = keyboard.nextInt();
		//instantiate monster two
		 Monster skeleton2  = new Skeleton(s , num);
		 
		 System.out.println("Monster 1 - " + skeleton1.toString());
		 System.out.println("Monster 2 - " + skeleton2.toString());
		 
		 if (skeleton1.isBigger(skeleton2)) {
			 System.out.println("Monster one is bigger than Monster two.");
		 }
		 if (skeleton1.isSmaller(skeleton2)) {
			 System.out.println("Monster one is smaller than Monster two.");
		 }
		 if (skeleton1.namesTheSame(skeleton2)) {
			 System.out.println("Monster one does have the same name as Monster two"); 
		 }
		 if (!skeleton1.namesTheSame(skeleton2)){
			 System.out.println("Monster one does not the same name as Monster two");
		 }
		}
	}
}
