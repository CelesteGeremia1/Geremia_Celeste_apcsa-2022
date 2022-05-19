//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;

import javax.imageio.ImageIO;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private boolean ammo;

	
    private AlienHorde horde;
	private Bullets shots;
	private Ammo ammos;
	

	private boolean[] keys;
	private BufferedImage back;
	
	private int score;
	private int accuracy;
	private int counter;
	private int orignalSize;
	private int secondsToSleep;
	
	private int lives;
	private PowerUp up;
	
	boolean RUNNING;
	
	public OuterSpace()
	{
		keys = new boolean[5];
		
		RUNNING = true;
		
		setBackground(Color.black);

		alienOne = new Alien();
		
		horde = new AlienHorde(20);
		
		ship = new Ship(350,500,50,50,2);
		
		shots = new Bullets();
		
		ammo = false;
		
		score = 0;
		
		accuracy = 100;
		
		up = new  PowerUp(400,300,40,40);
		
		orignalSize = horde.getAliens().size();
		
		counter = 0;
		
		lives = 1;
		
		alienTwo = new Alien();
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }
   
   public static void wait(int ms)
   {
       try
       {
           Thread.sleep(ms);
       }
       catch(InterruptedException ex)
       {
           Thread.currentThread().interrupt();
       }
   }
   
   public boolean collision() {
	   Rectangle2D a = new Rectangle(ship.getX(), ship.getY(), ship.getWidth(), ship.getHeight());
	   
	   for (Alien b : horde.getAliens()) {
		   if (a.intersects(new Rectangle(b.getX(), b.getY(), b.getWidth(), b.getHeight()))) {
			   lives--;
			   return true;
		   }
	   }
	   return false;
   }
   
   public boolean collisionUP() {
	   Rectangle2D a = new Rectangle(ship.getX(), ship.getY(), ship.getWidth(), ship.getHeight());
		   if (a.intersects(new Rectangle(up.getX(), up.getY(), up.getWidth(), up.getHeight()))) {
			   lives = 2;
			   System.out.println(lives);
			   up.setX(2000);
			   up.setY(2000);
			   return true;
	   }
	   return false;
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.WHITE);
		graphToBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.drawString("Accuracy : " + accuracy + "%" , 400, 50);
		graphToBack.drawString("Score : " + score, 600, 50);
		
		//alienTwo.draw(graphToBack);
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		horde.moveEmAll();
		shots.drawEmAll(graphToBack);
		up.draw(graphToBack);
		
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("DOWN");
		}
		if(keys[3] == true)
		{
			ship.move("UP");
		}
		if (keys[4] == true) 
		{
			accuracy = (int)(score/(double)counter * 100);
			
			shots.moveEmAll();
			shots.cleanEmUp();
			counter++;
			
			
			ammo = true;
			keys[4] = false;  
			repaint();
			
		}
		
		if (counter == 0) {
			accuracy = 100;
		}
		
		if (shots.getList().size() > 0) {
			
			int amount = horde.getAliens().size();
			horde.removeDeadOnes(shots.getList());
			if (horde.getAliens().size() < amount) {
				score++;
			}
			
			
		}
		
		if (score >= orignalSize ) {
			graphToBack.setColor(new Color( 0, 151 , 50));
			graphToBack.fillRect(0, 0, 800, 600);
			graphToBack.setColor(Color.WHITE);

			graphToBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
			graphToBack.drawString("YOU WIN!", 275, 300);
			graphToBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			graphToBack.drawString("Score : " + score, 335, 350);
			graphToBack.drawString("Accuracy : " + accuracy + "%", 335, 400);
		}
		
		if (collisionUP()) {
			ship.changeImage();
		}
		
		
		
		//add code to move Ship, Alien, etc.
		if ( ammo == true) {
			shots.moveEmAll();
			
		}
		
		for (int i = 0; i < horde.getAliens().size(); i++) {
			 if (horde.getAliens().get(i).getY() > 450) {
				 	graphToBack.setColor(new Color (233, 30 , 30));
					graphToBack.fillRect(0, 0, 800, 600);
					graphToBack.setColor(Color.WHITE);

					graphToBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
					graphToBack.drawString("Game Over! Loser", 300, 300);
					graphToBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
					graphToBack.drawString("Score : " + score, 370, 350);
					
					ship.setY(1000);
					
					lives = 0;
			 }
		}
		
		if (lives == 1) {
			ship.changeImageBACK();
		}
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		if (collision() && ship.getY() < 1000 ) {
			ship.setX(350);
			ship.setY(500);
		}
		if ((ship.getY() >= 1000 - ship.getSpeed()) || lives <= 0) {
				graphToBack.setColor(new Color (233, 30 , 30));
				graphToBack.fillRect(0, 0, 800, 600);
				graphToBack.setColor(Color.WHITE);

				graphToBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
				graphToBack.drawString("Game Over! Loser", 300, 300);
				graphToBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
				graphToBack.drawString("Score : " + score, 370, 350);
				
				ship.setY(1000);
				
				lives = 0;
			}
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			shots.cleanEmUp();
			if (shots.getList().size() == 0) {
				shots.add(new Ammo(ship.getX() + 20, ship.getY(), 3));
				keys[4] = true;
			}
			
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

