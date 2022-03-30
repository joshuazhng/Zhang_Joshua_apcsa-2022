//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10; 
		height = 10;
		color = Color.black;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.black;
	}
	
	public Block(int x, int y, int wd, int ht)
	{
		xPos = x;
		yPos = y;
		width = wd;
		height = ht;
		color = Color.black;
	}
	
	public Block(int x, int y, int wd, int ht, Color col)
	{
		xPos = x;
		xPos = y;
		width = wd;
		height = ht;
		color = col;
	}
	
   //add the other set methods
   public void setX(int x)
   {
	   xPos = x;
   }
   
   public void setY(int y)
   {
	   yPos = y;
   }
	
   public void setPos(int x, int y)
   {
	   xPos = x;
	   yPos = y;
   }
	
   public void setWidth(int wid)
   {
		width = wid;
   }
	
   public void setHeight(int ht)
   {
	   height = ht;
   }	   

   public void setColor(Color col)
   {
	   color = col;
   }
   
   public void draw(Graphics window)
   {
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block)obj;
		if (getX() == other.getX() && getY() == other.getY() && getWidth() == other.getWidth() && getHeight() == other.getHeight() && getColor().equals(other.getColor())) {
			return true;
		}
		return false;
	}   

   //add the other get methods
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Color getColor()
	{
		return color;
	}

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return xPos + "" + yPos + "" + width + "" + height + "" + color;
	}
}