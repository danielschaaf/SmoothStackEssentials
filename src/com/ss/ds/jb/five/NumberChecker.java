package com.ss.ds.jb.five;

import java.util.ArrayList;

public class NumberChecker {

	public static void main(String[] args) { // commands passed through prompt -- first arg: num of test cases
		// -- second arg gives the number
		NumberChecker n = new NumberChecker();

		Function_Chooser_Int isOdd = (i) -> n.isOdd(i);
		Function_Chooser_Int isPrime = (i) -> n.isPrime(i);
		Function_Chooser_Int isPalindrome = (i) -> n.isPalindrome(i);

		int test;
		int conditions;
		int numberToProcess;
		int k;
		int l;

		try { // ensures that all arguments passed are integers
			test = Integer.parseInt(args[0]);

			l = 1;

			for (k = 0; k < test; k++) {
				conditions = Integer.parseInt(args[l]);
				l++;

				numberToProcess = Integer.parseInt(args[l]);
				l++;

				if (conditions == 1) // tells if argument is odd
					System.out.println(n.processFunction(numberToProcess, isOdd));

				else if (conditions == 2) // tells if argument is prime
					System.out.println(n.processFunction(numberToProcess, isPrime));

				else if (conditions == 3) // tells if argument is palindrome
					System.out.println(n.processFunction(numberToProcess, isPalindrome));

			}
		}

		catch (NumberFormatException e) {
			System.out.println("Unexpected error. Program will now terminate.");
			System.exit(0);
		}

	}

	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * * * * * Create isOdd Function * * * * * * * * * * * * * * * * * * * * * * * *
	 * * * * * * * * * * * * * * * * * * * *
	 */

	public String isOdd(Integer i) {
		StringBuffer s = new StringBuffer();

		if (i % 2 == 0)
			s.append("EVEN");

		else
			s.append("ODD");

		return s.toString();

	}

	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * * * * * Create isPrime() Function * * * * * * * * * * * * * * * * * * * * * *
	 * * * * * * * * * * * * * * * * * * * * * *
	 */

	public String isPrime(Integer i) {
		StringBuffer s;

		double k;
		double j;
		boolean prime = true;

		k = i.doubleValue();
		s = new StringBuffer();
		// prime numbers are larger than 1 by definition
		if (i <= 1)
			s.append("COMPOSITE");

		else {
			// tests all factors of the number up to the squareroot of the number
			for (j = 2; j <= Math.sqrt(k) && prime; j++) { // tests all factors of the number up to the squareroot of
															// the number
				// if factor is found, then the number must be composite
				if (k % j == 0) {
					s.append("COMPOSITE");
					prime = false;
				}
			}

			if (prime) // if no factor found, the number is prime
				s.append("PRIME");

		}
		return s.toString();
	}

	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * * * * * Create isPalidrome() Function * * * * * * * * * * * * * * * * * * * *
	 * * * * * * * * * * * * * * * * * * * * * * * *
	 */
	public String isPalindrome(Integer i) {
		StringBuffer s;
		ArrayList<Integer> reversedDigits;
		int p;
		int j;
		// will store the digits of i in reverse order
		s = new StringBuffer();
		reversedDigits = new ArrayList<Integer>();
		p = 0;
		// temporarily stores i value
		j = i.intValue();

		while (j > 0) {
			// reverse the digits of the value of i, store in reversedDigits
			reversedDigits.add(j % 10);
			j /= 10;
		}

		while (!reversedDigits.isEmpty()) {
			p += Math.pow(10, reversedDigits.size() - 1) * reversedDigits.get(0);
			reversedDigits.remove(0);
		}
		// subtracts the PALINDROME from the original number to check if it's a
		// palindrome
		if (i.intValue() - p == 0)
			s.append("PALINDROME");

		else
			s.append("NOT A PALINDROME");

		return s.toString();
	}

	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * * * * * This is a local method to use the functional interface * * * * * * *
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 */
	private String processFunction(Integer i, Function_Chooser_Int f) { // local method to use Function_Chooser_Int
																		// interface
		return f.doesThis(i);
	}
}
