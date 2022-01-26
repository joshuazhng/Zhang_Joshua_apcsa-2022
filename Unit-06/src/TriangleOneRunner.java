//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne test = new TriangleOne();
		//add test cases
		test.setWord("hippo");
		test.print();
		out.println("\n");
		
		test.setWord("abcd");
		test.print();
		out.println("\n");
		
		test.setWord("it");
		test.print();
		out.println("\n");
		
		test.setWord("a");
		test.print();
		out.println("\n");
		
		test.setWord("chicken");
		test.print();
	}
}