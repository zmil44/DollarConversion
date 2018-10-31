/*Zach Miler
 *Dollars.java
 *Bellevue University
 *7 june 2018
 *This program displays a message box asking for the user to input a whole dollar amount and then displays the amount of money in different denominations of bills
 */
 import javax.swing.*;
 
public class Dollars {
	private static int amount;
	private static int noOfHundreds, noOfFifties, noOfTwenties, noOfTens, noOfFives,noOfOnes;
	private static String rawInput;
	private static int intInput;
	private static boolean inputStatus=false;
	private static void getInput()
	{
		while(inputStatus==false)
		{
			rawInput = JOptionPane.showInputDialog(null, "Please enter a whole dollar amount: ");
			try {	
				intInput = Integer.parseInt(rawInput);
				inputStatus=true;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "I'm sorry but the number you entered seemed to be incorrect. Please try again.");
				inputStatus=false;
				
			}
		}
		
		
		setAmount(intInput);
	}

	private static void setAmount(int input)
	{
		amount = input;
	}
	private static void calculateHundreds()
	{
		if(amount>=100) 
		{
			noOfHundreds = amount/100;
			amount = amount%100;
		}
	}
	private static void calculateFifties()
	{
		if(amount>=50)
		{
			noOfFifties = amount/50;
			amount = amount%50;
		}
	}
	private static void calculateTwenties()
	{
		if(amount>=20)
		{
			noOfTwenties = amount/20;
			amount = amount%20;
		}
	}
	private static void calculateTens()
	{
		if(amount>=10)
		{
			noOfTens = amount/10;
			amount = amount%10;
		}
	}
	private static void calculateFives()
	{
		if(amount>=5)
		{
			noOfFives = amount/5;
			amount = amount%5;
		}
	}
	private static void calculateOnes()
	{
		
		noOfOnes = amount/1;

	}
	
	private static void displayResults()
	{
		JOptionPane.showMessageDialog(null, "You have " + noOfHundreds + " hundred dollar bill(s)\nYou have " + noOfFifties + " fifty dollar bill(s)\n"
				+ "You have " + noOfTwenties + " twenty dollar bill(s)\nYou have " + noOfTens + " ten dollar bill(s)"
				+ "\nYou have " + noOfFives + " five dollar bill(s)\nYou have " + noOfOnes + " one dollar bill(s)");
	}
	public static void main(String[] args) {
		getInput();
		calculateHundreds();
		calculateFifties();
		calculateTwenties();
		calculateTens();
		calculateFives();
		calculateOnes();
		displayResults();

	}

}
