 //(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(5,5,30,30,1);
	}

	public Alien(int x, int y)
	{
		super(x,y);
	}

	public Alien(int x, int y, int s)
	{
		super(x,y);
		speed = s;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/images/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.print("failed");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}


   public void move(String direction)
	{

	   if (direction.equals("DOWN")) {
		  if(getX() < 0 || getX() > 750) {
			  speed = -speed; 
			  setY(getY() + 60);
		  }
		  setX(getX() + speed);
	   }

	}

	public void draw( Graphics window )
	{
   	
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
