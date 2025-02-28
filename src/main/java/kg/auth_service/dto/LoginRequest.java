package kg.auth_service.dto;

import java.util.UUID;

public class LoginRequest {
    private String number;
    private String password;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }
}