package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Custom exception classes
class InvalidFirstNameException extends Exception {
    public InvalidFirstNameException(String message) {
        super(message);
    }
}

class InvalidLastNameException extends Exception {
    public InvalidLastNameException(String message) {
        super(message);
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

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

    public void isValidFirstName() throws InvalidFirstNameException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (!matcher.matches()) {
            throw new InvalidFirstNameException("Invalid first name");
        }
    }

    public void isValidLastName() throws InvalidLastNameException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (!matcher.matches()) {
            throw new InvalidLastNameException("Invalid last name");
        }
    }

    public void isValidEmail() throws InvalidEmailException {
        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailException("Invalid email");
        }
    }

    public void isValidNumber() throws InvalidNumberException {
        String regex = "^([0-9]{2} [0-9]{10})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (!matcher.matches()) {
            throw new InvalidNumberException("Invalid number");
        }
    }

    public void isValidPassword() throws InvalidPasswordException {
        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*?()'])([a-zA-Z0-9])(.{7,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new InvalidPasswordException("Invalid password");
        }
    }

    public String validateUser() {
        try {
            isValidFirstName();
            isValidLastName();
            isValidEmail();
            isValidNumber();
            isValidPassword();
            return "HAPPY";
        } catch (InvalidFirstNameException | InvalidLastNameException | InvalidEmailException | InvalidNumberException
                 | InvalidPasswordException e) {
            return "SAD";
        }
    }
}
