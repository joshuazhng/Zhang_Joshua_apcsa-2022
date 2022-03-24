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
    	for (int r = 0; r < m.length; r++) {
    		for (int c = 0; c < m[r].length; c++) {
    			if (checkRight(word, r, c) || checkLeft(word, r, c) || checkUp(word, r, c)  || checkDown(word, r, c)  || checkDiagUpRight(word, r, c)  || checkLeft(word, r, c)  || checkDiagDownLeft(word, r, c)  || checkDiagDownRight(word, r, c)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

    public boolean checkRight(String w, int r, int c)
    {
		int index = 0;
		if (m[r].length <= c + w.length()) {
			return false;
		}
		for (int i = c; i < c + w.length(); i++) {
			if (!m[r][i].equals(w.charAt(index) + "")) {
				return false;
			}
			index++;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int index = 0;
		if (c - w.length() < 0) {
			return false;
		}
		for (int i = c; i > c - w.length(); i--) {
			if (!m[r][i].equals(w.charAt(index) + "")) {
				return false;
			}
			index++;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int index = 0;
		if (r - w.length() < 0) {
			return false;
		}
		for (int i = r; i > r - w.length(); i--) {
			if (!m[i][c].equals(w.charAt(index) + "")) {
				return false;
			}
			index++;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int index = 0;
		if (m.length <= r + w.length()) {
			return false;
		}
		for (int i = r; i < r + w.length(); i++) {
			if (!m[i][c].equals(w.charAt(index) + "")) {
				return false;
			}
			index++;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int index = 0;
		int j = r;
		
		if (m[r].length <= c + w.length() || r - w.length() < 0) {
			return false;
		}
		for (int i = c; i < c + w.length(); i++) {
			if (!m[j][i].equals(w.charAt(index) + "")) {
				return false;
			}
			j--;
			index++;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int index = 0;
		int j = r;
		
		if (c - w.length() < 0 || r - w.length() < 0) {
			return false;
		}
		for (int i = c; i > c - w.length(); i--) {
			if (!m[j][i].equals(w.charAt(index) + "")) {
				return false;
			}
			j--;
			index++;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int index = 0;
		int j = r;
		
		if (c - w.length() < 0 || m.length <= r + w.length()) {
			return false;
		}
		for (int i = c; i > c - w.length(); i--) {
			if (!m[j][i].equals(w.charAt(index) + "")) {
				return false;
			}
			j++;
			index++;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int index = 0;
		int j = r;
		
		if (m[r].length <= c + w.length() || r - w.length() < 0) {
			return false;
		}
		for (int i = c; i < c + w.length(); i++) {
			if (!m[j][i].equals(w.charAt(index) + "")) {
				return false;
			}
			j++;
			index++;
		}
		return true;
	}

    public String toString()
    {
    	String matrix = "";
    	for (int r = 0; r < m.length; r++) {
    		for (int c = 0; c < m[r].length; c++) {
    			matrix += m[r][c] + " ";
    		}
    		matrix += "\n";
    	}
 		return matrix;
    }
}
