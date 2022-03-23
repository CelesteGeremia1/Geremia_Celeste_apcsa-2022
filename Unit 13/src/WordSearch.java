//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private String word;
    
    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int p = 0;
    	word = str;
    	for (int i = 0; i < size; i++) {
    		for (int k = 0; k < size; k++) {
    			m[i][k] = str.substring(p , p+1);
    			p++;
    		}
    	}
    	
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i < m.length -1; i++) {
    		for (int j = 0; j < m[1].length -1; j++) {
    			if (checkRight( word, i, j) || checkLeft(word, i, j) || 
    					checkUp(word, i, j) || checkDown(word, i, j) ||
    					checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) ||
    					checkDiagDownLeft(word, i, j) || checkDiagDownRight(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		int  count = 0;
		String need = "";
		for (int i = 0; i < w.length() ; i++) {
			need = "";
			need = need + w.charAt(i);
				
			if ( c + i >= m[1].length) {
				i = w.length();
			}
			else if (m[r][c + i].equals(need)) {
				count++;
			
			}
			
		}
		if (count == w.length()) {
			return true;
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int  count = 0;
		String need = "";
		for (int i = 0; i < w.length(); i++) {
			need = "";
			need = need + w.charAt(i);
			if ( c - i < 0) {
				i = w.length();
			}
			else if (m[r][c - i].equals(need)) {
				count++;
					
			}
		}
		if (count == w.length()) {
			return true;
		}
		
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int  count = 0;
		String need = "";
		for (int i = 0; i < w.length(); i++) {
			need = "";
			need = need + w.charAt(i);
			if ( r + i >= m[1].length) {
				i = w.length();
			}
			else if (m[r+i][c].equals(need)) {
				count++;
				
			}
		}
		if (count == w.length()) {
			return true;
		}	
		return false;

	}

	public boolean checkDown(String w, int r, int c)
   {
		int  count = 0;
		String need = "";
		for (int i = 0; i < w.length(); i++) {
			need = "";
			need = need + w.charAt(i);
			if ( r - i < 0) {
				i = w.length();
			}
			else if (m[r - i][c].equals(need)) {
				count++;
					
			}
		}
		if (count == w.length()) {
			return true;
		}	
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int  count = 0;
		String need = "";
		for (int i = 0; i < w.length(); i++) {
			need = "";
			need = need + w.charAt(i);
			if ( c + i >= 8 || r + i >= 8) {
				i = w.length();
			}
			else if (m[r + i][c + i].equals(need)) {
				count++;
					
			}
		}
		if (count == w.length()) {
			return true;
		}	
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int  count = 0;
		String need = "";
		for (int i = 0; i < w.length(); i++) {
			need = "";
			need = need + w.charAt(i);
			if ( c - i < 0 || r + i >= 8) {
				i = w.length();
			}
			else if (m[r + i][c - i].equals(need)) {
				count++;
				
			}
		}
		if (count == w.length()) {
			return true;
		}	
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int  count = 0;
		String need = "";
		for (int i = 0; i < w.length(); i++) {
			need = "";
			need = need + w.charAt(i);
			if ( c - i < 0 || r - i < 0) {
				i = w.length();
			}
			else if (m[r - i][c - i].equals(need)) {
				count++;
				
			}
		}
		if (count == w.length()) {
			return true;
		}	
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int  count = 0;
		String need = "";
		for (int i = 0; i < w.length(); i++) {
			need = "";
			need = need + w.charAt(i);
			if ( c + i >= 8 || r - i < 0) {
				i = w.length();
			}
			else if (m[r - i][c + i].equals(need)) {
				count++;
					
			}
		}
		if (count == w.length()) {
			return true;
		}	
		return false;
	}

    public String toString()
    {
 		if (isFound(word)) {
 			return word + " was found in the matrix";
 		}
    	return word + " was not found in the matrix";
    }
}
