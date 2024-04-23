/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
import javax.swing.JOptionPane;


public class Boolean_Login {
    
    private static String registeredUserName = null;
    private static String registeredPassword = null;

    public static void registerUser() {
        registeredUserName = JOptionPane.showInputDialog("Enter your username:");
        registeredPassword = JOptionPane.showInputDialog("Enter your password:");
        
        boolean isUserNameValid = checkUserName(registeredUserName);
        
        boolean isPasswordValid = checkPasswordComplexity(registeredPassword);
        
        if (!isUserNameValid || !isPasswordValid) {
            JOptionPane.showMessageDialog(null, "Registration failed. Please check your input.");
            registerUser();
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

    public static boolean loginUser() {
        String userName = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Enter your password:");
        
        return userName.equals(registeredUserName) && password.equals(registeredPassword);
    }

    public static void main(String[] args) {
        registerUser();
        
        boolean isLoggedIn = loginUser();
        if (isLoggedIn) {
            JOptionPane.showMessageDialog(null, "Login successful");
        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Please check your username and password.");
        }
    }
}


