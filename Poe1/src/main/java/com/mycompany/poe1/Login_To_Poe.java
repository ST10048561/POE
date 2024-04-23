/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
import javax.swing.JOptionPane;
/**
 *
 * @author loveu
 */
public class Login_To_Poe {
    public static boolean checkUserName(String userName) {
        boolean containsUnderscore = userName.contains("_");
        
        boolean isValidLength = userName.length() <= 5;
        
        return containsUnderscore && isValidLength;
    }

    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Enter your username:");
        
        boolean isValid = checkUserName(userName);
        
        if (isValid) {
            JOptionPane.showMessageDialog(null, "Username is valid!");
        } else {
            JOptionPane.showMessageDialog(null, "Username is invalid!");
        }
    }
}

