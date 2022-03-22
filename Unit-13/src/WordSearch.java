//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int i = 0;
    	for (int r = 0; r < size; r++) {
    		for (int c = 0; c < size; c++) {
    			m[r][c] = str.substring(i++, i); //i++ here means "use i, then increment it by one"
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	boolean found = false;
    	for (int r = 0; r < m.length; r++) {
    		for (int c = 0; c < m[r].length; c++) {
    			if (m[r][c] == word)
    				found = true;
    		}
    	}
    	return found;
    }

	public boolean checkRight(String w, int r, int c)
   {
		int i = 0;
		while (i < w.length())
		{
			if (c+i < 0 || c+i >= w.length())
				return false;
			if (!w.substring(i, i+1).equals(m[r][c+i])) //might be c+i
				return false;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int i = 0;
		while (i < w.length())
		{
			if (c-i < 0 || c-i >= w.length())
				return false;
			if (!w.substring(i, i+1).equals(m[r][c-i]))
				return false;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int i = 0;
		while (i < w.length())
		{
			if (r-i < 0 || r-i >= w.length())
				return false;
			if (!w.substring(i, i+1).equals(m[r+1][c]))
				return false;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int i = 0;
		while (i < w.length())
		{
			if (c-i < 0 || c+i >= w.length())
				return false;
			if (!w.substring(i, i+1).equals(m[r-1][c]))
				return false;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int i = 0;
		while (i < w.length())
		{
			if (r+i < 0 || r+i >= c)
				return false;
			if (!w.substring(i, i+1).equals(m[r-1][c+1]))
				return false;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int i = 0;
		while (i < w.length())
		{
			if (r+i < 0 || r+i >= c)
				return false;
			if (!w.substring(i, i+1).equals(m[r-1][c-1]))
				return false;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int i = 0;
		while (i < w.length())
		{
			if(c-i < 0 || c+i >= c && c-i <0 || c-i >= c)
				return false;
			if (!w.substring(i, i+1).equals(m[r+1][c-1]))
				return false;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int i = 0;
		while (i < w.length())
		{
			if(c+i < 0 || c+i >= c && c+i <0 || c-i >= c)
				return false;
			if (!w.substring(i, i+1).equals(m[r+1][c+1]))
				return false;
		}
		return true;
	}

    public String toString()
    {
 		return "checked";
    }
}
