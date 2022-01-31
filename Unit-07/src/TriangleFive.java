//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
 		String output = "";
		char currLetter = letter;
		for (int i = 0; i < amount; i++)
		{
			currLetter = letter;
			for (int j = 0; j < amount-i; j++) //j represents the added # to the ASCII of the letter and the # of words in each line
			{
				for (int k = amount; k > j; k--) //k is the number of letters in each word
				{
					if (currLetter+j > 'Z')
						currLetter -= 26;
					output += (char)(currLetter+j);
				}
				output += " ";
			
			}
			
			output += "\n";
		}
		return output;
	}
}