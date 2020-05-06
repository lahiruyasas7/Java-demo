/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author shooter
 */
public class Admin {
    
    public String UserName;
    public String PassWord;
    
    public Admin(String UserName, String PassWord){
        
        this.UserName = UserName;
        this.PassWord = PassWord;
    }
    @Override
    public String toString(){
        
        return "User Name"+this.UserName+"Pass Word"+this.PassWord;
    
    
}
}
