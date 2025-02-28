package kg.auth_service.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String password;
}
enum Role {
    USER, ADMIN;
}
