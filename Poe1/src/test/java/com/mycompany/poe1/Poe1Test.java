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
public class Poe1Test {
    
    public Poe1Test() {
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
     * Test of main method, of class Poe1.
     */
    @Test
          public static void main(String[] args) {
             
         String USERNAME=JOptionPane.showInputDialog (null,"\n\n Welcome enter Username");
         if(USERNAME.length()<=5 && USERNAME.contains("_")){   
             JOptionPane.showMessageDialog(null,"Username Successfully Captured");
         }  
        else{
                JOptionPane.showMessageDialog(null,"Username is not correctly formatted please ensure that your username contains an underscore and no more than five characters in lenght");
         }    
         String PASSWORD =JOptionPane.showInputDialog (null,"\n\n Please Enter your Password");

         if(PASSWORD.length()>=8 && PASSWORD.matches("(=?.*[A-Z]).*") && PASSWORD.matches("(?=.*[a-z]).*") && PASSWORD.matches("(?=.*[a-z0-9]).*")&& PASSWORD.matches("(?=.*[@#$%^&+=]).*")){
             JOptionPane.showMessageDialog(null,"Password is Successfully Captured");
         }
         
         else{
             JOptionPane.showMessageDialog(null,"Password is not correctly formated please ensure that your username contains atleast 8 characters,a capital letter a number and a special character");
         }
         
         String FIRSTNAME = JOptionPane.showInputDialog (null,"\n\n Enter your First name");
         String LASTNAME= JOptionPane.showInputDialog (null,"\n\n Enter your Last Name");
         
         JOptionPane.showMessageDialog(null,"ACCOUNT\n\n USERNAME:\n "+USERNAME+"\nPASSWORD:\n"+PASSWORD+"\nFIRSTNAME:\n"+FIRSTNAME+"\nLASTNAME:\n"+LASTNAME);
              String Username1 = JOptionPane.showInputDialog("LOGIN\n\nPlease Enter Username");
              String Password1 = JOptionPane.showInputDialog("LOGIN\n\nPlease Enter Password"); 
             if(Username1.equals(USERNAME) && Password1.equals(PASSWORD)){
             JOptionPane.showMessageDialog(null,"LOGIN\n\n Welcome"+" " +FIRSTNAME+ " "+LASTNAME+ " " + "it is great to see you again");
         }
         else{
          JOptionPane.showMessageDialog(null,"LOGIN\n\nUsername or Password Wrong Please Try again");
          }
         
          }}
   
