package com.Algorithm.ds;

import java.util.*;


/**
 * 
 * @author Kapil
 *
 */
public class PrimeNumber {
	/*
	 * Take a range of 0 - 1000 Numbers 
	 * And find the Prime numbers in that range.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Range 0-1000 prime number is : ");
		int start = 0;//input.nextInt();
		int stop = 1000;//input.nextInt();
		/*
		 * check whether the parameter passed 
		 * To it is a prime number or not.
		 */
		for (int i = start; i <= stop; i++) {
			if (isPrime(i)) 
				System.out.println(i);
		}
	}

	private static boolean isPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}