//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] testList1 = {{1,2,3},{5,5,5,5}};
		int[][] testList2 = {{1,2,3},{5},{1},{2,2}};
		int[][] testList3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(testList1));
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(testList2));
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(testList3));
	}
}



