//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double time = (double)(minutes/60.0) + hours;
		mph = distance/time;
	}

	public void print()
	{
		System.out.println();
		System.out.printf("%d miles in ", distance);
		System.out.printf("%d hour and ", hours);
		System.out.printf("%d minutes = ", minutes);
		System.out.printf("%.0f MPH.", mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}