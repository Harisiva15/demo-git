package com.task1;

import java.util.Scanner;

public class QuestionFour {

	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
        
        // Find the smallest number
        double smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        
        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);
    }
}
