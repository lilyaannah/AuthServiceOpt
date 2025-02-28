package kg.auth_service.dto;

import java.util.UUID;

public class LoginRequest {
    private UUID userId;
    private String password;

    public UUID getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}