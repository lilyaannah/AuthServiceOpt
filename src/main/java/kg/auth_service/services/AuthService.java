package kg.auth_service.services;

import kg.auth_service.common.Role;
import kg.auth_service.dto.LoginRequest;
import kg.auth_service.models.User;
import kg.auth_service.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(LoginRequest loginRequest) {
        Optional<User> user = userRepository.findByNumber(loginRequest.getNumber());

        // Если пользователь существует и пароль совпадает, возвращаем true
        return user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword());
    }

    public void registerUser(LoginRequest loginRequest) {
        if(authenticate(loginRequest)){
            throw new IllegalArgumentException("Пользователь с таким номером уже зарегистрирован!");
        }
        User user = new User();
        user.setNumber(loginRequest.getNumber());
        user.setPassword(loginRequest.getPassword());
        user.setClientId(loginRequest.getClientId());
        System.out.println("ClientId: " + loginRequest.getClientId());
        user.setRole(Role.USER);
        userRepository.save(user);
    }

}
