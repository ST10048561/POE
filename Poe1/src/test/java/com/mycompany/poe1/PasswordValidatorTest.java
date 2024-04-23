/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe1;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author loveu
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    @Test
    public static boolean checkPasswordComplexity(String password) {
        boolean hasMinimumLength = password.length() >= 8;
                boolean hasCapitalLetter = !password.equals(password.toLowerCase());
                boolean hasDigit = password.matches(".*\\d.*");
                boolean hasSpecialCharacter = !password.matches("[a-zA-Z0-9 ]*");
                return hasMinimumLength && hasCapitalLetter && hasDigit && hasSpecialCharacter;
    }

    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Enter your password:");
                boolean isValid = checkPasswordComplexity(password);
                if (isValid) {
            JOptionPane.showMessageDialog(null, "Password succesfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formated please ensure that your username contains atleast 8 characters,a capital letter a number and a special character");
        }
    }
}


