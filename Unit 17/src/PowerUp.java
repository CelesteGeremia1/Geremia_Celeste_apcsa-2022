//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class PowerUp extends MovingThing
{
	private Image image;
	private int speed;

	public PowerUp(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		try
		{
			URL url = getClass().getResource("/images/pu.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.print("ship fail");
		}
	}
	
	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return 0;
	}

	public void move(String direction) {
		
		
	}
}
