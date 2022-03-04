//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		if (word.length() == rhs.word.length()) {
			return word.compareTo(rhs.word);
		}
		else if (word.length() > rhs.word.length()) {
			return 1;
		}
		else
			return -1;	
	}

	public String toString()
	{
		return word;
	}
}