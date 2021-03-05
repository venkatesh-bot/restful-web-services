package com.rest.webservices.restfulwebservices.user;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {
    private Integer ID;

    @Size(min = 2, message = "name should have at least 2 characters")
    private String name;

    @Past
    private Date DOB;

    public User() {
    }

    public User(Integer ID, String name, Date DOB) {
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }
}
