package com.Algorithm.ds;

import java.util.*;

/**
 * 
 * @author Kapil
 *
 */
public class BinarySearchWord {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 //storing words in string type of array
	        String[] words = {"Honda","suzuki","Nokia","Samsung","Realme","Apple","Honor" };
	        //sorting the array
	        Arrays.sort(words);
	        //printing using inbuilt toString in String class 
	        System.out.println(Arrays.toString(words));
	        System.out.println("Enter A word to search:");
	        String searchWord = scanner.next();
	        
	       

	    }

}
