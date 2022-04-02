/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

/**
 *
 * @author Hasib
 */
public class User {
    
    private String username;
    private String password;
    
    public User(String username, String password)
    {
        this.username=username;
        this.password= password;
    }
    
    
    public void show()
    {
        System.out.println("username: "+username+" password: "+password);
    }
    
    
    public String getUsername()
    {
        return username;
    }
    
      public String getPassword()
    {
        return password;
    }
      
}
