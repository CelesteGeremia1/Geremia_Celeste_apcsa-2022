//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		 double divison = minutes / 60;
		 double totalHours = divison + hours;
		mph = distance/totalHours;
		
	}

	public void print()
	{
		System.out.println(mph);
		System.out.println(minutes);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}