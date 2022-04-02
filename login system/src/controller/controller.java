/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.view.User;
import login.system.LoginFrame;

import javax.swing.*;

/**
 *
 * @author Hasib
 */
public class controller {
    User u1;
    
    public static void main(String[] args){
    
        LoginFrame login = new LoginFrame();
              login.setVisible(true);
  }
    
    public void cheklogin(String username,  String password)
    {
        User u1 =new User("admin","1234");
        u1.show();
        if(u1.getUsername().equals(username) && u1.getPassword().equals(password))
        {
           JOptionPane.showMessageDialog(null,"succesfully login");
           //System.out.println("succes!");
           
        }else
        {
            JOptionPane.showMessageDialog(null,"login cant match");
            //System.out.println("failed!");
        }
    }
}