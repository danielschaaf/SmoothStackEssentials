package com.ss.ds.jb.Tests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.ds.jb.five.NumberChecker;
public class NumberCheckerTest {

	NumberChecker n = new NumberChecker();
	Integer string1 = 2;
	Integer string2 = 3;
	Integer string3 = 12;
	Integer palidrome = 989;
	Integer notpalidrome = 7276545;
	
	@Test
	public void test_isOdd() {
		assertTrue(n.isOdd(string1).equals("EVEN"));
		assertTrue(n.isOdd(string2).equals("ODD"));
		assertFalse(n.isOdd(string3).equals("ODD"));
		assertFalse(n.isOdd(string2).equals("EVEN"));
	}
	
	@Test
	public void test_isPrime() {
		assertTrue(n.isPrime(string1).equals("PRIME"));
		assertTrue(n.isPrime(string3).equals("COMPOSITE"));
		assertFalse(n.isPrime(string1).equals("COMPOSITE"));
		assertFalse(n.isPrime(string3).equals("PRIME"));
		
	}
	
	@Test
	public void test_isPalindrome() {
		assertTrue(n.isPalindrome(palidrome).equals("PALINDROME"));
		assertTrue(n.isPalindrome(notpalidrome).equals("NOT A PALINDROME"));
		assertFalse(n.isPalindrome(palidrome).equals("NOT A PALINDROME"));
		assertFalse(n.isPalindrome(notpalidrome).equals("PALINDROME"));
	}
}
