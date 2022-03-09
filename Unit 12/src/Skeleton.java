//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int howBig;
	//add a constructor
	public Skeleton() {
		name = "no name";
		howBig = 0;
	}
	public Skeleton(String n, int size) {
		name = n;
		howBig = size;
	}
	//add code to implement the Monster interface
	public boolean isBigger(Monster other) {
		if (other.getHowBig() < howBig) {
			return true;
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public boolean isSmaller(Monster other) {
		if (other.getHowBig() > howBig) {
			return true;
		}
		return false;
	}
	public int getHowBig() {
		return howBig;
	}
	public boolean namesTheSame(Monster other) {
		if (other.getName().equals(name)) {
			return true;
		}
		return false;	
	}
	
	//add a toString
	public String toString() {
		return name + " " + howBig;
	}
}

