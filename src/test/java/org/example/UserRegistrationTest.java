package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    // Test Cases for First Name

    @Test
    void checkFirstName1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain");
        String result = userRegistration.isValidFirstName();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkFirstName2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain");
        String result = userRegistration.isValidFirstName();
        Assertions.assertEquals("SAD", result);
    }

    // Test Cases for Last Name

    @Test
    void checkLastName1() {
        UserRegistration userRegistration = new UserRegistration("Ved", "Jain");
        String result = userRegistration.isValidLastName();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void checkLastName2() {
        UserRegistration userRegistration = new UserRegistration("ved", "jain");
        String result = userRegistration.isValidLastName();
        Assertions.assertEquals("SAD", result);
    }

}