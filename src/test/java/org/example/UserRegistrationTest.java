package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    // Test Cases for First Name

    @Test
    void checkFirstName1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        String result = userRegistration.isValidFirstName();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkFirstName2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        String result = userRegistration.isValidFirstName();
        Assertions.assertEquals("SAD", result);
    }

    // Test Cases for Last Name

    @Test
    void checkLastName1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        String result = userRegistration.isValidLastName();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkLastName2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        String result = userRegistration.isValidLastName();
        Assertions.assertEquals("SAD", result);
    }

    // Test Cases for Email

    @Test
    void checkEmail1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        String result = userRegistration.isValidEmail();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkEmail2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        String result = userRegistration.isValidEmail();
        Assertions.assertEquals("SAD", result);
    }

    // Test Cases for Number

    @Test
    void checkNumber1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        String result = userRegistration.isValidNumber();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkNumber2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        String result = userRegistration.isValidNumber();
        Assertions.assertEquals("SAD", result);
    }

    // Test Cases for Password

    @Test
    void checkPassword1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        String result = userRegistration.isValidPassword();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkPassword2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        String result = userRegistration.isValidPassword();
        Assertions.assertEquals("SAD", result);
    }

    // Test Cases for Sample Emails

    @Test
    void checkSampleEmails() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        String result = userRegistration.testEmailValidation();
        Assertions.assertEquals("HAPPY", result);
    }

    // Test Cases for Validate User
    @Test
    void validateUser1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        String result = userRegistration.validateUser();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void validateUser2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com", "91123456790",
                "hellobyee");
        String result = userRegistration.validateUser();
        Assertions.assertEquals("SAD", result);
    }
}