/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
import javax.swing.JOptionPane;

public class StringRegisterUser {
    public static String registerUser() {
        String userName = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Enter your password:");
        
        boolean isUserNameValid = checkUserName(userName);
        
        boolean isPasswordValid = checkPasswordComplexity(password);
        
        if (isUserNameValid && isPasswordValid) {
            return "Registration successful Welcome, " + userName +"";
        } else if (!isUserNameValid) {
            return "Username is not correctly formatted.";
        } else if (!isPasswordValid) {
            return "Password does not meet complexity requirements.";
        } else {
            return "Registration failed due to unknown reasons.";
        }
    }
    
    public static boolean checkUserName(String userName) {
        return userName.contains("_") && userName.length() <= 5;
    }
    
    public static boolean checkPasswordComplexity(String password) {
        boolean hasMinimumLength = password.length() >= 8;
        
        boolean hasCapitalLetter = !password.equals(password.toLowerCase());
        
        boolean hasDigit = password.matches(".*\\d.*");
        
        boolean hasSpecialCharacter = !password.matches("[a-zA-Z0-9 ]*");
        
        return hasMinimumLength && hasCapitalLetter && hasDigit && hasSpecialCharacter;
    }

    public static void main(String[] args) {
        String registrationMessage = registerUser();
        JOptionPane.showMessageDialog(null, registrationMessage);
    }
}


