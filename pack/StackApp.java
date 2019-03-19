
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 2-04         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program is created to demo   --
//-- the coders ability in creating and--
//-- utilizing different functions for --
//-- for a class in Java               --
//---------------------------------------

import java.util.Scanner;

class StackApp { // Create class
    public static void main(String[] args) { // Main function
        
        // Bring instances
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) { // For as long as the user wants

            // Ask for and store data
            System.out.println("Enter command ( push / pop / peek / clear / print / exit )");
            String choice = scanner.nextLine();

            // If they enter "push"
            if (choice.equals("push")) {

                // Ask for more data
                System.out.println("Please enter the number you want to push:");
                
                try { 
                    // try storing the value in an int variable and push
                    int number = scanner.nextInt();
                    stack.push(number);

                } catch (Exception e) { // If there was error

                    // Output error message
                    System.out.println("Please enter a number!");
                }
            // If they enter pop
            } else if (choice.equals("pop")) {

                // run pop function
                stack.pop();

            // If they enter exit
            } else if (choice.equals("exit")) {

                // Jump out of the loop
                break;

            // If they enter "print"
            } else if (choice.equals("print")) {

                // run the .toString function
                System.out.println(stack.toString());

            // If they enter "peek"
            } else if (choice.equals("peek")) {

                System.out.println(stack.peek());
            
            // If they enter "clear"
            } else if (choice.equals("clear")) {

                stack.clear();

            // If they enter anything else
            } else {

                // Output error message
                System.out.println("Please enter a valid command!");
            }
        }
        scanner.close();
    }
}