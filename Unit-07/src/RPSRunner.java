//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		RockPaperScissors play = new RockPaperScissors();
		
		
		//add in a do while loop after you get the basics up and running
	 {
			do {
				String player = "";
				
				out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");

				//read in the player value
				play.setPlayers(keyboard.next());
				out.println(play);
				
				out.print("Do you want to play again? ");
				response = keyboard.next().charAt(0);
				} while (response == 'y' || response == 'Y');
	}
	}
}



