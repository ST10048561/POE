/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
import javax.swing.JOptionPane;
import java.util.regex.*;
/**
 *
 * @author loveu
 */

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkUserName() {
        return username.matches("^.{1,5}_.*$");
    }

    public boolean checkPasswordComplexity() {
        return password.length() >= 8 &&
                Pattern.compile("[A-Z]").matcher(password).find() &&
                Pattern.compile("[0-9]").matcher(password).find() &&
                Pattern.compile("[^a-zA-Z0-9]").matcher(password).find();
    }

    public String registerUser() {
        if (!checkUserName()) {
            return "Username is incorrectly formatted.";
        } else if (!checkPasswordComplexity()) {
            return "Password does not meet complexity requirements.";
        } else {
            return "User has been registered successfully.";
        }
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if (loginUser(enteredUsername, enteredPassword)) {
            return "Successful login.";
        } else {
            return "Failed login.";
        }
    }

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");

        Login login = new Login(username, password);
        
        String registrationMessage = login.registerUser();
        JOptionPane.showMessageDialog(null, registrationMessage);

        String enteredUsername = JOptionPane.showInputDialog("Enter username for login:");
        String enteredPassword = JOptionPane.showInputDialog("Enter password for login:");

        String loginStatus = login.returnLoginStatus(enteredUsername, enteredPassword);
        JOptionPane.showMessageDialog(null, loginStatus);
    }
}


