
package com.mycompany.poe1;

import javax.swing.JOptionPane;

public class PasswordValidator {
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
            JOptionPane.showMessageDialog(null, "Password is strong!");
        } else {
            JOptionPane.showMessageDialog(null, "Password is not strong enough!");
        }
    }
}



