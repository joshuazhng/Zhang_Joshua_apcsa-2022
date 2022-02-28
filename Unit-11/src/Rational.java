//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;

	//write two constructors
	public Rational() {
		numerator = 1;
		denominator = 1;
	}
	
	public Rational(int num, int den) {
		numerator = num;
		denominator = den;
	}

	//write a setRational method
	public void setRational(int num, int den) {
		setNumerator(num);
		setDenominator(den);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int num) {
		numerator = num;
	}
	
	public void setDenominator(int num) {
		denominator = num;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		setNumerator(getNumerator()*other.denominator + other.numerator*getDenominator());
		setDenominator(getDenominator()*other.denominator);

		reduce();
	}

	private void reduce()
	{
		setNumerator(numerator / gcd(numerator, denominator));
		setDenominator(denominator / gcd(numerator, denominator));
	}

	private int gcd(int numOne, int numTwo)
	{
		if (numTwo == 0) {
			return numOne;
		}

		return gcd(numTwo, numOne % numTwo);
	}

	public Object clone ()
	{
		return new Rational(getNumerator(), getDenominator());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public boolean equals( Object obj)
	{
		return compareTo((Rational)(obj)) == 0;
	}

	public int compareTo(Rational other)
	{
		if (getNumerator()*other.denominator > other.numerator*getDenominator()) {
			return 1;
		}
		if (getNumerator()*other.denominator < other.numerator*getDenominator()) {
			return -1;
		}
		return 0;
	}
	
	//write  toString() method
	public String toString() {
		return numerator + "/" + denominator;
	}
	
}