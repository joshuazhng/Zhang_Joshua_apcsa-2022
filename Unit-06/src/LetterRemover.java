//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", 'a');
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String look = String.valueOf(lookFor);
		String cleaned = sentence.replaceAll(look, "");
		/*int loc = sentence.indexOf(lookFor);
		while (loc != -1) {
			cleaned = 
		}*/
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor
				+ "\n" + removeLetters() + "\n\n";
	}
}