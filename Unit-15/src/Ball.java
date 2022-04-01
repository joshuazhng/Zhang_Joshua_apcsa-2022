//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int wid, int ht)
	{
		super(x, y, wid, ht);
		xSpeed = 3;
		xSpeed = 1;
	}
	
	public Ball(int x, int y, int wid, int ht, Color col)
	{
		super(x, y, wid, ht, col);
		xSpeed = 3;
		xSpeed = 1;
	}
	
	public Ball(int x, int y, int wid, int ht, int xSpd, int ySpd)
	{
		super(x, y, wid, ht);
		xSpeed = xSpd;
		xSpeed = ySpd;
	}
	
	public Ball(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	{
		super(x, y, wid, ht, col);
		xSpeed = xSpd;
		xSpeed = ySpd;
	}
	
   //add the set methods
   public void setXSpeed(int xSpd)
   {
	   xSpeed = xSpd;
   }
   
   public void setYSpeed(int ySpd)
   {
	   ySpeed = ySpd;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);
	   

      setX(getX()+xSpeed);
		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if (super.equals(other) && getXSpeed() == other.getXSpeed() && getYSpeed() == other.getYSpeed())
		{
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		return super.toString() + "xSpeed: " + xSpeed + "ySpeed: " + ySpeed;
	}
}