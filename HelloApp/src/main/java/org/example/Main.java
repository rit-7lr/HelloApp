package org.example;

import java.util.Scanner; // Import the tool to read input

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
