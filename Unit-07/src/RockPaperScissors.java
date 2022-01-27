//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		int comp = (int)Math.random()*3;
		switch (comp) {
			case 0: compChoice = "R";
					break;
			case 1: compChoice = "P";
					break;
			case 2: compChoice = "S";
					break;
		}
		
		if (playChoice == "R") {
			if (compChoice == "P")
				winner += "Computer";
			if (compChoice == "S")
				winner += "Player wins <<Rock Breaks Scissors>>";
			else
				winner += "Draw Game!";
		}
		
		if (playChoice == "P") {
			if (compChoice == "S")
				winner += "Computer";
			if (compChoice == "R")
				winner += "Player wins <<Paper Covers Rock>>";
			else
				winner += "Draw Game!";
		}
		
		if (playChoice == "S") {
			if (compChoice == "R")
				winner += "Computer wins <<Rock Breaks Scissors>>";
			if (compChoice == "P")
				winner += "Player wins";
			else
				winner += "Draw Game!";
		}
		
		return winner;
	}

	public String toString()
	{
		
		String output="player had " + playChoice + "\n" + "computer had " + compChoice;
		output = output + "\n!" + determineWinner() + "!\n";
		return output;
	}
}