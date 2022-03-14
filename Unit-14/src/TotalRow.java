//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> sum = new ArrayList<Integer>();
    	
    	for (int r = 0; r < m.length; r++) {
    		int tempSum = 0;
    		for (int c = 0; c < m[r].length; c++) {
    			tempSum += m[r][c];
    		}
    		sum.add(tempSum);
    	}
    	
		return sum;
    }
}
