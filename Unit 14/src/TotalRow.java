//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int count = 0;
    	List<Integer> test;
    	test = new ArrayList<Integer>(m.length);
		
		for (int i = 0; i < m.length; i++) {
			count = 0;
			for(int j = 0; j < m[i].length; j++) {
				count = count + m[i][j];
			}
			test.add(count);
		}	
		return test;
		
		
    }
}
