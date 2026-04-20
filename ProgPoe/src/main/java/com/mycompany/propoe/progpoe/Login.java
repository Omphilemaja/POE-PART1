/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoe;

public class Login {

    private String storedUsername;
    private String storedPassword;

    public String registerUser(String username, String password, String phone) {

        if (!checkUsername(username)) {
            return "Invalid username.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Invalid password.";
        }

        if (!checkCellphoneNumber(phone)) {
            return "Invalid cellphone number.";
        }

        storedUsername = username;
        storedPassword = password;

        return "Registration successful!";
    }

    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    public boolean checkUsername(String username) {
        return username.length() >= 4 && username.matches("[a-zA-Z0-9]+");
    }

    public boolean checkCellphoneNumber(String number) {
        return number.matches("^\\+27\\d{9}$");
    }

    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[^a-zA-Z0-9].*");
    }
}