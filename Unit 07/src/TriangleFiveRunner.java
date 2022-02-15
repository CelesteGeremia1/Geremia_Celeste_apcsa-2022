//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   char c; 
	   int amt;
	   TriangleFive test = new TriangleFive();
	   test.setLetter('C');
	   test.setAmount(4);
	   System.out.print(test);
	   test.setLetter('A');
	   test.setAmount(5);
	   System.out.print("\n" + test);
	   test.setLetter('B');
	   test.setAmount(7);
	   System.out.print("\n" + test);
	   test.setLetter('Z');
	   test.setAmount(8);
	   System.out.print("\n" + test);
	}
}