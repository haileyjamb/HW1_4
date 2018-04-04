package edu.handong.csee.java.lab7.prob2;


/**
 * a class with methods that store information in a construct, and return them
 */

public class Chicken {

	private String name; //declare a string "name"
	private double price;//declare a double "price"
	private int stars;//declare an integer "stars"
	/**
	 * a mehtod that initialize within a construct
	 */
	public Chicken()
	{
		this.name = ""; //initialize name
		this.price = 0.0;//initialize price
		this.stars = 0;//initialize stars(ratings)
	}
	/**
	 * a method that put current class' global values into object's members
	 */
	public Chicken(String name, double price, int stars)
	{

		this.name = name; //store info. to "name"
		this.price = price;//store info. to "price"
		this.stars = stars;//store info. to "stars"
	}
	/**
	 * a method return the name 
	 */
	public String get_name()
	{
		return this.name;//return what is saved in "name"
	}
	/**
	 * a method return the price
	 */
	public double get_price()
	{
		return this.price;//return what is saved in "price"
	}
	/**
	 * a method return the rating
	 */
	public int get_stars()
	{
		return this.stars;//return what is saved in "stars"
	}
	/**
	 * a mehtod that set the name
	 */
	public void set_name(String name)
	{
		this.name = name;//put name into "name"
	}
	/**
	 * a method that set the price
	 */
	public void set_price(double price)
	{
		this.price = price;//put price into "price"
	}
	/**
	 * a mehtod that set the rating
	 */
	public void set_stars(int stars)
	{
		this.stars = stars;//put stars into "stars"
	}
}
