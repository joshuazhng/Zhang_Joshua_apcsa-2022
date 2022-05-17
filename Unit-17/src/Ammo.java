//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {

	  private int speed;

	  public Ammo() {
	    this(0, 0, 0);
	  }

	  public Ammo(int x, int y) {
	    this(x, y, 0);
	  }

	  public Ammo(int x, int y, int s) {
	    super(x, y);
	    speed = s;
	  }

	  public void setSpeed(int s) {
	    speed = s;
	  }

	  public int getSpeed() {
	    return speed;
	  }

	  public void draw(Graphics window) {
	    //add code to draw the ammo
	    window.setColor(Color.YELLOW);
	    window.fillRect(getX(), getY(), getWidth(), getHeight());
	  }

	  public void move(String direction) {
	    //add code to draw the ammo
	    switch (direction) {
	      case "up":
	        setY(getY() - speed);
	        break;
	      case "down":
	        setY(getY() + speed);
	        break;
	      case "left":
	        setX(getX() - speed);
	        break;
	      case "right":
	        setX(getX() + speed);
	        break;
	    }
	  }

	  public String toString() {
	    return "";
	  }
	}