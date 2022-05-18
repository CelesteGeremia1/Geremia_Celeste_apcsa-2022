//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		int diff = 75;
		int x = 0;
		int y = 60;
		int sped = 1;
		for (int i = 0; i < size; i++) {
			aliens.add(new Alien(x,y,50,50,sped));
			
			//0 - 800 (x)
			//0 - 600 (y)
			x+=diff;
			
			if (x > 750) {
				x = 750;
				y += 60;
				diff = -diff;
				sped = -sped;
				
			}
			else if ( x < 0) {
				x = 0;
				y += 60;
				diff = -diff;
				sped = -sped;
			}
			
			
			
			
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a: aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (int i = 0; i < aliens.size(); i++) {
			Alien a = aliens.get(i);
			a.move("DOWN");
				
		}
	}
	
	public List<Alien> getAliens() {
		return aliens;
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		int count = 0;
		
		for (int i = 0; i < shots.size(); i++) {
			Ammo am = shots.get(i);
			for (int j = 0; j < aliens.size(); j++) {
				if (Math.abs(aliens.get(j).getX() - am.getX()) < 20) {
					if (Math.abs(aliens.get(j).getY() - am.getY()) < 20) {
						aliens.remove(j);
						shots.remove(am);
						
					}
				}
			}
			
		}
	}

	public String toString()
	{
		return "";
	}

}
