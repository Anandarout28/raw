package com.ananda.raw.service;
import com.ananda.raw.entity.User;
import org.springframework.stereotype.Service;
import com.ananda.raw.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public boolean usernameExists(String username){
        return userRepository.existsByUsername(username);
    }
    public boolean emailExists(String email){
        return userRepository.existsByEmail(email);
    }
    public void userRegistration(String username, String email, String rawPassword){

        if(usernameExists(username) || emailExists(email)){
        throw new IllegalArgumentException("user with Username and email already Exists!!");
    }

    else {
            String passwordHash = passwordEncoder.encode(rawPassword);
        User user = new User(username,email,passwordHash);
            userRepository.save(user);
    }

    }


}
