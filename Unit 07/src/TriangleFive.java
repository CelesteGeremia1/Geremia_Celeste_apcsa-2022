//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		toString();
	}

	public TriangleFive(char c, int amt)
	{
		
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < amount; i++) {
			output = output + " ";
			for (int a = 0; a < amount; a++) {
				output = output + (char)(letter);
			}
			output = output + " ";
			for (int b = 0; (b < amount - 1)&&(i + 1 < amount); b++ ) {
				if ((letter + 1) >= 91) {
					output = output + 'A';
				}
				else 
				output = output + (char)(letter + 1);
			}
			output = output + " ";
			for (int c = 0; (c < amount - 2)&&(i + 2 < amount); c++ ) {
				if ((letter + 1) >= 91) {
					output = output + 'B';
				}
				else
				output = output + (char)(letter + 2);
			}
			output = output + " ";
			for (int d = 0; (d < amount - 3)&&(i + 3 < amount); d++ ) {
				if ((letter + 1) >= 91) {
					output = output + 'C';
				}
				else
				output = output + (char)(letter + 3);
			}
			output = output + " ";
			for (int e = 0; (e < amount - 4)&&(i + 4 < amount); e++ ) {
				if ((letter + 1) >= 91) {
					output = output + 'E';
				}
				else
				output = output + (char)(letter + 4);
			}
			output = output + " ";
			for (int f = 0; (f < amount - 2)&&(i + 5 < amount); f++ ) {
				if ((letter + 1) >= 91) {
					output = output + 'F';
				}
				else
				output = output + (char)(letter + 5);
			}
			output = output + " ";
			for (int g = 0; (g < amount - 2)&&(i + 6 < amount); g++ ) {
				if ((letter + 1) >= 91) {
					output = output + 'G';
				}
				else
				output = output + (char)(letter + 6);
			}
			output = output + " ";
			for (int h = 0; (h < amount - 2)&&(i + 7 < amount); h++ ) {
				if ((letter + 1) >= 91) {
					output = output + 'H';
				}
				else
				output = output + (char)(letter + 7);
			}
			output = output + " ";
			for (int j = 0; (j < amount - 2)&&(i + 8 < amount); j++ ) {
				if ((letter + 1) >= 91) {
					output = output + 'I';
				}
				else
				output = output + (char)(letter + 8);
			}
			output = output + "\n";
			}
		return output;
	}
}