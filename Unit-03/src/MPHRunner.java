//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test1 = new MilesPerHour(dist, hrs, mins);
		test1.calcMPH();
		test1.print();
		out.println("\n\n\n\n\n");
		
		//add more test cases
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour test2 = new MilesPerHour(dist, hrs, mins);
		test2.calcMPH();
		test2.print();
		out.println("\n\n\n\n\n");
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour test3 = new MilesPerHour(dist, hrs, mins);
		test3.calcMPH();
		test3.print();
		out.println("\n\n\n\n\n");
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour test4 = new MilesPerHour(dist, hrs, mins);
		test4.calcMPH();
		test4.print();
	}
}