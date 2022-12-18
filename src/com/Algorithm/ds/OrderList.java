package com.Algorithm.ds;

import java.util.*;

/**
 * 
 * @author Kapil
 *
 */
public class OrderList {
	
	Node head;
	class Node {
		int data;
		Node next;
      
		Node (int data) {    //  CONSTRUCTOR 
			this.data=data;
			this.next=null;
		}
	}
	// ADD - FIRST POSITION
	public void addfirst(int data) {
		Node newNode=new Node(data);
		newNode.next = head;
		head = newNode;
		return;
	}
	public void sortByNumber() {

		 // Node current will point to head
	        Node currNode = head,  index = null;
	 
	        int temp;
	 
	        if (head == null) {
	            return;
	        }
	        else {
	            while (currNode != null) {
	                index = currNode.next;
	 
	                while (index != null) {
	                    if (currNode.data > index.data) {
	                        temp = currNode.data;
	                        currNode.data = index.data;
	                        index.data = temp;
	                    }
	 
	                    index = index.next;
	                }
	                currNode = currNode.next;
	            }
	        }
	    }
	// PRINT METHOD
		public void printlist() {
			if (head == null) {
				System.out.println("List is Empty");
			}
			Node currNode = head;
			while (currNode != null)  {
				System.out.print(currNode.data +"->" );
				currNode = currNode.next;
			}
			System.out.println("null");

		}
		    	
	public static void main(String[] args) {

		OrderList list=new OrderList();
		list.addfirst(56);
		list.addfirst(40);
		list.addfirst(562);
		list.addfirst(4);
		list.addfirst(120);
		list.addfirst(78);
		System.out.println("Before The Sorting");
		list.printlist();
		list.sortByNumber();
		System.out.println("After The Sorting");
		list.printlist();
		
	}
	

}
