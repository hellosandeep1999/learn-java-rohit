package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;
import java.util.ArrayList;
public class Contact {

    private final String name;
    private final String email;
    private final String phone;
    Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone: " + phone;
    }
}
