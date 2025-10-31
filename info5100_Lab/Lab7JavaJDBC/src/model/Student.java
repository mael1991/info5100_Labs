package model;

import java.io.File;

public class Student {
    private int id;
    private String name;
    private int age; 
    private String college;
    private String continent;
    private String experience;
    private String phone;   // ✅ new field
    private File photo;

    // === Constructor ===
    public Student(){};
    public Student(String name, int age, String college, String continent, String experience, String phone, File photo) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.continent = continent;
        this.experience = experience;
        this.phone = phone;
        this.photo = photo;
    }

    // Getters
    public int getId() { return id ; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCollege() { return college; }
    public String getContinent() { return continent; }
    public String getExperience() { return experience; }
    public String getPhone() { return phone; }
    public File getPhoto() { return photo; }
   // --- Getters and setters ---
   
  

    // === toString ===
    
    @Override
    public String toString() {
        return "Name: " + name +
               "\nAge: " + age +
               "\nCollege: " + college +
               "\nPhone: " + phone +
               "\nContinent: " + continent +
               "\nExperience: " + experience +
               "\nPhoto: " + (photo != null ? photo.getName() : "None");
    }

    

    public void setCollege(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setphone(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setExperience(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setContinent(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAge(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(int id) {
        this.id = id;
          }

    public void setPhone(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}