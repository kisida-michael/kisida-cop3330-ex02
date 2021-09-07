package org.example;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class App 
{
    public static void main(String[] args) {
        Scanner stringCount = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is the input string? ");

        String inputString  = stringCount.nextLine();  // Read user input
        int strlen = inputString.length();
        String output = (inputString + " has " + strlen + " characters");  // Output user input
        System.out.println(output);
        stringCount.close();
    }
}






