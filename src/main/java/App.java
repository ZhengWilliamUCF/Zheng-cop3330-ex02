/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();
        String str = myApp.readString();
        System.out.println(str + " has " + str.length() + " characters.");
    }

    // Reads User String
    public String readString() {
        System.out.print("What is the input string? ");
        String string = input.nextLine();
        while (string.equals("")){
            System.out.println("Please enter a valid input!");
            System.out.print("What is the input string? ");
            string = input.nextLine();
        }
        return string;
    }
}
