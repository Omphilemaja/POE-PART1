/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progpoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testRegisterUser() {
        Login instance = new Login();
        String result = instance.registerUser("Kyl12", "Maja11@p", "+27656510843");
        assertEquals("Registration successful!", result);
    }

    @Test
    public void testLoginUser() {
        Login instance = new Login();

        instance.registerUser("Kyl12", "Maja11@p", "+27656510843");

        boolean result = instance.loginUser("Kyl12", "Maja11@p");

        assertTrue(result);
    }

    @Test
    public void testCheckCellphoneNumber() {
        Login instance = new Login();
        assertTrue(instance.checkCellphoneNumber("+27656510843"));
    }

    @Test
    public void testCheckUsername() {
        Login instance = new Login();
        assertTrue(instance.checkUsername("Kyl12"));
    }

    @Test
    public void testCheckPasswordComplexity() {
        Login instance = new Login();
        assertTrue(instance.checkPasswordComplexity("Maja11@p"));
    }
}