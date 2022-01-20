//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		double value = Math.pow(xTwo-xOne, 2) + Math.pow(yOne-yTwo, 2);
		distance = Math.sqrt(value);
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		out.printf("distance == %.3f", distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}