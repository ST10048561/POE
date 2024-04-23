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
public class Login_To_PoeTest {
    
    public Login_To_PoeTest() {
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
    /**
     * Test of checkUserName method, of class Login_To_Poe.
     */
    @Test
       public static boolean checkUserName(String userName) {
        boolean containsUnderscore = userName.contains("_");
        
        boolean isValidLength = userName.length() <= 5;
        
        return containsUnderscore && isValidLength;
    }

    public static void main(String[] args) {
        String FIRSTNAME = JOptionPane.showInputDialog (null,"\n\n Enter your First name");
         String LASTNAME= JOptionPane.showInputDialog (null,"\n\n Enter your Last Name");
        String userName = JOptionPane.showInputDialog("Enter your username:");
        
        boolean isValid = checkUserName(userName);
        
        if (isValid) {
            JOptionPane.showMessageDialog(null, "Welcome"+" " +FIRSTNAME+ " "+LASTNAME+ " " + "it is great to see you again");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted\nplease ensure that your username contains an underscore and no more than five characters in lenght");
        }
    }
}