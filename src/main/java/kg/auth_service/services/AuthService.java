package kg.auth_service.services;

import kg.auth_service.models.User;
import kg.auth_service.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(UUID id, String password) {
        Optional<User> user = userRepository.findByIdAndPassword(id, password);
        return user.isPresent();
    }

}
