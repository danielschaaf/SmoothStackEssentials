package com.ss.ds.jb.one;
import java.util.Scanner;

public class NumberGuesser {
	//function that starts the game
public static void numberGuessergame() {
	  // user input scanner class
    Scanner scanner = new Scanner(System.in);

    // Generate the random number to guess
    int randomNumber = 1 + (int)(100* Math.random());

    // initalizes the 5 attempts a user has at guessing the random number
    int attempts = 5;

    int i, guess;

    System.out.println("A number is chosen between 1 to 100. Guess the number within 5 attempts.");

    // Interate over attempts
    for (i = 0; i < attempts; i++) {

        System.out.println("Guess the number:");
        int max= randomNumber+10;
        int low = randomNumber-10;
        // Take input for guessing and validate that it is between 1-100
        
        guess = scanner.nextInt();
        if(guess>100 || guess < 1) {
        	System.out.println("please choose another number between 1-100");
        	guess = scanner.nextInt();
        }
        if(guess>low && guess < max) {
        	System.out.println("the random number is " + randomNumber + " which is with in a range of 10 of your guess "+guess);
        	break;
        }
        // If the number is guessed
        else if (randomNumber == guess) {
            System.out.println("Congratulations! You guessed the number.");
            break;
        }
        else if (randomNumber > guess
                 && i != attempts - 1) {
            System.out.println(
                "The number is "
                + "greater than " + guess);
        }
        else if (randomNumber < guess
                 && i != attempts - 1) {
            System.out.println("The number is less than " + guess);
        }
    }

    if (i == attempts) {
        System.out.println("Sorry the answer was "+randomNumber);

    }
    
   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberGuessergame();
	}

}
