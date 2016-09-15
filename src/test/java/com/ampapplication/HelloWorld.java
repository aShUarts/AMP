package com.ampapplication;

import org.testng.annotations.Test;

public class HelloWorld {

	@Test 
	public static void display()
	{
		System.out.println("Hello World Dear");
	}
	
	@Test
	public static void displayagain()
	{
		System.out.println("Again Hello");
	}

	public void initialize()
	{
		System.out.println("Bye Hello World");
		
	}
}
