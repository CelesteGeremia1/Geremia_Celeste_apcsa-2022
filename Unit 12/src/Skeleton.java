//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public abstract class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int howBig;
	//add a constructor
	public Skeleton() {
		name = " no name";
		howBig = 0;
	}
	//add code to implement the Monster interface
	public void setName( String s) {
		name = s;
	}
	public String getName() {
		return name;
	}
	public void setSize( int num) {
		howBig = num;
	}
	public int getSize() {
		return howBig;
	}
	
	
	
	//add a toString
	
	public String toString() {
		return name + howBig;
	}
}