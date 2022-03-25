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
	
	public Ball( int x, int y)
	{
		super(200,200);
		xSpeed = x;
		ySpeed = y;
	}
	
   //add the set methods
   public void setXSpeed(int speed) {
		xSpeed = speed;
	}
	public void setYSpeed(int speed) {
		xSpeed = speed;
	}
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  Block test = new Block();
	  test.draw(window, Color.WHITE);
	   
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
      	
		//draw the ball at its new location
      test.setX(xSpeed + test.getX());
      test.setY(ySpeed + test.getY());
      
      test.draw(window);
      
   }
   
	public boolean equals(Object obj)
	{
		



		return false;
	}   

   
   //add a toString() method
	public String toString() {
		return xSpeed + "," + ySpeed;
		
	}


	
}