//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for (String name : toys.split(" ")) {
			Toy t = getThatToy( name);
			if (t == null) 
			{
				toyList.add( new Toy( name ));
			}
			else {
				t.setCount(t.getCount() + 1);
			}
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for ( Toy t : toyList) {
  			if ( t.getName().equals( nm)) {
  				return t;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String toyMost = " ";
  		int count = 0;
  		for (int i = 0; i < toyList.size(); i++) {
  			if (toyList.get(i).getCount() > count) {
  				count = toyList.get(i).getCount();
  				toyMost = toyList.get(i).getName();
  			}
  			
  		}
  		return toyMost;
  	}  
  
  	public void sortToysByCount()
  	{
  		int count = 0;
  		int need = toyList.size();
  		Toy adding = toyList.get(0);
  		ArrayList<Toy> newList = null;
  		for (int i = 0; i < need; i++) {
  			count = 0;
  			for (int j = 0; j < need; j++) {
  	  			if (toyList.get(j).getCount() > count) {
  	  				count = toyList.get(j).getCount();
  	  				adding = toyList.get(j);
  	  			}
  	  		}
  			newList.add(adding);
  			toyList.remove(adding);
  		}
  		toyList = newList;
  	}  
  	  
	public String toString()
	{
	   return "[" + toyList + "]";
	}
}