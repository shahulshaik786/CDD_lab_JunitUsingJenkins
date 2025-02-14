package org.example;

public class LoginService {
    // Hardcoded valid credentials
    private static final String VALID_USERNAME = "durga";
    private static final String VALID_PASSWORD = "durga";

    public String login(String username, String password) {
        if (username == null || username.isEmpty()) {
            return "Username is required";
        }
        if (password == null || password.isEmpty()) {
            return "Password is required";
        }
        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}
