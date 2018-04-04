package edu.handong.csee.java.lab7.prob3;

import java.util.Random; //get random numbers between 1 to 100


/**
 * a main class that works with Attendance class
 * get information and save it, then print out messages with them
 */
public class Attendance_main {
	/**
	 * a main method that provides all the functions the class has
	 */
	public static void main(String[] args)
	{
		Attendance s_1 = new Attendance();//create an object"s_1" of Attendance class
		Attendance s_2 = new Attendance();//create an object"s_2" of Attendance class
		Attendance s_3 = new Attendance();//create an object"s_3" of Attendance class
		Attendance s_4 = new Attendance();//create an object"s_4" of Attendance class
		
		s_1.set_name("Jess");s_1.set_year(4);s_1.set_id("21400999");s_1.set_missed(0);//save info. in a construction "s_1_ with matches
		s_2.set_name("Kent");s_1.set_year(2);s_2.set_id("21700111");s_2.set_missed(0);//save info. in a construction "s_2"with matches
		s_3.set_name("Lucas");s_1.set_year(1);s_3.set_id("21833222");s_3.set_missed(0);//save info. in a construction "s_3"with matches
		s_4.set_name("Martha");s_1.set_year(2);s_4.set_id("21733444");s_4.set_missed(0);//save info. in a construction "s_4"with matches
		
		Random randomGenerator = new Random();//create an object of Random class which gives random number from 1 to 100
		
		s_1.set_missed(randomGenerator.nextInt(10));//put a random number up to 10  in "s_1"/"missed"
		s_2.set_missed(randomGenerator.nextInt(10));//put a random number up to 10 in "s_2"/"missed"
		s_3.set_missed(randomGenerator.nextInt(10));//put a random number up to 10  in "s_3"/"missed"
		s_4.set_missed(randomGenerator.nextInt(10));//put a random number up to 10 in "s_4"/"missed"
		
		if(s_1.get_missed() > 6)//if s_1 has bigger value than 6 in "missed"
		{
		System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");//print out the message with name of s_1
		System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());//print out the message with the name and "missed" of s_1
		}
		else
		System.out.println("We'll see about the grade, " + s_1.get_name());//if s_1 has the same or less value than 6 in "missed", print out the message with the name of s_1
		
		if(s_2.get_missed() > 6)//if s_2 has bigger value than 6 in "missed"
		{
		System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");//print out the message with name of s_2
		System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());//print out the message with the name and "missed" of s_2
		}
		else
		System.out.println("We'll see about the grade, " + s_2.get_name());//if s_2 has the same or less value than 6 in "missed", print out the message with the name of s_2
		
		if(s_3.get_missed() > 6)//if s_3 has bigger value than 6 in "missed"
		{
		System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");//print out the message with name of s_3
		System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());//print out the message with the name and "missed" of s_3
		}
		else
		System.out.println("We'll see about the grade, " + s_3.get_name());//if s_3 has the same or less value than 6 in "missed", print out the message with the name of s_3
		
		if(s_4.get_missed() > 6)//if s_4 has bigger value than 6 in "missed"
		{
		System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");//print out the message with name of s_4
		System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());//print out the message with the name and "missed" of s_4
		}
		else
		System.out.println("We'll see about the grade, " + s_4.get_name());//if s_4 has the same or less value than 6 in "missed", print out the message with the name of s_4
	}
}


