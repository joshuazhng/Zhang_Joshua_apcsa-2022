//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int[] ray;
	
	public RayOddToEven()
	{
		setRay(new int[]{0, 0});
	}
	
	public RayOddToEven(int[] inputRay)
	{
		setRay(inputRay);
	}
	
	public void setRay(int[] inputRay)
	{
		ray = inputRay;
	}
	
	public int go(int[] ray)
	{
		int oddIndex;
		int evenIndex;
		for (int i = 0; i < ray.length; i++)
		{
			if (ray[i] % 2 != 0) {
				oddIndex = i;
				for (int odd = i; odd < ray.length; odd++)
				{
					if (ray[odd] % 2 == 0) {
						evenIndex = odd;
						return evenIndex-oddIndex;
					}
				}
			}
		}
		return -1;
	}
}