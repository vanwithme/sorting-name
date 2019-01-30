package com.navri;

import java.util.Comparator;

public class Name {
    private String lastName;
    private String restName;

    public Name() {}

    public Name(String lastName, String restName, String fullName) {
        this.lastName = lastName;
        this.restName = restName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRestName() { return restName; }

    public void setRestName(String restName) { this.restName = restName; }

    public static Comparator<Name> comByLast = new Comparator<>() {
        public int compare(Name one, Name other) {
            return one.lastName.compareTo(other.lastName);
        }
    };

}
