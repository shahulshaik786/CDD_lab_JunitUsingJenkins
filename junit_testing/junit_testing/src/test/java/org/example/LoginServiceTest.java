package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LoginServiceTest {
    private LoginService loginService;

    @BeforeMethod
    public void setUp() {
        loginService = new LoginService(); // Ensure the object is initialized before each test
    }

    @Test
    public void testValidLogin() {
        String result = loginService.login("durga", "durga");
        assertEquals(result, "Login successful", "Valid login should succeed.");
    }

    @Test
    public void testInvalidPassword() {
        String result = loginService.login("durga", "durga");
        assertEquals(result, "Invalid username or password", "Login should fail with an incorrect password.");
    }

    @Test
    public void testInvalidUsername() {
        String result = loginService.login("wronguser", "Valid@123");
        assertEquals(result, "Invalid username or password", "Login should fail with an incorrect username.");
    }

    @Test
    public void testEmptyUsername() {
        String result = loginService.login("", "Valid@123");
        assertEquals(result, "Username is required", "Login should fail when username is empty.");
    }

    @Test
    public void testEmptyPassword() {
        String result = loginService.login("validuser", "");
        assertEquals(result, "Password is required", "Login should fail when password is empty.");
    }

    @Test
    public void testBothFieldsEmpty() {
        String result = loginService.login("", "");
        assertEquals(result, "Username is required", "Login should fail when both fields are empty.");
    }

    @Test
    public void testNullUsername() {
        String result = loginService.login(null, "Valid@123");
        assertEquals(result, "Username is required", "Login should fail when username is null.");
    }

    @Test
    public void testNullPassword() {
        String result = loginService.login("validuser", null);
        assertEquals(result, "Password is required", "Login should fail when password is null.");
    }
}
