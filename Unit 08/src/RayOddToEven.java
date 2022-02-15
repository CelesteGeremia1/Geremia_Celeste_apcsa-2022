//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddNum = 0;
		int evenNum = 0;
		for ( int i = 0; i < ray.length; i++) {
			if (ray[i]%2 == 1) {
				oddNum = i;
				
				i = ray.length;
				for ( int j = i; j < ray.length; j++) {
					if (ray[j]%2 == 0) {
						evenNum = j;
						j = ray.length;
						}
					}
			}
		}
		
		if (oddNum == 0 || evenNum == 0) {
			return -1;
		}
		return oddNum + evenNum;
	}
}