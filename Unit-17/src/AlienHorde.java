//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class AlienHorde {

  private List<Alien> aliens;

  public AlienHorde(int size) {
    aliens = new ArrayList<Alien>();
    int x = 10;
    int y = 10;
    int xChange = 50;
    for (int i = 0; i < size; i++) {
      if (x >= 820 || x <= -20) {
        y += 40;
        xChange = -xChange;
      }
      aliens.add(new Alien(x, y, 1));
      if (xChange < 0) {
        aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
      }

      x += xChange;
    }
  }

  public void add(Alien al) {
    aliens.add(al);
  }

  public void drawEmAll(Graphics window) {
    for (Alien a : aliens) {
      a.draw(window);
    }
  }

  public void moveEmAll() {
    for (Alien a : aliens) {
      if (a.getX() >= 820 || a.getX() <= -20) {
        a.move("down");
        a.setSpeed(-a.getSpeed());
      }
      a.move("side");
    }
  }

  public void removeDeadOnes(List<Ammo> shots) {
    for (int i = 0; i < aliens.size(); i++) {
      for (int j = 0; j < shots.size(); j++) {
        Ammo shot = shots.get(j);
        Alien alien = aliens.get(i);
        if (
          shot.getX() <= alien.getX() + alien.getWidth() &&
          shot.getX() + shot.getWidth() >= alien.getX() &&
          shot.getY() <= alien.getY() + alien.getHeight() &&
          shot.getY() + shot.getHeight() >= alien.getY()
        ) {
          aliens.remove(i);
          shots.remove(j);
        }
      }
    }
  }

  public String toString() {
    return "";
  }
}