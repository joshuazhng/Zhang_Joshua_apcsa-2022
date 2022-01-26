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
		if (comp == 0) {
			compChoice = "R";
		}
		if (comp == 1) {
			compChoice = "P";
		}
		if (comp == 2) {
			compChoice = "S";
		}
		
		if (playChoice == "R") {
			if (compChoice == "P") {
				winner += "Computer";
			}
		}
		
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\n" + "computer had " + compChoice;
		return output;
	}
}