//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		if (one > two && one > three && one > four) {
			return one;
		}
		else if (two > one && two > three && two > four) {
			return two;
		}
		else if (three > one && three > two && three > four) {
			return three;
		}
		return four;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + " ";
	}
}