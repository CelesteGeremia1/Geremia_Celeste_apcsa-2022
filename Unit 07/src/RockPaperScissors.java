//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

import java.sql.Array;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		determineWinner();
		toString();
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		
		
	}

	public void setPlayers(String player)
	{
		String[] choice = {"R", "P", "S"};
		int num = (int)(Math.random() * 2) + 1;
		playChoice = 	player;
		compChoice =  choice[num];
	}

	public String determineWinner()
	{
		String winner=" ";
		if (playChoice == "R") {
			winner = "count";
		}
		if (((compChoice == "R") && (playChoice == "R"))||((compChoice == "P") && (playChoice == "P"))
				||((compChoice == "S") && (playChoice == "S"))) {
			winner = "Draw";
		}
		else if ((compChoice == "R") && (playChoice == "S")||((compChoice == "P") && (playChoice == "R"))||
				((compChoice == "S") && (playChoice == "P"))) {
			winner = "Computer";
		}
		else if (((compChoice == "S") && (playChoice == "R"))||((compChoice == "P") && (playChoice == "S"))
				||((compChoice == "R") && (playChoice == "P"))) {
			winner = "Player";
			
		}
		return winner;
		
		
	}

	public String toString()
	{

		String output="";
		output = determineWinner();
		
		if (output == "Draw") {
			return "Player had: " + playChoice + "\n" + "Computer had: " + compChoice
			+"\n" + "It was a Draw";
		}
		else if (output == "Player")	{
			return "Player had: " + playChoice + "\n" + "Computer had: " + compChoice
					+"\n" + "!Player wins";
		}	
			return "Player had: " + playChoice + "\n" + "Computer had: " + compChoice
					+"\n" + "!Computer wins";
	}
}