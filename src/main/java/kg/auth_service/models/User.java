package kg.auth_service.models;

import jakarta.persistence.*;
import kg.auth_service.common.Role;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;
    private String number;

    private String password;
    private UUID clientId;

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public UUID getClientId(UUID clientId) {
        return this.clientId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
