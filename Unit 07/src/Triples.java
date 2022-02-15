//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   
	public Triples()
	{
		this(0);
		
	}

	public Triples(int num)
	{
		setNum(num);
		greatestCommonFactor( num,  num,  num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		
		String Out = " ";
		while (!(Out == "done")) {
		a = (int)((Math.random() * number) +1);
		b = (int)((Math.random() * number) +1);
		c = (int)((Math.random() * number) +1);
		if ((a*a) + (b*b) == (c*c)) {
			if (((a%2 == 0)&&(!((b&2) == 0))&&(!((c&2) == 0)))) {
				for (int i = 1; i < number; i++) {
					if (!((a%i == 0) && (b%i == 0) && (c%i == 0))) {
						Out = "false";
					}
				}
				if (!(Out == "false")) {
					Out = "done";
				}
			}
			else if (((b%2 == 0)&&(!((a&2) == 0)))&&(!((c&2) == 0))) {
				for (int i = 1; i < number; i++) {
					if (!((a%i == 0) && (b%i == 0) && (c%i == 0))) {
						Out = "false";
					}
				}
				if (!(Out == "false")) {
					Out = "done";
				}
			}
		}
		}
		
		System.out.println(a + b + c);
		return a & b & c;
	}

	public String toString()
	{
		String output="";
		greatestCommonFactor(number, number, number);
		




		return output+"\n";
	}
}