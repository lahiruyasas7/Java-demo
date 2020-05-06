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
public class User {
    
    public String user_name;
    public String Pass_word;
    
    public User(String user_name, String pass_word){
        
        this.user_name = user_name;
        this.Pass_word = pass_word;
    }
    @Override
    
    public String toString(){
        
        return "User Name"+this.user_name+"Pass Word"+this.Pass_word ;
    }
}
