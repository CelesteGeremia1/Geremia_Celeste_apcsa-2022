//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int count = 0;
    	int count2 = 0;
    	for  (int i = 0; i < m.length; i++) {
    		count = count + m[0][i];
    	}
    	for  (int i = 0; i < m[0].length; i++) {
    		count2 = count2 + m[1][i];
    	}
    	List<Integer> test = null;
    	test.add( count);
    	test.add(count2);
		return test;
    }
}
