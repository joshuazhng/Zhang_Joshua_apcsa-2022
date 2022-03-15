//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		int lucky7[] = new int[size];
		for (int i = 0; i < lucky7.length; i++) {
			lucky7[i] = (int)(Math.random()*10);
		}
		return lucky7;
	}
	
	public static void shiftEm(int[] array)
	{
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				int temp = array[count];
				array[count++] = 7;
				array[i] = temp;
			}
		}
	}
}