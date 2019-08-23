package guessinggame;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("welcome to the guessing game");
		System.out.println("make a guess");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		System.out.println("You guessed" + guess);
		if (guess == 7) {
			System.out.println("you win!!");
		} else if (guess != 7) {
			System.out.println("Try to guess the number. Pick a number between 1-10");
		} else if (guess == -1) {
			System.out.println("Good Bye");
			System.exit(-1);
		} else if (guess) {
			System.out.println("you lose");
		}
	}

}
