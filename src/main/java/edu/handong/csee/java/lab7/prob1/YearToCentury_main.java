package edu.handong.csee.java.lab7.prob1;

import java.util.Scanner; //to get input through the keyboard

public class YearToCentury_main {
	
	public static void main(String[] args)
	{
		int yr = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input year: ");
		yr = keyboard.nextInt();
		
		YearToCentury year = new YearToCentury(yr);
		System.out.println(yr + " is " + year.calc_century() + "th century.");
	}

}

//The constructor YearToCentury(int) is undefined
//The method calc_century() is undefined for the type YearToCentury