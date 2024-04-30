package com.task1;

public class TaskOne {
	public static void main(String[] args) {
        
        System.out.println("Printing numbers from 10 to 50 using a for loop:");
        for (int i = 10; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 
        
      
        System.out.println("Printing numbers from 10 to 50 using a while loop:");
        int number = 10;
        while (number <= 50) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println(); 
    }
}
