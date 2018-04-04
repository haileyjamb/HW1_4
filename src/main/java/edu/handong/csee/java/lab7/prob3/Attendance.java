package edu.handong.csee.java.lab7.prob3;

/**
* a class which has methods that initialize, save, and read variables
*/

public class Attendance {

	private String name = "";//declare and initialize string "name"
	private int year = 0;//declare and initialize integer "year"
	private String student_id = "";//declare and initialize string "student_id"
	private int missed = 0;//declare and initialize integer "missed"

	//Constructors++ initialize in constructor
	/**
	 * a method that initialize global variables in the current class
	 */
	public Attendance()
	{
	this.name = "Null";//initialize var. "name"
	this.year = 0;//initialize var. "year"
	this.student_id = "Null";//intialize var. "student_id"
	this.missed = 0;//initialize var. "missed"
	}

	/**
	 * a method that assign input variables into global variables 
	 */
	public Attendance(String name, int year, String student_id, int missed)
	{
	this.name = name;//put "name" in global var. "name"
	this.year = year;//put "year" in global var. "year"
	this.student_id = student_id;//put "student_id" in global var. "student_id"
	this.missed = missed;//put "missed" in global var. "missed"
	}
	
	//Getters
	/**
	 * a method that return the value of "name"
	 */
	public String get_name()
	{
	return name;//return the value of "name" var.
	}
	/**
	 * a method that return the value of "year"
	 */
	public int get_year()
	{
	return year;//return the value of "year" var.
	}
	/**
	 * a method that return the value of "student_id"
	 */
	public String get_id()
	{
	return student_id;//return the value of "student_id" var.
	}
	/**
	 * a method that return the value of "missed"
	 */
	public int get_missed()//return the value of "missed" var.
	{
	return missed;
	}

	//Setters
	/**
	 * a method that put the value of "name" into global variable "name"
	 */
	public void set_name(String name)
	{
	this.name = name;//put "name" in global var. "name"
	}
	/**
	 * a method that put the value of "year" into global variable "year"
	 */
	public void set_year(int year)
	{
	this.year = year;//put "year" in global var. "year"
	}
	/**
	 * a method that put the value of "student_id" into global variable "student_id"
	 */
	public void set_id(String student_id)
	{
	this.student_id = student_id;//put "student_id" in global var. "student_id"
	}
	/**
	 * a method that put the value of "missed" into global variables "missed"
	 */
	public void set_missed(int missed)
	{
	this.missed = missed;//put "missed" in global var. "missed"
	}

}

