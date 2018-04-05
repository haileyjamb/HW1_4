package edu.handong.csee.java.lab7.prob1;

import java.util.Scanner; //to get input through the keyboard
/**
 * a main class that works with Scanner class and YearToCentury class
 *
 */
public class YearToCentury_main {

	/**
	 * a main method that gets input and print out message with the input
	 *
	 */
	public static void main(String[] args)
	{
		int yr = 0;//declare an integer 'yr'

		Scanner keyboard = new Scanner(System.in); //create an object of Scanner class

		System.out.println("Input year: ");//print out a message that makes user to input
		yr = keyboard.nextInt();//put input into an integer 'yr'

		YearToCentury year = new YearToCentury(yr);//create an object of YearToCentury class
		System.out.println(yr + " is " + year.calc_century() + "th century.");//print out a message with input and the result of calculation in YearToCentury object
	}

}

//The constructor YearToCentury(int) is undefined
//The method calc_century() is undefined for the type YearToCentury