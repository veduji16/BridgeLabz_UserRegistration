package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserRegistrationTest {

    // Test Cases for First Name

    @Test
    void checkFirstNameValid() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        try {
            userRegistration.isValidFirstName();
            Assertions.assertEquals("HAPPY", "HAPPY");
        } catch (InvalidFirstNameException e) {
            Assertions.fail("Unexpected InvalidFirstNameException");
        }
    }

    @Test
    void checkFirstNameInvalid() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        try {
            userRegistration.isValidFirstName();
            Assertions.fail("Expected InvalidFirstNameException was not thrown");
        } catch (InvalidFirstNameException e) {
            Assertions.assertEquals("Invalid first name", e.getMessage());
        }
    }

    // Test Cases for Last Name

    @Test
    void checkLastNameValid() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        try {
            userRegistration.isValidLastName();
            Assertions.assertEquals("HAPPY", "HAPPY");
        } catch (InvalidLastNameException e) {
            Assertions.fail("Unexpected InvalidLastNameException");
        }
    }

    @Test
    void checkLastNameInvalid() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        try {
            userRegistration.isValidLastName();
            Assertions.fail("Expected InvalidLastNameException was not thrown");
        } catch (InvalidLastNameException e) {
            Assertions.assertEquals("Invalid last name", e.getMessage());
        }
    }

    // Test Cases for Email

    @Test
    void checkEmailValid() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        try {
            userRegistration.isValidEmail();
            Assertions.assertEquals("HAPPY", "HAPPY");
        } catch (InvalidEmailException e) {
            Assertions.fail("Unexpected InvalidEmailException");
        }
    }

    @Test
    void checkEmailInvalid() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        try {
            userRegistration.isValidEmail();
            Assertions.fail("Expected InvalidEmailException was not thrown");
        } catch (InvalidEmailException e) {
            Assertions.assertEquals("Invalid email", e.getMessage());
        }
    }

    // Test Cases for Number

    @Test
    void checkNumberValid() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        try {
            userRegistration.isValidNumber();
            Assertions.assertEquals("HAPPY", "HAPPY");
        } catch (InvalidNumberException e) {
            Assertions.fail("Unexpected InvalidNumberException");
        }
    }

    @Test
    void checkNumberInvalid() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        try {
            userRegistration.isValidNumber();
            Assertions.fail("Expected InvalidNumberException was not thrown");
        } catch (InvalidNumberException e) {
            Assertions.assertEquals("Invalid number", e.getMessage());
        }
    }

    // Test Cases for Password

    @Test
    void checkPasswordValid() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        try {
            userRegistration.isValidPassword();
            Assertions.assertEquals("HAPPY", "HAPPY");
        } catch (InvalidPasswordException e) {
            Assertions.fail("Unexpected InvalidPasswordException");
        }
    }

    @Test
    void checkPasswordInvalid() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        try {
            userRegistration.isValidPassword();
            Assertions.fail("Expected InvalidPasswordException was not thrown");
        } catch (InvalidPasswordException e) {
            Assertions.assertEquals("Invalid password", e.getMessage());
        }
    }

    // Test Cases for Sample Emails

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com" })
    void checkSampleEmailsValid(String input) {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        try {
            userRegistration.isValidEmail();
            Assertions.assertEquals("HAPPY", "HAPPY");
        } catch (InvalidEmailException e) {
            Assertions.fail("Unexpected InvalidEmailException");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au" })
    void checkSampleEmailsInvalid(String input) {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abcxyzgmail.com", "91123456790",
                "hellobyee");
        try {
            userRegistration.isValidEmail();
            Assertions.fail("Expected InvalidEmailException was not thrown");
        } catch (InvalidEmailException e) {
            Assertions.assertEquals("Invalid email", e.getMessage());
        }
    }

    // Test Cases for Validate User

    @Test
    void validateUserValid() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        Assertions.assertEquals("HAPPY", userRegistration.validateUser());
    }

    @Test
    void validateUserInvalid() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        Assertions.assertEquals("SAD", userRegistration.validateUser());
    }
}