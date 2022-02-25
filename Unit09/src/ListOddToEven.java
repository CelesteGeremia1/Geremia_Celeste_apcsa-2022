//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	
	
	public ListOddToEven( ) {
		
	}
	public void setArrayList( List<Integer> stuff) {
		 List<Integer> ray = new ArrayList<Integer>();
	}
	public int add(List<Integer> ray) {
		int num = 0;
		int counter = 0;
		if (!go(ray)) {
			return -1;
		}
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i)%2 == 1) {
				num = i;
				i = ray.size();
			}
		}
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i)%2 == 0) {
				counter = i;
			}
		}
		if (num - counter < 0) {
			return -1;
		}
		return num;
	}
	
	public static boolean go( List<Integer> ray )
	{
		int count = 0;
		int moment = 0;
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i)%2 == 0) {
				count ++;
			}
		}
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i)%2 == 1) {
				moment ++;
			}
		}
		if ( count > 0 && moment > 0) {
			return true;
		}
		
		return false;
	}
}