//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		 pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot < pups.length) {
			Dog x = new Dog( age, name );
			pups[spot] = x;
		}
		
		
		
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int old = pups[0].getAge();
		String oldest = pups[0].getName();
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > old) {
				old = pups[i].getAge();
				oldest = pups[i].getName();
			}
		}
		return oldest;
	}

	public String getNameOfYoungest()
	{
		int young = pups[0].getAge();
		String youngest = pups[0].getName();
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < young) {
				young = pups[i].getAge();
				youngest = pups[i].getName();
			}
		}
		return youngest;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}