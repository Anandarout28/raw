package com.ananda.raw.service;
import org.springframework.stereotype.Service;
import com.ananda.raw.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
