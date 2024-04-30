package com.task1;

import java.util.Scanner;

public class QuestionThree {
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
        
        // Reverse the number
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }

}
