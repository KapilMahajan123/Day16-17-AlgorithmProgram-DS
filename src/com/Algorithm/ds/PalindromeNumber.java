package com.Algorithm.ds;

import java.util.*;

/**
 * 
 * @author Kapil
 *
 */
public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter The Value In String Format");
		Scanner scanner=new Scanner(System.in);  //create object
		String str=scanner.next();  //taking next int type of value
	    String reverseStr = "";    
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }
	    //if condition we have to check equal or not 
	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }
}
