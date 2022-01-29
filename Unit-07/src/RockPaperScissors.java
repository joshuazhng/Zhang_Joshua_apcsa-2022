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
		
		switch ((int)Math.random()*3)
		{
		case 0: compChoice = "R";
				break;
		case 1: compChoice = "P";
				break;
		case 2: compChoice = "S";
				break;
		}	
	}

	public String determineWinner()
	{
		String winner = "";
		
		switch (playChoice)
		{
		case "R":
		case "r":
			if (compChoice.equalsIgnoreCase("P"))
				winner += "Computer wins <<Paper Covers Rock>>";
			else if (compChoice.equalsIgnoreCase("S"))
				winner += "Player wins <<Rock Breaks Scissors>>";
			else if (compChoice.equalsIgnoreCase(playChoice))
				winner += "Draw Game";
			break;
		case "P":
		case "p":
			if (compChoice.equalsIgnoreCase("S"))
				winner += "Computer wins <<Scissors Cuts Paper>>";
			else if (compChoice.equalsIgnoreCase("R"))
				winner += "Player wins <<Paper Covers Rock>>";
			else if (compChoice.equalsIgnoreCase(playChoice))
				winner += "Draw Game";
			break;
		case "S":
		case "s":
			if (compChoice.equalsIgnoreCase("P"))
				winner += "Player wins <<Scissors Cuts Paper>>";
			else if (compChoice.equalsIgnoreCase("R"))
				winner += "Computer wins <<Rock Breaks Scissors>>";
			else if (compChoice.equalsIgnoreCase(playChoice))
				winner += "Draw Game";
			break;
		default:
			winner += "Invalid Input";
		}
		
		/*if (playChoice.equals(compChoice))
			winner += "Draw Game";
		else if (playChoice.equals("R")) {
			if (compChoice.equals("P"))
				winner += "Computer wins <<Paper Covers Rock>>";
			else if (compChoice.equals("S"))
				winner += "Player wins <<Rock Breaks Scissors>>";
		}
		else if (playChoice.equalsIgnoreCase("P")) {
			if (compChoice.equalsIgnoreCase("S"))
				winner += "Computer wins <<Scissors Cuts Paper>>";
			else if (compChoice.equalsIgnoreCase("R"))
				winner += "Player wins <<Paper Covers Rock>>";
		}
		else if (playChoice.equals("S")) {
			if (compChoice.equals("R"))
				winner += "Computer wins <<Rock Breaks Scissors>>";
			else if (compChoice.equals("P"))
				winner += "Player wins <<Scissors Cuts Paper>>";
		}*/
		
		return winner;
	}

	public String toString()
	{
		if (determineWinner().equals("Invalid Input"))
				return "\n!" + determineWinner() + "!\n";
		String output="player had " + playChoice.toUpperCase() + "\n" + "computer had " + compChoice;
		output = output + "\n!" + determineWinner() + "!\n";
		return output;
	}
}