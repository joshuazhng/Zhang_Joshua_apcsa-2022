//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joshua Zhang
//Date - 1/24/22


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "AEIOUaeiou";
	   if (vowels.indexOf(a.charAt(0)) == -1 && vowels.indexOf(a.charAt(a.length()-1)) == -1) {
		   return "no";
	   }
	   return "yes";
	}
}