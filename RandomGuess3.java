// chapter 6 practice project 

import javax.swing.JOptionPane;

public class RandomGuess3
{
	public static void main(String[] args) 
	{
		// variables and constants
		int userGuess;
		int magicNumber;
		String msg;
		int attempts = 1;
		final int LOW = 1;
		final int HIGH = 10;

		// input phase 
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW + " and " + HIGH));

		// processing phase 
		magicNumber = (int) (Math.random() * HIGH) + LOW;

		while(userGuess != magicNumber)
		{
			if(userGuess > magicNumber)
			{
				msg = "Sorry, your guess was too high!";
			} else {
				msg = "Sorry, your guess was too low!";
			} // end of else statement

			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPlease enter a number between " + LOW + " and " + HIGH));
			// incement the number of attempts before the userGuess is checked again
			++attempts;
		} // end of the while loop

		// output phase
		JOptionPane.showMessgeDialog(null, "You've won! \nThe magic number was: " + magicNumber + "\nYou guessed it in " + attempts + " attempt(s)!");
	}
}