package org.example;

public class Main{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String finalNames = "";
            if (nameBuilder.length() > 0) {
                // Remove the last ", " (which is 2 characters long)
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}
