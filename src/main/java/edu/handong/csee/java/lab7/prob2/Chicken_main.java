package edu.handong.csee.java.lab7.prob2;

/**
 * a main class that has a main method that work with objects of Chicken class
 */
public class Chicken_main {
	/**
	 * a main method that creates objects of Chicken class
	 * put stars to each rating of menu objects
	 * print out the result messages
	 */
	public static void main(String[] args)
	{
		Chicken menu1 = new Chicken("Cheese_mustard",14000.00,3); //create an object of Chicken class
		Chicken menu2 = new Chicken("Honey_mustard", 14000.00,5); //create an object of Chicken class
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00,4);//crate an object of Chicken class

		menu1.set_stars(3);//put '3' into menu1's rating
		menu2.set_stars(4);//put '4' into menu2's rating
		menu3.set_stars(1);//put '1' into menu3's rating

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());//print out a message with the menu1 name and stars
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());//print out a message with the menu2 name and stars
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());//print out a message with the menu3 name and stars
	}
}
