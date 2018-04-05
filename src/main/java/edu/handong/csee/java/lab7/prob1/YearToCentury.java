package edu.handong.csee.java.lab7.prob1;

/**
 *a class that calculates a year to a century
 */

public class YearToCentury {

	int year;	//declare an integer

	/**
	 * a method that initiates the integer
	 */
	public YearToCentury()
	{
		year = 0;//
	}
	/**
	 * a method that ensures integer year is a member by using "this"
	 */
	public YearToCentury(int year)
	{
		this.year = year;//make sure that "year" is from the "YearToCentury"
	}

	/**
	 * a method that calculates a year into a century using if-else statement
	 */
	public int calc_century()
	{
		if(year%100 == 0)//if "year" is divided by 100 without any remaining values
			year = year / 100;//then, divide year by 100
		else//if "year" cannot be divided by 100 without remaining any values
		{
			year = (year / 100) + 1;//then, divide "year" by 100 and add 1 to the result
		}
		return year;//
	}
}