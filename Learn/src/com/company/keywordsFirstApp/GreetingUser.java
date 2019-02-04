package com.company.keywordsFirstApp;

import java.util.Scanner;

public class GreetingUser {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name");
            String userName = scanner.nextLine();
            System.out.println("Hello " + userName);
        }
    }
}
