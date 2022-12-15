package com.Algorithm.ds;

import java.util.*;

/**
 * 
 * @author Kapil
 *
 */

public class BinarySearchWord <E>{
	ArrayList<E> list = new ArrayList();

	public static <E> void main(String[] args) {

		// Need to create one list of words
		BinarySearchWord bs = new BinarySearchWord();
		bs.list.add("HCL");
		bs.list.add("AMAZON");
		bs.list.add("TCS");
		bs.list.add("HONDA");
		bs.list.add("BMW");
		bs.list.add("BRIDGELABZ");
		bs.list.add("TATA");

		// Convert this list to an array. So that you can perform Binary Search
		E[] words = (E[]) new String[bs.list.size()];
		bs.list.toArray(words);

		// Before performing any searching 1st we need to sort the array
		Arrays.sort(words);

		// Performing one binary search
		System.out.println("Enter the word you want to search in the list");
		Scanner scanner = new Scanner(System.in);
		E str = (E) scanner.next();
		scanner.close();
		int result = binarySearch(words, str);
		if (result == -1)
			System.out.println("Searched word : " + str + " is not present in the list");
		else
			System.out.println("Searched word : " + str + " is present in the list at index : " + result);
	}

	public static <E> int binarySearch(E[] words, E str) {
		int l = 0, r = words.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			int result = str.toString().compareToIgnoreCase(words[mid].toString());

			// if that word is present at the mid
			if (result == 0) {
				return mid;
			}
			// If that is not in mid, check for left half or right half
			if (result > 0) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return -1; // For default if not getting the word.
	}


}
