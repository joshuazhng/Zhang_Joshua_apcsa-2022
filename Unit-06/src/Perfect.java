//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
    public Perfect()
    {
    	setNum(0);
    }
    
    public Perfect(int num)
    {
    	setNum(num);
    }
   
	//add a set method
    public void setNum(int num)
    {
    	number = num;
    }
    
	public boolean isPerfect()
	{
		int num=1;
		int sum=0;
		while(num < number)
		{
			if (number % num == 0) {
				sum = sum + num;
			}
			num++;
		}
		if (sum == number) {
			return true;
		}
		return false;
	}

	//add a toString	
	public String toString()
	{
		return "";
	}
}