//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				System.out.print(word.charAt(i));
			}
			System.out.println();
		}
	}
}