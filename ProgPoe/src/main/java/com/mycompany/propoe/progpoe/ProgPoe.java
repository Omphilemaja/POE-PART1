/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package com.mycompany.progpoe;

import java.util.Scanner;

public class ProgPoe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login signup = new Login();

        System.out.println("=== REGISTER ===");

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        String username;
        while (true) {
            System.out.print("Enter Username: ");
            username = input.nextLine();

            if (signup.checkUsername(username)) {
                break;
            } else {
                System.out.println("Invalid username. Must be at least 4 characters and contain only letters/numbers.");
            }
        }

        String password;
        while (true) {
            System.out.print("Enter Password: ");
            password = input.nextLine();

            if (signup.checkPasswordComplexity(password)) {
                break;
            } else {
                System.out.println("Invalid password. Must be at least 8 characters, include uppercase, lowercase, digit, and special character.");
            }
        }

        String phone;
        while (true) {
            System.out.print("Enter Phone Number (+27...): ");
            phone = input.nextLine();

            if (signup.checkCellphoneNumber(phone)) {
                break;
            } else {
                System.out.println("Invalid phone number. Must start with +27 and be exactly 12 digits.");
            }
        }

        String result = signup.registerUser(username, password, phone);
        System.out.println(result);

        System.out.println("\n=== LOGIN ===");

        boolean loggedIn = false;
        int attempts = 3;

        while (attempts > 0 && !loggedIn) {

            System.out.print("Enter Username: ");
            String loginUser = input.nextLine();

            System.out.print("Enter Password: ");
            String loginPass = input.nextLine();

            loggedIn = signup.loginUser(loginUser, loginPass);

            if (loggedIn) {
                System.out.println("Login successful! Welcome " + firstName + " " + lastName);
            } else {
                attempts--;
                System.out.println("Incorrect details. Attempts left: " + attempts);
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed attempts. Access denied.");
        }

        input.close();
    }
}