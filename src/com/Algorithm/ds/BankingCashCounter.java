package com.Algorithm.ds;

import java.util.*;

/**
 * 
 * @author Kapil
 *
 */
public class BankingCashCounter {
	
	/*  Desc -> Create a Program which creates Banking Cash Counter where people
	 *	come in to deposit Cash and withdraw Cash. Have an input panel to add people
	 *	to Queue to either deposit or withdraw money and dequeue the people. Maintain
	 *	the Cash Balance.
	 */
	Scanner sc =new Scanner(System.in); 
    Queue<Integer> numbers = new LinkedList<Integer>();
     static int []arr1=new int[20];
    static int j=0;
     
	public void bankCounter() {	
		BankingCashCounter obj=new BankingCashCounter();  //create object
		System.out.println("Enter The Input 1] Deposite Money   2] Withdraw Money   3] BankClosed");
		int value=sc.nextInt();
		switch (value)  {
		case(1):
			    System.out.println("Enter The Amount of Deposite");
			    int money=sc.nextInt();
			    obj.withdraw_DepositeAmt(money);
			    bankCounter();
			    break;
		case(2):
			    System.out.println("Enter The Amount of Withdraw");
			    int money1=sc.nextInt();
			    obj.withdraw_DepositeAmt(-money1);
			    bankCounter();
			    break;
		case(3):
			    System.out.println("Bank was Closed");
		        obj.display();
		        break;
		        
		default: System.out.println("User Enter Invalid Input");
		}
	}
	public void withdraw_DepositeAmt(int amount) {	
		arr1[j]=amount;
		j++;
	}
	/*
	 * Display method
	 * to initialize and print
	 */
	public void display() {
		 for (int i=0; i < arr1.length; i++)  {
			 if(arr1[i]!=0) {
			 numbers.add(arr1[i]);	
			 }
		 }
		 System.out.println(numbers);
	}
	public void balance() {
		
	}
	public static void main(String[] args) {
		BankingCashCounter obj1=new BankingCashCounter();
		obj1.bankCounter();
	}


}
