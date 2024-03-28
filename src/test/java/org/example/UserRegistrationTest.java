package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    // Test Cases for First Name

    @Test
    void checkFirstName1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com");
        String result = userRegistration.isValidFirstName();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkFirstName2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com");
        String result = userRegistration.isValidFirstName();
        Assertions.assertEquals("SAD", result);
    }

    // Test Cases for Last Name

    @Test
    void checkLastName1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com");
        String result = userRegistration.isValidLastName();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkLastName2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com");
        String result = userRegistration.isValidLastName();
        Assertions.assertEquals("SAD", result);
    }

    // Test Cases for Email

    @Test
    void checkEmail1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain", "abc.xyz@gmail.com");
        String result = userRegistration.isValidEmail();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkEmail2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain", "abc.xyzgmail.com");
        String result = userRegistration.isValidEmail();
        Assertions.assertEquals("SAD", result);
    }

}