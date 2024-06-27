package com.yana.ChawApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Users{

    private @Id
    @GeneratedValue long id;
    private String userName;
    private String course;
    private int year;

    Users(){}
    
    public Users(String userName, String course, int year) {
        this.userName = userName;
        this.course = course;
        this.year = year;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public long getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getCourse() {
        return course;
    }
    public int getYear() {
        return year;
    }
    

}