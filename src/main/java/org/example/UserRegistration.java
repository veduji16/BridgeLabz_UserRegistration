package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    String firstName;
    String lastName;
    String email;

    UserRegistration(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String isValidFirstName() {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }

    public String isValidLastName() {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }

    public String isValidEmail() {
        String regex = "^([a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
}