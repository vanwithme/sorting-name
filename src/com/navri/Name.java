package com.navri;

public class Name {
    String lastName;


    public Name() {}
    public Name(String lastName, String restName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
