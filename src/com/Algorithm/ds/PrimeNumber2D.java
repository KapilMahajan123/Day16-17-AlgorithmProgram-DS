package com.Algorithm.ds;

public class PrimeNumber2D {
	//Declare a pointer to a dynamic array of type int and size.
	int[][] primeNoArray = new int[10][100]; 

    public void primeNo() {
    	//This for loop is traversing all numbers in the range.
        for(int i=2; i<1000; i++) {
            int count = 0;
            for(int j=2; j<=i; j++) {
                if(i%j == 0) { //its looking for odd numbers
                    count++;
                }
                if(count == 2) {
                    break;
                }
            }
            if(count==1) {
                int index1 = i/100;
                int index2 = i%100 -1 ;
                primeNoArray[index1][index2] = i;
            }
        }
    }

    public void show() {
        System.out.println("Row 1"); //print in element
        int rowNo = 1;
        for(int[] list: primeNoArray) {
            rowNo++;
            for(int prime: list) {
                if(prime == 0) {
                    continue;
                }
                System.out.print(prime + " ");
            }
            System.out.println();
            if(rowNo == 11) {
                return;
            }
            System.out.println("Row " + rowNo); //to print rows
           
        }
    }
    public static void main(String[] args) {
        PrimeNumber2D primeNo = new PrimeNumber2D();
        primeNo.primeNo();
        primeNo.show();

    }

}
