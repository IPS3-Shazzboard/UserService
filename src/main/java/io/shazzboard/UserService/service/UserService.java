package io.shazzboard.userservice.service;

import io.shazzboard.userservice.model.User;
import io.shazzboard.userservice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        user.setUuid(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    
}
