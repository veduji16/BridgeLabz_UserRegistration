package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    String firstName;
    String lastName;
    String email;
    String number;
    String password;

    UserRegistration(String firstName, String lastName, String email, String number, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
        this.password = password;
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

    public String isValidNumber() {
        String regex = "^([0-9]{2} [0-9]{10})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }

    public String isValidPassword() {
        String regex = "^(?=.*[A-Z])([a-zA-Z]{8,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
}