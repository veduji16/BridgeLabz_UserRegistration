package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;

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
    void checkSampleEmails1(String input) {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com", "91 1234567890",
                "Hellobyee@1");
        String result = userRegistration.isValidEmail();
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
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
    void checkSampleEmails2(String input) {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abcxyzgmail.com", "91123456790",
                "hellobyee");
        String result = userRegistration.isValidEmail();
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
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
