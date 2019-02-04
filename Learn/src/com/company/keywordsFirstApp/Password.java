package com.company.keywordsFirstApp;

import java.util.Scanner;

public class Password {
    private static String currentPassword = "123";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = scanner.nextLine();

        if (checkPassword(password)) {
            System.out.println("Welcome!");
        } else{
            System.out.println("You entered the wrong password");
        }
    }

    public static boolean checkPassword(String password) {
        return currentPassword.equals(password);
    }
}
