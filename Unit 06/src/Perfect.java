//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   isPerfect();
	   toString();
   }
   public Perfect(int num) {
	   
   }
	//add a set method
   public void setNumber(int num) {
	   number = num;
	   
   }

	public boolean isPerfect()
	{
		int i = 1;
		int count = 0;
		while (i < number) {
			if (number%i == 0) {
				count = count + i;
				i++;
			}
			else {
				i++;
			}
		}
		if (count == number) {
			return true;
		}
		else return false;
	}

	//add a toString	
	public String toString() {
		System.out.println(number);
		System.out.println(isPerfect());
		isPerfect();
		String output = " ";
		if (isPerfect() == true) {
			output = number + "is perfect";
		}
		else if (isPerfect() == false){	
		output = number + "is not perfect";
		}
		return output;
	}
}