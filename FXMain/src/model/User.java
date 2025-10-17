/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class User {
    private String Name;
    private int Age;
    private String Email;

    public User(String Name, int Age, String Email) {
        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Personal info: \n"
                +"\n name: " + Name
                +"\n age:" + Age 
               +"\n email:" + Email + '}';
    }
    
    
    
    
}
 