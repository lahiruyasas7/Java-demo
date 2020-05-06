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
public class Enroll {
    
    public String first_name;
    public String last_name;
    public String NIC;
    public String phone;
    public String address;
    public String DegreeProgram;
    public int studentID;
    
    
   public Enroll(String first_name, String last_name, String NIC, String phone, String address,String DegreeProgram, int studentID){
       
       this.first_name = first_name;
       this.last_name = last_name;
       this.NIC = NIC;
       this.phone = phone;
       this.address = address;
       this.DegreeProgram = DegreeProgram;
       this.studentID = studentID;
       
       }
   @Override
   
   public String toString(){
       return "Fiest Name"+this.first_name+ "Last Name"+last_name+"NIC"+this.NIC+"Phone Number"+this.phone+"Address"+this.address+"Degree Program"+this.DegreeProgram+"Student ID"+this.studentID;  
   }
   
   
}
