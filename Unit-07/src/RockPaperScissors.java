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
		
		if (playChoice.equals(compChoice))
			winner += "Draw Game";
		if (playChoice.equals("R")) {
			if (compChoice.equals("P"))
				winner += "Computer wins <<Paper Covers Rock>>";
			if (compChoice.equals("S"))
				winner += "Player wins <<Rock Breaks Scissors>>";
		}
		if (playChoice.equals("P")) {
			if (compChoice.equals("S"))
				winner += "Computer wins <<Scissors Cuts Paper>>";
			if (compChoice.equals("R"))
				winner += "Player wins <<Paper Covers Rock>>";
		}
		if (playChoice.equals("S")) {
			if (compChoice.equals("R"))
				winner += "Computer wins <<Rock Breaks Scissors>>";
			else if (compChoice.equals("P"))
				winner += "Player wins <<Scissors Cuts Paper>>";
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